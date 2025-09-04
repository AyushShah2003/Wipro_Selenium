Feature: Student Registration Form
@sanity
 Scenario: Successful registration with valid details
    Given user is on the Practice Form
    When User enters "John" in the Name field
    And User enters "john@example.com" in the Email field
    And User selects "Male" as Gender
    And User enters "9876543210" in the Mobile field
    And User enters "01/01/2000" in the Date of Birth field
    And User enters "Mathematics" in the Subjects field
    And User selects "Sports" and "Reading" as Hobbies
    And User uploads a profile picture
    And User enters "123 Main Street" in Current Address field
    And User selects "Jharkhand" in State dropdown
    And User selects "Jamshedpur" in City dropdown
   # And User clicks on the "Login" button
    Then Registration should be successful
    
    

