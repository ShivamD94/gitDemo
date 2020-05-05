@FDP-176
Feature: Create new prospect

  @FDP-176
  Scenario Outline: Create a prospect in platform for type INDIVIDUAL and country USA

    Given User has the valid prospect endpoint "AddProspect"
    When User hit the POST request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |

  Examples:
  |type       |country|postalCode|state|
  |INDIVIDUAL |USA    |95005     |PH   |
  |INDIVIDUAL |CANADA |T9S       |AB   |
  |CORPORATE  |USA    |95005     |PH   |
  |CORPORATE  |CANADA |T9S       |AB   |


#    Then verify the status code as "201"
#    And User fetches the below information
#      |  Key                 |
#      | _id                  |
#      | _createdTimestamp    |

