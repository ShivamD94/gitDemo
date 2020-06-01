@FDP-544
Feature: Get Pet details by Attribute type

  @FDP-544 @Positive
  Scenario Outline: Get Pet Breed by Pet type and country code

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for <type> and <country>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetPetBreed"

    Examples:
    |type|country     |status_code|
    |DOG |US          |  200      |
    |DOG |CAN         |  200      |
    |CAT |US          |  200      |
    |CAT |CAN         |  200      |

  @FDP-544 @Negative
  Scenario Outline: Get Pet Breed for invalid pet type and country code

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for <type> and <country>
    Then verify the status code as <status_code>

    Examples:
      |type|country     |status_code|
      |RAT |US          |  400      |
      |DOG |IND         |  400      |







