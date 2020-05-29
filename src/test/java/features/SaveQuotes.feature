@FDP-776
Feature: Save quote

  Background: Pre requisite for save quote

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value   |
      | email      | random  |
      | pettype    | DOG     |
      | breedid    | 3JQT5U05|
      | gender     | MALE    |
      | state      | PA      |
      | zip        | 19073   |
      | countrycode| US      |
    Then verify the status code as 200

  @FDP-776  @Positive
  Scenario: Save quotes with valid information

    Given User has the valid endpoint "Quote-SaveQuote"
    When User hit the POST aggregate quote request
    Then verify the status code as 201
    And User validates the jsonSchema with "SaveCartResponse"
    And User fetches AggregateQuoteID value


