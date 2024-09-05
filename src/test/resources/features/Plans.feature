@Testana
Feature: Update user info

  Background: 
    When User click on Sign In Link
    Then User enter "String" in userName field
    Then User enter "String" in Password field
    Then User click on Login button
    Then User click on Plans button

  Scenario: User should Login and verify Plans page
    And User should 4 rows of Data are present

  Scenario: User should Login and verify created and expired Date
    Then User should verify create date is today date
    And User should verify expire date is the day after today
