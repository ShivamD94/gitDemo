@FDP-464
Feature: Validate given zip code

  @FDP-464 @Positive
  Scenario Outline: Get Validated zip
    Given User has the valid endpoint "LOOKUP-zipCode"
    When User hit the GET lookup service request "valid"
      | Key     | Value  |
      | zipcode | <zipcode>|
      | country | <country> |
    Then verify the status code as 200
#    And User validates the jsonSchema with "GetZipCodeResponse"
    And User verify the get response data
      | state |
      | AK |
      | AZ |

    Examples:
      | zipcode | country |
      | 99501 | USA |
      | 85001 | USA |
