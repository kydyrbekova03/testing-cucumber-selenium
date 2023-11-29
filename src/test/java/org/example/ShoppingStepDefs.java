package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingStepDefs extends AbstractStepDefs{
    @And("the user added {string} to the basket")
    public void theUserAddedItemToTheBasket(String item) {
        homePage.addTheItemToCart(item);
    }

    @Then("the Sub-Total is {string}")
    public void thePriceShouldRead(String total) {
        assertEquals(total, homePage.getTotalPrice());
    }
}
