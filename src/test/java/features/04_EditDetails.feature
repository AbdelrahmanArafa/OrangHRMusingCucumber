Feature: Test Edit Employee Details Functionality

  Scenario: Edit Employee's Details
    Given Click on the Employee field
    When Add Employee's License Number as "12345"
    And Add License Expiry Date as "2025-05-05"
    And Select the Nationality
    And Select the Marital Status
    And Add Date of Birth as "1999-07-01"
    And select the Gender
    Then Click on the Save button