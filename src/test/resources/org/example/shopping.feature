Feature: Shopping

  Background:
    Given the home page is opened
    When the 'LogIn' button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/login'
    And the 'Email' section is filled with 'kydyrbekova995@gmail.com'
    And the 'Password' section is filled with 'Kaniet'
    When the 'Log In' button is clicked
    Then user redirected to 'https://demowebshop.tricentis.com/login'
    When the 'Log Out' button is clicked

  Scenario: Shopping items
    When user redirected to {string}
    And the user added 'Books Computing and Internet' to the basket
