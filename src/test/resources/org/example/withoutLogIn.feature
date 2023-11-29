Feature: without LogIn

Background:
  Given the home page is opened

Scenario Outline: Shopping without logging in
  Given the 'COMPUTERS' button is clicked
  And the 'Desktops' button is clicked
  And the '<computer type>' button is clicked
  And the user added '<item>' to the basket
  And the Sub-Total is '<Price Of Item>'
  Examples:
  |computer type      |item               | Price Of Item|
  |Expensive Computer |EXPENSIVE COMPUTER | 1800.00      |
  |Cheap Computer     |CHEAP COMPUTER     | 800.00       |
  |Simple Computer    |SIMPLE COMPUTER    | 800.00       |
  |Own Computer       |OWN COMPUTER       | 1200.00      |
