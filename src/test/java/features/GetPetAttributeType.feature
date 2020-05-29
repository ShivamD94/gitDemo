@FDP-255
Feature: Get Pet details by Attribute type

  @FDP-255 @Positive @Ignore
  Scenario Outline: Get Pet details by Attribute type

    Given User has the valid endpoint "Pet-GetPetAttribute"
    When User hit the GET petBreed request for <type>
    Then verify the status code as <status_code>
    And User validates the jsonSchema with "GetPetAttributeType"

    Examples:
    |type                |status_code|
    |petType             |  200      |
    |Age                 |  200      |
    |type                |  400      |
    |breed,Mixed,age,2   |  400      |





