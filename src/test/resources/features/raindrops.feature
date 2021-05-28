Feature: The generator produces a response based on the parameters passed

  Scenario: Using plingPlangPlong method and passing number that is a factor of 3

    Given I input number 6
    When I run the plingPlangPlong method
    Then The return should be "Pling"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 5

    Given I input number 10
    When I run the plingPlangPlong method
    Then The return should be "Plang"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 7

    Given I input number 14
    When I run the plingPlangPlong method
    Then The return should be "Plong"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 3 and 5

    Given I input number 15
    When I run the plingPlangPlong method
    Then The return should be "PlingPlang"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 3 and 7

    Given I input number 21
    When I run the plingPlangPlong method
    Then The return should be "PlingPlong"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 5 and 7

    Given I input number 35
    When I run the plingPlangPlong method
    Then The return should be "PlangPlong"


  Scenario: Using plingPlangPlong method and passing number that is a factor of 3, 5 and 7

    Given I input number 105
    When I run the plingPlangPlong method
    Then The return should be "PlingPlangPlong"


  Scenario: Using plingPlangPlong method and passing positive number that is not a factor of 3, 5 or 7

    Given I input number 127
    When I run the plingPlangPlong method
    Then The return should be "127"


  Scenario: Using plingPlangPlong method and passing negative number that is not a factor of 3, 5 or 7

    Given I input number -277
    When I run the plingPlangPlong method
    Then The return should be "-277"


  Scenario: Using plingPlangPlong method and passing 0 which doesn't have any factor

    Given I input number 0
    When I run the plingPlangPlong method
    Then The return should be "0"