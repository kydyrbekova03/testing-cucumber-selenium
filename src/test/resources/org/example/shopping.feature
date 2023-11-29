Feature: Shopping

  Background:
    Given the home page is opened

  Scenario: Shopping items
    When the 'LogIn' button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/login'
    And the 'Email' section is filled with 'kydyrbekova995@gmail.com'
    And the 'Password' section is filled with 'Kaniet'
    When the 'Log In' button is clicked
    Given the 'BOOKS' button is clicked
    And the user added 'BOOKS Computing and Internet' to the basket
    When the 'Shopping Cart()' button is clicked
    And the Sub-Total is '10.00'
    Then the 'Log Out' button is clicked













