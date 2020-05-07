@FDP-176
Feature: Create new prospect

  @FDP-176 @Positive
  Scenario Outline: Create a prospect in platform for different TYPE and COUNTRY values

    Given User has the valid prospect endpoint "AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as <status_code>
    And User fetches ProspectID and timestamp values
    Given User has the valid prospect endpoint "GetProspectbyID"
    When User hit the GET prospect request
    Then verify the status code as <status_code>

  Examples:
  |type       |country|postalCode|state|email   |status_code|
  |INDIVIDUAL |USA    |95005     |PH   |random  |201        |
  |INDIVIDUAL |CANADA |T9S       |AB   |random  |201        |
  |CORPORATE  |USA    |95005     |PH   |random  |201        |
  |CORPORATE  |CANADA |T9S       |AB   |random  |201        |


  @FDP-176 @Negative
  Scenario Outline: Create a prospect in platform for different invalid data

    Given User has the valid prospect endpoint "AddProspect"
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
      |           |USA    |95005     |PH   |random  |400        |
      |INDIVIDUAL |       |95005     |PH   |random  |400        |
      |INDIVIDUAL |USA    |95005     |     |random  |400        |
      |INDIVIDUAL |USA    |          |PH   |random  |400        |
      |INDIVIDUAL |USA    |95005     |PH   |        |400        |
      |INDIVIDUAL |USA    |95005     |PH   |123.com |400        |



  @FDP-176 @Negative
  Scenario: Create a prospect in platform with existing emailID

    Given User has the valid prospect endpoint "AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | USA         |
      | postalCode| 95005       |
      | state     | PH          |
      | email     |testemail@pet.com|
    Then verify the status code as "201"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | USA         |
      | postalCode| 95005       |
      | state     | PH          |
      | email     |testemail@pet.com|
    Then verify the status code as "400"


  @FDP-178
  Scenario Outline: Create a prospect in platform for different TYPE and COUNTRY values

    Given User has the valid prospect endpoint "AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then User fetches ProspectID and timestamp values

    Given User has the existing prospect
    When User hit the "GetProspectbyID" prospect
    Then Verify the detail from payload response
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |

    Examples:
      |type       |country|postalCode|state|email   |status_code|
      |INDIVIDUAL |USA    |95005     |PH   |random  |201        |
      |INDIVIDUAL |CANADA |T9S       |AB   |random  |201        |
      |CORPORATE  |USA    |95005     |PH   |random  |201        |
      |CORPORATE  |CANADA |T9S       |AB   |random  |201        |


