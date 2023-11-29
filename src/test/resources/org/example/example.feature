Feature: An example

  Background:
    Given the home page is opened

   Scenario: Valid LogIn attempts
     When the 'LogIn' button is clicked
     Then user redirected to 'https://demowebshop.tricentis.com/login'
     And the 'Email' section is filled with 'kydyrbekova995@gmail.com'
     And the 'Password' section is filled with 'Kaniet'
     When the 'Log In' button is clicked
     Then user redirected to 'https://demowebshop.tricentis.com/'
     When the 'Log Out' button is clicked

   Scenario Outline: Invalid LogIn attempts
     When the 'LogIn' button is clicked
     Then user redirected to 'https://demowebshop.tricentis.com/login'
     And the 'Email' section is filled with '<email>'
     And the 'Password' section is filled with '<password>'
     When the 'Log In' button is clicked
     Then the '<errorMessage1>' and '<errorMessage2>' will pop up
     Examples:
     |email                    |password  |errorMessage1                                                   | errorMessage2                        |
     |kydyrbekova995@gmail.com |          |Login was unsuccessful. Please correct the errors and try again.|The credentials provided are incorrect|
     |                         | Kaniet   |Login was unsuccessful. Please correct the errors and try again.|No customer account found             |
     |                         |          |Login was unsuccessful. Please correct the errors and try again.|No customer account found             |
     |kydyrbekova995@gmail.com | KaniBani |Login was unsuccessful. Please correct the errors and try again.|The credentials provided are incorrect|




