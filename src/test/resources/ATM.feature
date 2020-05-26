Feature: ATM Card feature

  Scenario: Enter currect Pin at ATM

    Given I insert the card in ATM machine
    And I am asked to enter the Pin
    When I enter currect Pin
    Then I should be able to see option to withdraw money
