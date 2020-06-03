@FDP-352 @FDP-358 @FDP-895
Feature: Create quote with customer and pet

  Background:Pre requisite for create quote
  ##### Create prospect  ######
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
  ##### Create prospect pet ######
    Given User has the valid endpoint "PetProspect-PostPetProspect"
    When User hit the POST petProspect request
      | Key       | Value       |
      | name      | Martin      |
      | type      | DOG         |
      | DOB       | 2020-01-01  |
      | breed     | 3JQT5U05    |
      | prospect  | valid       |
      | postalCode| 95005       |
      | state     | PH          |
      | gender    | MALE        |
    Then verify the status code as 200
    And User fetches PetID and timestamp values


  @FDP-352 @FDP-358 @FDP-895 @Positive
  Scenario Outline: Create a quote for new/existing customers

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value        |
      |customerId  |<customerId>  |
      | email      | <email>      |
      | pettype    | <pettype>    |
      | breedid    | <breedid>    |
      | gender     | <gender>     |
      | state      | <state>      |
      | zip        | <zip>        |
      | countrycode| <countrycode>|
      |petId       | <petId>      |
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostQuoteResponse"
    And User fetches QuoteID value
    Given User has the valid endpoint "Prospect-AddProspect"
    When User hit the GET prospect by email request valid
    Then verify the status code as <status_code>
    And User verify the get prospect data

    Examples:
      | email        | pettype |breedid   |gender| state | zip    |countrycode | status_code|customerId|petId|
      | random       | DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 200        |          |valid|
      |              | DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 200        | valid    |valid|

  @FDP-352 @FDP-358 @FDP-895 @Positive
  Scenario Outline: Create a quote for new/existing prospect pet

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value        |
      |customerId  |<customerId>  |
      | email      | <email>      |
      | pettype    | <pettype>    |
      | breedid    | <breedid>    |
      | gender     | <gender>     |
      | state      | <state>      |
      | zip        | <zip>        |
      | countrycode| <countrycode>|
      | petId      | <petId>      |
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "PostQuoteResponse"
    And User fetches QuoteID value
    Given User has the valid endpoint "PETPROSPECT-GetProspectPet"
    And User has the valid ProspectID and PetID
    When User hit the GET prospect-pet request by prospectID and petID
    Then verify the status code as 200
    And User verify the get prospect pet data

    Examples:
      | email        | pettype |breedid   |gender| state | zip    |countrycode | status_code|customerId|petId|
      |              | DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 200        | valid    |     |
      |              | DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 200        | valid    |valid|


  @FDP-352 @FDP-358 @FDP-895 @Negative
  Scenario Outline: Create a quote for invalid customer id/email id

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value        |
      |customerId  |<customerId>  |
      | email      | <email>      |
      | pettype    | <pettype>    |
      | breedid    | <breedid>    |
      | gender     | <gender>     |
      | state      | <state>      |
      | zip        | <zip>        |
      | countrycode| <countrycode>|
      |petId       | <petId>      |
    Then verify the status code as <status_code>
    And verify the error message for <MessageType>


    Examples:
      | email        | pettype |breedid   |gender| state | zip    |countrycode | status_code|customerId|petId|MessageType  |
      | random       | DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 404        | cust123  |valid|No data found|
      | abc@gmail.com| DOG     | 3JQT5U05 | MALE | PA    | 19073  |  US        | 400        | valid    |valid|Bad data     |
