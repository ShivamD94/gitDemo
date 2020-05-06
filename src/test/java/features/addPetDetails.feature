@FDP-463
Feature: Create new prospect

  @FDP-463
  Scenario Outline: Create a pet in platform

    Given User has the valid pet endpoint "AddPetInPlatform"
    When User hit the POST request
      | Key       | Value       |
      | petType   | <petType>   |
      | gender    | <gender>    |
      |identifer  | <identifer> |
      |breedId    |<breedId>    |
      |dateOfBirth|<dateOfBirth>|

    # Then verify the status code as "201"

  Examples:
  |petType |gender | identifer | breedId | dateOfBirth |
  |Dog     |Male   | 101 |   1 | 2030-04-01 |
  |Dog     |Female | 102 |  1   | 2030-04-02|
  |Cat     |Male   | 201 |  2   | 2030-04-03 |
  |Cat     |Female | 202 |  2   |2030-04-04 |


