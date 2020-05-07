Feature: Fetching pet detail by Attrubute type

  Scenario:Verfiy pet details by attribute breed

Given User has existing endpoint '/v1/pets/attributes/{PetType}'
When User hit the GET petBreed request
Then Verify Breed details and status code as 201

  Scenario:Verfiy pet details by attribute Age

    Given User has existing endpoint '/v1/pets/attributes/{PetType}'
    When User hit the GET petAge request
    Then Verify Breed details and status code as 201