@FDP-502
Feature: Get Cart

  @FDP-502
  Background: Prerequisite for create cart

    ####   Pre-requisite 1 ---- Create Prospect  ####
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the POST prospect request
      | Key       | Value       |
      | type      | INDIVIDUAL  |
      | country   | USA         |
      | postalCode| 95005       |
      | state     | PH          |
      | email     | random      |
    Then verify the status code as 201
    And User fetches ProspectID and timestamp values
  ####   Pre-requisite 2 ---- Get Pet Attribute for ProspectPet creation   ####
    Given User has the valid endpoint "Pet-GetPetAttribute"
    When User hit the GET petBreed request for petType
    Then verify the status code as 200
    And User fetch the BreedType and BreedID of dog pet
  ####   Pre-requisite 3 ---- Create ProspectPet   ####
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value     |
      | name      | Bruno     |
      | type      | dog       |
      | DOB       | 2020-01-01|
      | breed     | valid     |
      | prospect  | valid     |
    Then verify the status code as 201
    And User fetches PetID and timestamp values
  ####   Pre-requisite 4 ----  Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
      |customerID|valid|
      |petID     |valid|
      |rateMatrix|valid|
      |quotes    |valid|
    Then verify the status code as 201
    And User fetches CartID and timestamp values


  @FDP-502 @Positive
  Scenario: Get details of a cart created in platform with valid data

  ####  Validate Get Cart   ####
    Given User has the valid endpoint "Cart-GetCart"
    When User hit the GET cart request valid
    Then verify the status code as 200
    And User validates the jsonSchema with "GetCart"
    And User validates the get Cart data


  @FDP-502 @Negative
  Scenario: Get details of a cart created in platform with invalid data

  ####  Validate Get Cart   ####
    Given User has the valid endpoint "Cart-GetCart"
    When User hit the GET cart request ritesh123@gl.com
    Then verify the status code as 400


