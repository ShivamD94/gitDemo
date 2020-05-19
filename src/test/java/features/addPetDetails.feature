@FDP-463
Feature: Create new pet

  @FDP-463 @Positive
  Scenario Outline: Create a pet in platform

    Given User has the valid endpoint "Pet-AddPetInPlatform"
    When User hit the POST request
      | Key       | Value       |
      | petType   | <petType>   |
      |breedId    |<breedId>    |
      |dateOfBirth|<dateOfBirth>|
      | gender    | <gender>    |

    And User fetches petIdentiferID, petName values
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostPetResponse"

  Examples:
  |petType | breedId| dateOfBirth | gender | status_code |
  |Dog     |   1    | 2030-04-01  |  MALE  |    201      |
  |Dog     |   1    | 2030-04-02  |  FEMALE|    201      |
  |Cat     |   2    | 2030-04-03  |  MALE  |    201      |
  |Cat     |   2    | 2030-04-04  |  FEMALE|    201      |

   @FDP-463 @Negative
    Scenario Outline: Create a pet in platform with invalid data

      Given User has the valid endpoint "Pet-AddPetInPlatform"
      When User hit the POST request
        | Key       | Value       |
        | petType   | <petType>   |
        |breedId    |<breedId>    |
        |dateOfBirth|<dateOfBirth>|
        | gender    | <gender>    |

      Then verify the status code as <status_code>

    Examples:
    |petType |breedId| dateOfBirth | gender | status_code |
    |        |  1    | 2030-04-01  |  MALE  | 400         |
    |Dog     |  1    | 2030-04-02  |  FEMALE| 400         |
    |Cat     |       | 2030-04-03  |  MALE  | 400         |
    |Cat     |  2    | 233444      |        | 400         |