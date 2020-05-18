@FDP-544
Feature: Get Pet details by Attribute type

  @FDP-544 @Positive
  Scenario Outline: Get Pet Breed by Pet type

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for <type>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetPetBreed"

    Examples:
    |type            |status_code|
    |DOG             |  200      |
    |CAT             |  200      |

  @FDP-544 @Negative
  Scenario Outline: Get Pet Breed for invalid pet type

    Given User has the valid endpoint "Pet-GetPetBreed"
    When User hit the GET pet Breed data request for <type>
    Then verify the status code as <status_code>

    Examples:
      |type            |status_code|
      |RAT             |  400      |







