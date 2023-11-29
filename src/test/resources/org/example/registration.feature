Feature: Registration Variations

  Background:
    Given the home page is opened

  Scenario Outline: Incorrect Password Registration
    Given the "Register" button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/register'
    And the 'First Name' section is filled with '<firstName>'
    And the 'Last Name' section is filled with '<lastName>'
    And the 'Email' section is filled with '<email>'
    And the 'Password' section is filled with '<password>'
    And the 'Confirm Password' section is filled with '<confirmPassword>'
    Then the "register Button" button is clicked
    And the '<errorMessage3>' and '<errorMessage4>' will be shown
    Examples:
      |firstName|lastName|email                  |password     |confirmPassword|errorMessage3        |errorMessage4|
      |S        |D       |sunshine27@gmail.com   |             |               |Password is required.|Password is required.|
      |K        |N       |sun@gmail.com          |             |LIFE2023       |Password is required.|The password and confirmation password do not match.|
      |S        |D       |sunshine27@gmail.com   |kani         |               |The password should have at least 6 characters.|Password is required.|
      |K        |P       |sunshinelady@gmail.com |             |beauty         |Password is required. |The password and confirmation password do not match.|

  Scenario Outline: Incorrect Email and Name Registration
    Given the "Register" button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/register'
    And the 'First Name' section is filled with '<firstName>'
    And the 'Last Name' section is filled with 'John'
    And the 'Email' section is filled with '<email>'
    And the 'Password' section is filled with 'kaniet'
    And the 'Confirm Password' section is filled with 'kaniet'
    Then the "register Button" button is clicked
    And the '<errorMessage5>' and '<errorMessage6>' will be shown
    Examples:
      |firstName|email               |errorMessage5          |errorMessage6     |
      |S        |sunshine27@com      |                       |Wrong email       |
      |         |sun@gmail           |First name is required.|Wrong email       |
      |         |sunshine27@gmail.com|First name is required.|                  |
      |         |                    |First name is required.|Email is required.|


  Scenario: Valid Registration
    Given the "Register" button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/register'
    And the 'First Name' section is filled with 'Safina'
    And the 'Last Name' section is filled with 'Dastan'
    And the 'Email' section is filled with 'kaniet.2003@mailbox.unideb.hu'
    And the 'Password' section is filled with 'Safina2018'
    And the 'Confirm Password' section is filled with 'Safina2018'
    Then the "register Button" button is clicked