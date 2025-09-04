Feature: User Registration

  @regression
  Scenario Outline: Register a new user with multiple data
    Given User is on the registration page
    When User enters the registration details
      | FirstName   | LastName   | UserName   | Password   |
      | <FirstName> | <LastName> | <UserName> | <Password> |
    And User clicks on the Register button
    Then User should be registered successfully

    Examples:
      | FirstName | LastName | UserName | Password  |
      | John      | Doe      | johndoe  | pass123   |
      | Alice     | Smith    | alices   | alice456  |
      | Bob       | Brown    | bobby    | bob789    |
