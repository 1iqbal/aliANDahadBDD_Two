@Testana
Feature: 

  Background: 
    When User click on Sign In Link
    Then User enter "String" in userName field
    Then User enter "String" in Password field
    Then User click on Login button
    Then User click on profile Icon button

  Scenario: User should Login and verify side bar of Account profile
    And User should verify profile Title is present

  Scenario: User should verify Login, Logout and verify home page
    Then User click on Logout button
    And User should verify main Title of home page is present
