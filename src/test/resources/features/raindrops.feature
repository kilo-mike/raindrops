Feature: Checking if raindrops app works correctly
  Scenario: Given number that is a factor of 3
    Given I input number 9
    When I run the plingPlangPlong method
    Then The return should be "Pling"
