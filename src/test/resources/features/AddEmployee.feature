Feature: Adding employee in HRMS application
  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user clicks on PIM option
    And user clicks on add employee button

  @test
  Scenario: adding one employee
    When user enters firstname and lastname
    And user clicks on save button
    Then employee added successfully
    @sample
    Scenario: Adding one employee from feature file
      When user enters "Yana" and "Brandon" and "Wallace"
      And user clicks on save button
      Then employee added successfully

      @outline
      Scenario Outline: addingmultiple employees using scenario outline
        When user enters "<firstName>" and "<middleName>" and "<lastname>" in data driven format
        And user clicks on save button
        Then employee added successfully
        Examples:
          |firstName|middleName|lastname|
          |Brandon  |Wayne     |Wallace |
          |Yana     |Yaya      |Wallace |
          |Martha   |Beatris   |Wallace |
        @datatable
        Scenario: adding multiple employees using data table
        When user enters firstname and middlename and lastname and verify employee has added
          |firstname|middlename|lastname|
          |Yana     |Cuty      |Wallace |
          |Brandon  |Millioner |Wallace |
          |Bunny    |Merill    |Wallace |
          @excel
          Scenario: adding multiple employees using excel file
            When user adds multiple employees using excel from "EmployeeDataBatch16" and verify it

            @Db
            Scenario: Adding one employee from feature file
              When user enters "Yana" and "Brandon" and "Wallace"
              And user clicks on save button
              Then employee added successfully
              Then  verify employee is stored in database





