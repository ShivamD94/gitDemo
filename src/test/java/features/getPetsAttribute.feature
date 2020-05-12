@FDP-353
    Feature: Get the pets details Dogs and Cats
@FDP-353 @Positive
    Scenario: Get the existing Pet Details of Dogs and Cats

        Given User has the valid pet endpoint "GetPetAttributes"
        When User hit the GET request
        Then verify the status code as "201"


@FDP-353 @Negative
    Scenario: Get the non-existing Pet Details of Dogs and Cats

        Given User has the valid pet endpoint "GetPetAttributes"
        When User hit the GET request
        Then verify the status code as "401"