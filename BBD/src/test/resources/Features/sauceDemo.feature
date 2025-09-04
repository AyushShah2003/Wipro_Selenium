Feature: Swag Labs Login

  Scenario: Login with valid credentials
    Given User is on the Swag Labs login page
    When User enters "standard_user" and "secret_sauce"
    And User clicks on the login button
    Then User should be navigated to the products page

  Scenario: Login with invalid credentials
    Given User is on the Swag Labs login page
    When User enters "invalid_user" and "secret_sauce"
    And User clicks on the login button
    Then User should see an error message
 
  Scenario: Login with invalid credentials
    Given User is on the Swag Labs login page
    When User enters "standard_user" and "secret_sauce"
    And User clicks on the login button
    Then User should see an error message
    
Scenario: Login with invalid credentials
    Given User is on the Swag Labs login page
    When User enters "invalid_user" and "wrong_pass"
    And User clicks on the login button
    Then User should see an error message
