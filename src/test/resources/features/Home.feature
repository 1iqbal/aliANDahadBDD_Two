@Testana
Feature: Security test scenarios

  Scenario: User navigate to Home page
    When Validate Home page Title TEK Insurance UI is present
    And Create Primary Account button is Exist

  Scenario: User Validate Title form of Create Primary Account on Home Page
    When User click on on Create Primary Account button
    Then User should Validate Title form Create Primary Account Holder is present
