@FDP-501
Feature: Create new cart

  @FDP-501
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


  @FDP-501 @Positive
  Scenario: Create a cart in platform with valid data

  #### Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
      |customerID|valid|
      |petID     |valid|
      |rateMatrix|valid|
      |quotes    |valid|
    Then verify the status code as 201
    And User validates the jsonSchema with "PostCart"
    And User fetches CartID and timestamp values


  @FDP-501 @Negative
  Scenario Outline: Create a cart in platform with invalid data

  #### Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
    |customerID|<customerID>|
    |petID     |<petID>     |
    |rateMatrix|<rateMatrix>|
    |quotes    |<quotes>    |
    Then verify the status code as 400


    Examples:
      |customerID|petID  |rateMatrix|quotes |
      | invalid  |valid  |valid     |valid  |
      | valid    |invalid|valid     |valid  |
      | valid    |valid  |invalid   |valid  |
      | valid    |valid  |valid     |invalid|
