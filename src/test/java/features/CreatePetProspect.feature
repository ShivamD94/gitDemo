@FDP-397
Feature: Create new pet prospect

  @FDP-397 @Positive
  Scenario Outline: Create a pet corresponding to a prospect in platform

    Given User has the valid endpoint "GetPetType"
    When User hit the GET petBreed request
    Then verify the status code as "201"
    And User fetch the BreedType and BreedID of the pet

    Given User has the valid endpoint "PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value    |
      | type      | <name>   |
      | country   | <type>   |
      | state     | <DOB>    |


    Examples:
      |name        |type|DOB|
      |Martin      |dog |12-12-2016|
