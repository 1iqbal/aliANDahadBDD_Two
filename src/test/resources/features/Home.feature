
Feature: Security test scenarios

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alisafa@gmail.com' and password 'AliSafa@2024'
    And User click on login button
    Then User should be logged in into Account