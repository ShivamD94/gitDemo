@FDP-463
Feature: Create new pet

  @FDP-463 @Positive
  Scenario Outline: Create a pet in platform

    Given User has the valid pet endpoint "AddPetInPlatform"
    When User hit the POST request
      | Key       | Value       |
      | petType   | <petType>   |
      |identifer  | <identifer> |
      |breedId    |<breedId>    |
      |dateOfBirth|<dateOfBirth>|
      | gender    | <gender>    |
   Then verify the status code as <status_code>
  Examples:
  |petType |identifer | breedId | dateOfBirth | gender | status_code |
  |Dog     |101       |    1    | 2030-04-01  |  Male  |    201      |
  |Dog     |102       |    1    | 2030-04-02  |  Female|    201      |
  |Cat     |201       |    2    | 2030-04-03  |  Male  |    201      |
  |Cat     |202       |    2    |2030-04-04   |  Female|    201      |

   @FDP-463 @Negative
    Scenario Outline: Create a pet in platform with invalid data

      Given User has the valid pet endpoint "AddPetInPlatform"
      When User hit the POST request
        | Key       | Value       |
        | petType   | <petType>   |
        |identifer  | <identifer> |
        |breedId    |<breedId>    |
        |dateOfBirth|<dateOfBirth>|
        | gender    | <gender>    |
      Then verify the status code as <status_code>
    Examples:
    |petType |identifer | breedId | dateOfBirth | gender | status_code |
    |        |101       |    1    | 2030-04-01  |  Male  | 400         |
    |Dog     |          |    1    | 2030-04-02  |  Female| 400         |
    |Cat     |201       |         | 2030-04-03  |  Male  | 400         |
    |Cat     |202       |    2    | 233444      |        | 400         |