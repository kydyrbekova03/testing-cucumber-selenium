Feature: Adding item to wishlist
  Background:
    Given the home page is opened
    And the 'LogIn' button is clicked
    And the 'https://demowebshop.tricentis.com/login' page will be opened
    And the 'Email' section is filled with 'kydyrbekova995@gmail.com'
    And the 'Password' section is filled with 'kaniet'
    When the 'Log In' button is clicked
    Then the 'https://demowebshop.tricentis.com/' page will be opened

  Scenario: The Jewelry will be added to the wishlist
    Given the 'Jewelry Navigation Button' button is clicked
    And the 'Diamond' button is clicked
    When the 'Adding To Wishlist' button is clicked
    Then the 'The product has been added to your wishlist' message will be shown