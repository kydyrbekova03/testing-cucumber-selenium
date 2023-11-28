package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInStepDefs extends AbstractStepDefs{
    @Then("the {string} and {string} will pop up")
    public void theErrorMessagesAreShown(String errorMessage1, String errorMessage2){
        assertEquals(errorMessage1, homePage.getOutputMessage1());
        assertEquals(errorMessage2, homePage.getOutputMessage2());
    }

}
