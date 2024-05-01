Feature: Login Functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Verify successful login with valid credentials
    Given user is on the Sauce Demo login page
    When user enters valid username and password
    And clicks on the "Login" button
    Then user should be redirected to the dashboard or inventory page

  @tag1
  Scenario: Verify login with Invalid credentials
    Given user is on the Sauce Demo login page
    When user enters invalid username and/or password
    And clicks on the "Login" button
    Then an error message indicating invalid credentials should be displayed    
 