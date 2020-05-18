@FDP-179
Feature: Create new prospect

  @FDP-179 @Positive @Negative
  Scenario Outline: Create a prospect in platform for different TYPE and COUNTRY values

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as 201
    And User fetches ProspectID and timestamp values
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the GET prospect by email request <IdType>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetProspectByProspectIDResponse"

  Examples:
  |type       |country|postalCode|state|email   |status_code|  IdType|
  |INDIVIDUAL |USA    |95005     |PH   |random  |200        |  valid |
  |INDIVIDUAL |USA    |95005     |PH   |random  |400        |invalid |



