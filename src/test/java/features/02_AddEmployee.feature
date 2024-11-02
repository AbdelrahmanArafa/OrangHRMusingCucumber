Feature: Test Add Employee Functionality

  Scenario: Add Employee
    Given Admin opens the Dashboard page
    When Clicking on PIM
    And Clicking on Add Button
    Then Fills the Employee's First name as "Abdelrahman" and Middle Name as "Arafa" and Last Name as "Osman"
    Then Click on Save button