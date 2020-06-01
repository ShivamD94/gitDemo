  @FDP-178
  Feature: Fetch Prospect details by ID

  @FDP-178 @Positive
  Scenario Outline: Get prospect by PROSPECT ID

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
    | Key       | Value       |
    | type      | <type>      |
    | country   | <country>   |
    | postalCode| <postalCode>|
    | state     | <state>     |
    | email     | <email>     |
    Then verify the status code as <status_code>
    And User fetches ProspectID and timestamp values
    Given User has the valid endpoint "Prospect-GetProspectbyID"
    When User hit the GET prospect request "valid"
    Then verify the status code as 200
    And User validates the jsonSchema with "GetProspectByProspectIDResponse"
    And User verify the get prospect data

    Examples:
    |type       |country|postalCode|state|email   |status_code|
    |INDIVIDUAL |US     |95005     |PH   |random  |201        |

    @FDP-178 @Negative
    Scenario Outline: Get prospect by PROSPECT ID

    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as <status_code>
    And User fetches ProspectID and timestamp values
    Given User has the valid endpoint "Prospect-GetProspectbyID"
    When User hit the GET prospect request "invalid"
    Then verify the status code as 400


    Examples:
    |type       |country|postalCode|state|email   |status_code|
    |INDIVIDUAL |US     |95005     |PH   |random  |201        |
