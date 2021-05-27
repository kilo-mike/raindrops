Feature: Checking if raindrops app works correctly

  Scenario: Given number that is a factor of 3

    Given I input number 6
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


  Scenario: Given number that is a factor of 3 and 5

    Given I input number 15
    When I run the plingPlangPlong method
    Then The return should be "PlingPlang"


  Scenario: Given number that is a factor of 3 and 7

    Given I input number 21
    When I run the plingPlangPlong method
    Then The return should be "PlingPlong"


  Scenario: Given number that is a factor of 5 and 7

    Given I input number 35
    When I run the plingPlangPlong method
    Then The return should be "PlangPlong"


  Scenario: Given number that is a factor of 3, 5 and 7

    Given I input number 105
    When I run the plingPlangPlong method
    Then The return should be "PlingPlangPlong"


  Scenario: Given positive number that is not a factor of 3, 5 or 7

    Given I input number 127
    When I run the plingPlangPlong method
    Then The return should be "127"


  Scenario: Given negative number that is not a factor of 3, 5 or 7

    Given I input number -277
    When I run the plingPlangPlong method
    Then The return should be "-277"


  Scenario: Given 0 which doesn't have any factor

    Given I input number 0
    When I run the plingPlangPlong method
    Then The return should be "0"