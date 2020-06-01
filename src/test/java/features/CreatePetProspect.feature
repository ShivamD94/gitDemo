@FDP-816
Feature: Create new prospect pet

  Background:Pre requisite for create prospect pet
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | US          |
      | postalCode| 95005       |
      | state     | PH          |
      | email     | random      |
    Then verify the status code as 201
    And User fetches ProspectID and timestamp values


  @FDP-816 @Positive
    Scenario Outline: Create a prospect pet with valid data

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for <petType> and <country>
    Then verify the status code as 200
    And User fetch the BreedID
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value       |
      | name      | <name>      |
      | type      | <petType>   |
      | DOB       | <DOB>       |
      | breed     | <breedID>   |
      | prospect  | <prospectID>|
      | postalCode| <postalCode>|
      | state     | <state>     |
      | gender    | <gender>    |
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostPetProspectResponse"
    And User fetches PetID and timestamp values

    Examples:
     |country|postalCode|state|status_code|name        |petType|DOB       |breedID|prospectID|gender|
     |US     |95005     |PH   |200        |Martin      |DOG    |2020-01-01|valid  |valid     |MALE  |
     |US     |95005     |PH   |200        |Martin      |CAT    |2020-01-01|valid  |valid     |FEMALE|

  @FDP-816 @Negative
  Scenario Outline: Create a prospect pet with invalid data

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for DOG and <country>
    Then verify the status code as 200
    And User fetch the BreedID
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value        |
      | name      | <name>       |
      | type      | <petType>    |
      | DOB       | <DOB>        |
      | breed     | <breedID>    |
      | prospect  | <prospectID> |
      | postalCode| <postalCode> |
      | state     | <state>      |
      | gender    | <gender>     |
    Then verify the status code as <status_code>


    Examples:
      |country|postalCode|state|status_code|name        |petType|DOB       |breedID|prospectID|gender|
      |US     |95005     |PH   |400        |            |DOG    |2020-01-01|valid  |valid     |MALE  |
      |US     |95005     |PH   |400        |Martin      |RAT    |2020-01-01|valid  |valid     |MALE  |
      |US     |95005     |PH   |400        |Martin      |DOG    |          |valid  |valid     |MALE  |
      |US     |95005     |PH   |400        |Martin      |DOG    |2020-13-13|valid  |valid     |MALE  |

      |US     |95005     |PH   |400        |Martin      |DOG    |2020-01-01|null   |valid     |MALE  |
      |US     |95005     |PH   |400        |Martin      |DOG    |2020-01-01|valid  |null      |MALE  |
      |US     |95005     |PH   |400        |Martin      |DOG    |2020-01-01|valid  |valid     |female|

      |US     |          |PH   |400        |Martin      |DOG    |2020-01-01|valid  |valid     |MALE  |
      |US     |95005     |     |400        |Martin      |DOG    |2020-01-01|valid  |valid     |MALE  |
