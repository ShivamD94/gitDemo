@FDP-567
Feature: Update cart for pet


  Background: Prerequisite for update cart
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

    #### Create Cart with above data   ####
    Given User has the valid endpoint "Cart-AddCart"
    When User hit the POST cart request
      |customerID|valid|
      |petID     |valid|
      |rateMatrix|valid|
      |quotes    |valid|
    Then verify the status code as 201
    And User fetches CartID and timestamp values
    ######  Create quote for new pet   #####
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



  @FDP-567 @Positive
  Scenario: Update a cart in platform with valid data

  #### Update Cart with above data   ####
    Given User has the valid endpoint "Cart-UpdateCart"
    When User hit the UPDATE cart request
      |customerID|valid|
      |petID     |valid|
      |rateMatrix|valid|
      |quotes    |valid|
      |cartId    |valid|
    Then verify the status code as 200
    And User validates the jsonSchema with "PostCart"
    And User fetches CartID and timestamp values
    Given User has the valid endpoint "Cart-GetCart"
    When User hit the GET cart request valid
    Then verify the status code as 200
    And User validates the jsonSchema with "GetCart"
    And User validates the get Cart data


  @FDP-567 @Negative
  Scenario Outline: Update a cart in platform with invalid data

  #### Update Cart with above data   ####
    Given User has the valid endpoint "Cart-UpdateCart"
    When User hit the UPDATE cart request
      |customerID|<customerID>|
      |petID     |<petID>     |
      |rateMatrix|<rateMatrix>|
      |quotes    |<quotes>    |
      |cartId    |<cartId>    |
    Then verify the status code as <status_code>
    And verify the error message for <MessageType>
    Examples:
      |customerID|petID  |rateMatrix|quotes |cartId     |status_code|MessageType |
      | abc      |valid  |valid     |valid  |valid      |  400      |Required    |
      |          |valid  |valid     |valid  |valid      |  400      |Required    |
      | valid    |       |valid     |valid  |valid      |  400      |Required    |
      | valid    |valid  |invalid   |valid  |valid      |  400      |Required    |
      | valid    |valid  |valid     |invalid|valid      |  400      |Required    |
      | valid    |valid  |valid     |valid  |abc1234jhro|  404      |path param  |
      | valid    |valid  |valid     |valid  |@$         |  400      |path param  |