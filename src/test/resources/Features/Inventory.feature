Feature: Inventory Page Functionality
  I want to use this template for my feature file

  Background: 
    Given user is on the Sauce Demo login page
    When user enters valid username and password
    And clicks on the "Login" button
    Then user should be redirected to the dashboard or inventory page

  @inventory
  Scenario: Verify hambuger menu, Swaglabs logo and Shopping cart is visible
    When user verify header section on inventory page
    Then user should see hambuger menu, Swaglabs logo and Shopping cart
