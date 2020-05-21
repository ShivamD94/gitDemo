@FDP-179
Feature: Get prospect

  @FDP-179 @Positive
  Scenario Outline: Get a prospect in platform with valid email

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
    When User hit the GET prospect by email request <emailId>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetProspectByProspectIDResponse"
    And User validates the data fetched

  Examples:
  |type       |country|postalCode|state|email   |status_code|  emailId|
  |INDIVIDUAL |USA    |95005     |PH   |random  |200        |  valid |


  @FDP-179 @Negative
  Scenario Outline: Get a prospect in platform with invalid/null email

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
    When User hit the GET prospect by email request <emailId>
    Then verify the status code as <status_code>


    Examples:
      |type       |country|postalCode|state|email   |status_code|emailId|
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |invalid |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |null    |




