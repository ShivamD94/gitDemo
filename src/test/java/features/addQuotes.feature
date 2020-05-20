@FDP-352 @FDP-358
Feature: Create quote with customer and pet

  @FDP-352 @FDP-358 @Positive
  Scenario Outline: Create a quote along with customer and pet

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value        |
      | email      | <email>      |
      | pettype    | <pettype>    |
      | breedid    | <breedid>    |
      | gender     | <gender>     |
      | state      | <state>      |
      | zip        | <zip>        |
      | countrycode| <countrycode>|
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostQuoteResponse"
    And User fetches QuoteID value

    Examples:
      | email  | pettype |breedid |gender| state | zip    |countrycode | status_code|
      | random | dog     | 123abc | male | PH    | 95055  |  USA       | 201        |
