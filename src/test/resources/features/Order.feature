Feature: Retail Order Page
Background:
  Given User is on retail website
  When User click on Sign in option
  And User enter email 'alisafa@gmail.com' and password 'AliSafa@2024'
  And User click on login button
  And User should be logged in into Account
  And User click on Orders section
  And User click on first order in list

Scenario: Verify User can cancel the order
  And User click on Cancel The Order button
  And User select the cancellation Reason ‘Bought wrong item’
  And User click on Cancel Order button
  Then a cancellation message should be displayed 'Your Order Has Been Cancelled'

Scenario: Verify User can Return the order
  And User click on buy Again
  And User click on Place Your Order
  And User click on Orders section
  And User click on Return Items button
  And User select the Return Reason ‘Item damaged’
  And User select the drop off service ‘FedEx’
  And User click on Return Order button
  Then a cancellation message should be displayed ‘Return was successful’

Scenario: Verify User can write a review on order placed
  And User click on Review button
  And User write Review headline 'Ali sapa' and 'we will buy it again'
  And User click Add your Review button
  Then a review message should be displayed ‘Your review was added successfully’

