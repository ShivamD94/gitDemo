@FDP-776
Feature: Save quote

  Background: Pre requisite for save quote

    Given User has the valid endpoint "Quote-AddQuote"
    When User hit the POST quote request
      | Key        | Value   |
      | email      | random  |
      | pettype    | DOG     |
      | breedid    | 3JQT5U05|
      | gender     | MALE    |
      | state      | PA      |
      | zip        | 19073   |
      | countrycode| US      |
    Then verify the status code as 200

  @FDP-776  @Positive
  Scenario: Save quotes with valid information

    Given User has the valid endpoint "Quote-SaveQuote"
    When User hit the POST aggregate quote request
    Then verify the status code as 201
    And User validates the jsonSchema with "SaveQuoteResponse"
    And User fetches AggregateQuoteID value


  @FDP-776  @Negative
  Scenario Outline: Save quotes with invalid non mandatory fields information

    Given User has the valid endpoint "Quote-SaveQuote"
    When User hit the POST aggregate quote request with invalid data
      |petActualDob            |<petActualDob>            |
      |petSuggestedDob         |<petSuggestedDob>         |
      |breedId                 |<breedId>                 |
      |gender                  |<gender>                  |
      |state                   |<state>                   |
      |country                 |<country>                 |
      |zip                     |<zip>                     |
      |petName                 |<petName>                 |
      |customerId              |<customerId>              |
      |petId                   |<petId>                   |
      |quoteId                 |<quoteId>                 |
      |priceAffinityType       |<priceAffinityType>       |
      |deductibleType          |<deductibleType>          |
      |annualPolicyMaximumLimit|<annualPolicyMaximumLimit>|
      |premium                 |<premium>                 |
      |taxAndPremium           |<taxAndPremium>           |
      |petAge                  |<petAge>                  |
      |petWeightUnit           |<petWeightUnit>           |
      |petWeight               |<petWeight>               |
    Then verify the status code as 201

    Examples:
    |petActualDob|petSuggestedDob|petName|breedId|gender|state|country|zip |customerId|petId|quoteId|priceAffinityType|deductibleType|annualPolicyMaximumLimit|premium|taxAndPremium|petAge|petWeightUnit|petWeight|
    |  null      |  null         |null   | null  |null  | null| null  |null|valid     |valid|valid  |valid            |valid         |valid                   |valid  |valid        |valid |valid        |valid    |


  @FDP-776  @Negative
  Scenario Outline: Save quotes with invalid mandatory fields information

    Given User has the valid endpoint "Quote-SaveQuote"
    When User hit the POST aggregate quote request with invalid data
      |petActualDob            |<petActualDob>            |
      |petSuggestedDob         |<petSuggestedDob>         |
      |breedId                 |<breedId>                 |
      |gender                  |<gender>                  |
      |state                   |<state>                   |
      |country                 |<country>                 |
      |zip                     |<zip>                     |
      |petName                 |<petName>                 |
      |customerId              |<customerId>              |
      |petId                   |<petId>                   |
      |quoteId                 |<quoteId>                 |
      |priceAffinityType       |<priceAffinityType>       |
      |deductibleType          |<deductibleType>          |
      |annualPolicyMaximumLimit|<annualPolicyMaximumLimit>|
      |premium                 |<premium>                 |
      |taxAndPremium           |<taxAndPremium>           |
      |petAge                  |<petAge>                  |
      |petWeightUnit           |<petWeightUnit>           |
      |petWeight               |<petWeight>               |

    Then verify the status code as 400

    Examples:
      |petActualDob|petSuggestedDob|petName|breedId|gender|state|country|zip |customerId|petId|quoteId|priceAffinityType|deductibleType|annualPolicyMaximumLimit|premium|taxAndPremium|petAge|petWeightUnit|petWeight|
      |            |               |       |       |      |     |       |    |          |valid|valid  |valid            |valid         |valid                   |valid  |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |     |valid  |valid            |valid         |valid                   |valid  |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|       |valid            |valid         |valid                   |valid  |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |                 |valid         |valid                   |valid  |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |              |valid                   |valid  |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |valid         |valid                   |       |valid        |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |valid         |valid                   |valid  |             |valid |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |valid         |valid                   |valid  |valid        |      |valid        |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |valid         |valid                   |valid  |valid        |valid |             |valid    |
      |            |               |       |       |      |     |       |    | valid    |valid|valid  |valid            |valid         |valid                   |valid  |valid        |valid |valid        |         |



