Feature: Mercury Tours Registration

  Scenario: Successful registration
    Given user navigates to registration page
    When user enters registration details
      | firstName    | lastName | phone       | email           | address       | city       | state       | postalCode | country   | userName   | password | confirmPassword |
      | Jyotirmay      | Panja   | 1234567890  | joy@example.com | 123 SK IND    | Jamshedpur    | Jharkhand    | 831001     | INDIA     | Joy5468    | pass123  | pass123         |
    And user submits the form
    Then registration should be successful