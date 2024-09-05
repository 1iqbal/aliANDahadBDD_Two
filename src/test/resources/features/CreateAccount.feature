@Testana
Feature: Create new account

  Background: 
    When User click on create primary account button
    Then User enter "Ahad" in First Name field
    Then User enter "Safa" in Last Name field
    Then User enter "SDET" in EmploymentStatus field
    Then User should select Mr. in Title drop down
    Then User should select Male in Gender drop down
    Then User should select Married in Marital Status drop down

  Scenario: Create valid account and verify email address
    Then User enter "String" in Email field
    Then User should send "01/01/1999" in Date of Birth drop down
    Then User click on Create Account button
    And User should Verify is email text is shown as expected

  Scenario: Create account with existing email and verify error Message
    Then User enter "aaiqbal11@gmail.com" in Email field2
    Then User should send "01/01/1999" in Date of Birth drop down2
    Then User click on Create Account button
    And User should Verify is error of existing email

  Scenario: Create account with younger Age and verify error Message
    Then User enter "String" in Email young Age
    Then User should send "01/01/2010" in Date of Birth drop down3
    Then User click on Create Account button
    And User should Verify is error of younger Age
@testt
  Scenario: Create account, sign In and verify Profile of account
    Then User enter "string" in Email valid
    Then User should send "01/01/2000" in Date of Birth drop down4
    Then User click on Create Account button
    Then User enter "string" in userName field5
    Then User enter "string" in Password field5
    Then User enter "string" in confirmPassword field5
    Then User click on submit button
    Then User enter "string" userName
    Then User enter "string" password
    Then User click on signInBtn
    Then User click on profile Icon button
    And User should verify FullName is present
