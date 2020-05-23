@FDP-502
Feature: Get Cart
#### Pre requisite - Run create cart @FDP-501

  Background: Pre requisite for get cart
     ######  Create quote   #####
    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value        |
      | email      | random       |
      | pettype    | DOG          |
      | breedid    | 3JQT5U05     |
      | gender     | MALE         |
      | state      | PA           |
      | zip        | 19073        |
      | countrycode| US           |
    Then verify the status code as 200
    And User fetches QuoteID value

  #### Create Cart with above data   ####
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


