@FDP-502
Feature: Get Cart

  @FDP-502 @Positive
  Scenario Outline: Get details of a cart created in platform with valid data

  ####   Pre-requisite 1 ---- Create Prospect  ####
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as 201
    And User fetches ProspectID and timestamp values
  ####   Pre-requisite 2 ---- Get Pet Attribute for ProspectPet creation   ####
    Given User has the valid endpoint "Pet-GetPetAttribute"
    When User hit the GET petBreed request for petType
    Then verify the status code as 200
    And User fetch the BreedType and BreedID of <petType> pet
  ####   Pre-requisite 3 ---- Create ProspectPet   ####
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value    |
      | name      | <name>   |
      | type      | <petType>|
      | DOB       | <DOB>    |
      | breed     | <breedID>    |
      | prospect  | <prospectID> |
    Then verify the status code as 201
    And User fetches PetID and timestamp values
  #### Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
      |customerID|<customerID>|
      |petID     |<petID>     |
      |rateMatrix|<rateMatrix>|
      |quotes    |<quotes>    |
    Then verify the status code as 201
    And User fetches CartID and timestamp values
  ####  Validate Get Cart   ####
    Given User has the valid endpoint "Cart-GetCart"
    When User hit the GET cart request <getEmail>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetCart"
    And User validates the get Cart data

    Examples:
      |type       |country|postalCode|state|email   |status_code|name        |petType|DOB       |breedID|prospectID|getEmail         |customerID|petID|rateMatrix|quotes|
      |INDIVIDUAL |USA    |95005     |PH   |random  |200        |Martin      |dog    |2020-01-01|valid  |valid     |valid            |valid     |valid|valid     |valid |
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|valid  |valid     |ritesh123@gl.com |valid     |valid|valid     |valid |

  @FDP-502 @Negative
  Scenario Outline: Get details of a cart created in platform with invalid data

  ####   Pre-requisite 1 ---- Create Prospect  ####
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | <type>      |
      | country   | <country>   |
      | postalCode| <postalCode>|
      | state     | <state>     |
      | email     | <email>     |
    Then verify the status code as 201
    And User fetches ProspectID and timestamp values
  ####   Pre-requisite 2 ---- Get Pet Attribute for ProspectPet creation   ####
    Given User has the valid endpoint "Pet-GetPetAttribute"
    When User hit the GET petBreed request for petType
    Then verify the status code as 200
    And User fetch the BreedType and BreedID of <petType> pet
  ####   Pre-requisite 3 ---- Create ProspectPet   ####
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value    |
      | name      | <name>   |
      | type      | <petType>|
      | DOB       | <DOB>    |
      | breed     | <breedID>    |
      | prospect  | <prospectID> |
    Then verify the status code as 201
    And User fetches PetID and timestamp values
  #### Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
      |customerID|<customerID>|
      |petID     |<petID>     |
      |rateMatrix|<rateMatrix>|
      |quotes    |<quotes>    |
    Then verify the status code as 201
    And User fetches CartID and timestamp values
  ####  Validate Get Cart   ####
    Given User has the valid endpoint "Cart-GetCart"
    When User hit the GET cart request <getEmail>
    Then verify the status code as <status_code>


    Examples:
      |type       |country|postalCode|state|email   |status_code|name        |petType|DOB       |breedID|prospectID|getEmail         |customerID|petID|rateMatrix|quotes|
      |INDIVIDUAL |USA    |95005     |PH   |random  |400        |Martin      |dog    |2020-01-01|valid  |valid     |ritesh123@gl.com |valid     |valid|valid     |valid |

