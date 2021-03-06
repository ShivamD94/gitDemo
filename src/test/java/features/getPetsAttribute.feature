@FDP-353
    Feature: Get the pets details Dogs and Cats
@FDP-353 @Positive @Ignore
    Scenario: Get the existing Pet Details of Dogs and Cats

        Given User has the valid endpoint "Pet-GetPetAttribute"
        When User hit the GET request
        Then verify the status code as 201
        And User validates the jsonSchema with "GetPetAttribute"


@FDP-353 @Negative
    Scenario: Get the non-existing Pet Details of Dogs and Cats

        Given User has the valid endpoint "Pet-GetPetAttribute"
        When User hit the GET request
        Then verify the status code as 401