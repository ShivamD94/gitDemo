@FDP-819
Feature: Get prospect pet by ID


  Background:Pre requisite Get prospect pet
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

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for DOG and US
    Then verify the status code as 200
    And User fetch the BreedID
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value       |
      | name      | Joe         |
      | type      | DOG         |
      | DOB       | 2020-01-01  |
      | breed     | valid       |
      | prospect  | valid       |
      | postalCode| 95005       |
      | state     | PH          |
      | gender    | MALE        |
    Then verify the status code as 200
    And User fetches PetID and timestamp values

  @FDP-819 @Positive
  Scenario: Get a prospect pet in platform with valid prospectID
    Given User has the valid endpoint "PETPROSPECT-GetProspectPet"
    When User hit the GET prospect-pet request by prospectID
    Then verify the status code as 200
    And User validates the jsonSchema with "GetProspectPetResponse"
    Given User has the valid endpoint "PETPROSPECT-GetProspectPet"
    And User has the valid ProspectID and PetID
    When User hit the GET prospect-pet request by prospectID and petID
    Then verify the status code as 200








