Feature: without LogIn

Background:
  Given the home page is opened

Scenario Outline: Shopping without logging in
  Given the 'COMPUTERS' button is clicked
  And the 'Desktops' button is clicked
  And the '<computer type>' button is clicked
  And the user added '<item>' to the basket
  Then the 'Shopping Cart()' button is clicked
  And the Sub-Total is '<Price Of Item>'
  Examples:
  |computer type      |item               | Price Of Item|
  |Expensive Computer |EXPENSIVE COMPUTER | 1815.00      |

