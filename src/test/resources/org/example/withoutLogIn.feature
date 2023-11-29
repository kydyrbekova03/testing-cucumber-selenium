Feature: without LogIn

Background:
  Given the home page is opened

Scenario Outline: Shopping without logging in
  Given the 'DIGITAL DOWNLOADS' button is clicked
  And the user added '<item>' to the basket
  Then the 'Shopping Cart()' button is clicked
  And the Sub-Total is '<Price Of Item>'
  Examples:
  |item               | Price Of Item|
  |3rd Album          | 1.00         |
  |Music 2.1          | 11.00        |
  |Music 2            | 14.00        |

