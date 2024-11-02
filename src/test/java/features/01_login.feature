Feature: Test the login functionality

  # Scenario 1: Unsuccessful login(Invalid UserName and Invalid Password)
  Scenario Outline: Login with Invalid UserName and Invalid Password
    Given Admin opens the website and goes to the login page
    When Admin fills in Invalid UserName as "<UserName>" and Invalid Password as "<Password>" and clicks on login
    Then the error message should be displayed
    Examples:
      | UserName  | Password   |
      | Arafa     | admin123   |
      | Admin     | 1aa23aa    |



  # Scenario 2: Unsuccessful login(Empty UserName and Valid Password)
  Scenario: Login with Empty UserName and Valid Password
    Given Admin opens the website and goes to the login page
    When Admin fills in Empty UserName as "" and Valid Password as "admin123" and clicks on login
    Then UserName Required Hint Should Displayed



  # Scenario 3: Unsuccessful login(Valid UserName and Empty Password)
  Scenario: Login with Valid UserName and Empty Password
    Given Admin opens the website and goes to the login page
    When Admin fills in Valid UserName as "Admin" and Empty Password as "" and clicks on login
    Then Password Required Hint Should Displayed



  # Scenario 4: Successful login(Valid UserName and Valid Password)
  Scenario: Login with Valid UserName and Valid Password
    Given Admin opens the website and goes to the login page
    When Admin fills in Valid UserName as "Admin" and Valid Password as "admin123" and clicks on login
    Then Admin should navigate to the Dashboard page
