@Testana
Feature: Tek Insurance Login

  Background: 
    When User click on Sign In Link
 
  Scenario: User should Login with Valid Credential Successfully
    Then User enter "String" in userName field
    Then User enter "String" in Password field
    Then User click on Login button
    And User should Validate he navigate to Customer Service Portal

 
  Scenario: User Validate wrong credentials error message
    Then User enter invalid "String" in field
    Then User enter valid "String" in Password field
    Then User click on Login button
    Then User should validate wrong username entered message
    Then User enter valid "String" in Email field
    Then User enter invalid "String" in Password field
    Then User click on Login button
    Then User should validate wrong password entered message

  Scenario: User should Login with Valid Credential Successfully
    Then User enter "String" in userName field
    Then User enter "String" in Password field
    Then User click on Login button
    Then User click on profile Icone button
    Then User click on Logout button
    And User should Validate Home page is present
