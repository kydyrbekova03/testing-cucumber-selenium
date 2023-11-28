package org.example;

import io.cucumber.java.en.And;

public class ShoppingStepDefs extends AbstractStepDefs{
    @And("the user added {string} to the basket")
    public void theUserAddedItemToTheBasket(String item) {
        homePage.addTheItemToCart(item);
    }
}
