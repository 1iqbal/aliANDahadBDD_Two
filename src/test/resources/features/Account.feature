@Testana
Feature: Search for products and order items

  Background: 
    When User click on Sign In Link
    Then User enter "String" in userName field
    Then User enter "String" in Password field
    Then User click on Login button
    Then User click on Accounts button

  Scenario: User Naivgate to Customer Service Portal
    And User should Verify 5 rows are present

  Scenario: User Naivgate to Customer Services Portal
    Then User click on  Show button drop down
    Then User select 10 from drop down
    Then User should verify 10 rows of Primary Accounts are present
    Then User click on  Show button drop down2
    Then User select 25 from drop down2
    Then User should verify 25 rows of Primary Accounts are present2
    Then User click on  Show button drop down3
    Then User select 50 from drop down3
    Then User should verify 50 rows of Primary Accounts are present3
