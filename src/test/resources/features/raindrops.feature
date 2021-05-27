Feature: Checking if raindrops app works correctly

  Scenario: Given number that is a factor of 3
    Given I input number 9
    When I run the plingPlangPlong method
    Then The return should be "Pling"

  Scenario: Given number that is a factor of 5
    Given I input number 10
    When I run the plingPlangPlong method
    Then The return should be "Plang"

  Scenario: Given number that is a factor of 7
    Given I input number 14
    When I run the plingPlangPlong method
    Then The return should be "Plong"
