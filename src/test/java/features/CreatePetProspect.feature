@FDP-397
Feature: Create new pet prospect

  @FDP-397 @Positive
  Scenario Outline: Create a pet corresponding to a prospect in platform

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
    Given User has the valid endpoint "Pet-GetPetType"
    When User hit the GET petBreed request for "{petType}"
    Then verify the status code as <status_code>
    And User fetch the BreedType and BreedID of the pet

    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value    |
      | name      | <name>   |
      | type      | <petType>|
      | DOB       | <DOB>    |
      | breed     | <breedID>    |
      | prospect  | <prospectID> |
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostPetProspectResponse"
    And User fetches PetID and timestamp values

    Examples:
      |type       |country|postalCode|state|email   |status_code|name        |petType|DOB       |breedID|prospectID|
      |INDIVIDUAL |USA    |95005     |PH   |random  |200        |Martin      |dog    |2020-01-01|valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |201        |Martin      |cat    |2020-01-01|valid  |valid     |

  @FDP-397 @Negative
  Scenario Outline: Create a pet corresponding to a prospect in platform

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
    Given User has the valid endpoint "Pet-GetPetType"
    When User hit the GET petBreed request for "{petType}"
    Then verify the status code as <status_code>
    And User fetch the BreedType and BreedID of the pet

    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value        |
      | type      | <name>       |
      | country   | <petType>    |
      | DOB       | <DOB>        |
      | breed     | <breedID>    |
      | prospect  | <prospectID> |
    Then verify the status code as <status_code>

    Examples:
      |type       |country|postalCode|state|email   |status_code|name        |petType|DOB       |breedID|prospectID|
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |            |dog    |2020-01-01|valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |!@          |dog    |2020-01-01|valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |       |2020-01-01|valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |rat    |2020-01-01|valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |          |valid  |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-13-13|valid  |valid     |

      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|null   |valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|invalid|valid     |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|valid  |null      |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|valid  |invalid   |
