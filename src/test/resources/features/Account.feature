@Test
Feature: Security test scenarios

  Background:
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alisafa@gmail.com' and password 'AliSafa@2024'
    And User click on login button

  Scenario: Verify user can sign in into Retail Application
    Then User should be logged in into Account

   Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name ‘NameValue’ and Phone ‘PhoneValue’
    And User click on Update button
    Then user profile information should be updated

   Scenario: Verify User can Update password
     When User click on Account option
     And User enter below information
       |previousPassword| newPassword|confirmPassword|
       |password |password |confirmPassword |
     And User click on Change Password button
     Then a message should be displayed ‘Password Updated Successfully’
