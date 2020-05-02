Feature: get pet details


  Scenario: Add pet details in
    Given pets add endpoints available
    When user call endpoint and post
    Then Verify added pets status

  Scenario: Verify if pet details are exist
    Given get pets info
    When user call endpoint and get
    Then Verify status

#Examples:
#| endpoint   | method |
#| GetPet     | Get  |