@FDP-817
Feature: Create new prospect

  @FDP-817 @Positive
  Scenario Outline: Create a prospect in platform for different TYPE and COUNTRY values

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostProspectResponse"
    And User fetches ProspectID and timestamp values
    Given User has the valid endpoint "Prospect-GetProspectbyID"
    When User hit the GET prospect request "valid"
    Then verify the status code as 200

  Examples:
  |type       |country|postalCode|state|email   |status_code|
  |INDIVIDUAL |US     |95005     |PH   |random  |201        |
  |INDIVIDUAL |CAN    |T9S       |AB   |random  |201        |
  |CORPORATE  |US     |95005     |PH   |random  |201        |
  |CORPORATE  |CAN    |T9S       |AB   |random  |201        |


  @FDP-817 @Negative
  Scenario Outline: Create a prospect in platform for different invalid data

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as <status_code>

    Examples:
      |type       |country|postalCode|state|email   |status_code|
      |           |US     |95005     |PH   |random  |400        |
      |INDIVIDUAL |       |95005     |PH   |random  |400        |
      |INDIVIDUAL |US     |95005     |     |random  |400        |
      |INDIVIDUAL |US     |          |PH   |random  |400        |
      |INDIVIDUAL |US     |95005     |PH   |        |400        |
      |INDIVIDUAL |US     |95005     |PH   |123.com |400        |



  @FDP-817 @Negative
  Scenario: Create a prospect in platform with existing emailID

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | US          |
      | postalCode| 95005       |
      | state     | PH          |
      | email     | random      |
    Then verify the status code as 201
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | US          |
      | postalCode| 95005       |
      | state     | PH          |
      | email     | same        |
    Then verify the status code as 400