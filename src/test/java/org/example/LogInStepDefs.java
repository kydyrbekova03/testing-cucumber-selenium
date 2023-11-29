package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInStepDefs extends AbstractStepDefs{
    @Then("the {string} and {string} will pop up")
    public void theErrorMessagesAreShown(String errorMessage1, String errorMessage2){
        assertEquals(errorMessage1, homePage.getOutputMessage1());
        assertEquals(errorMessage2, homePage.getOutputMessage2());
    }

    @Then("the {string} and {string} will be shown")
    public void ErrorMessagesAreShown(String errorMessage3, String errorMessage4){
        assertEquals(errorMessage3, homePage.getOutputMessage3());
        assertEquals(errorMessage4, homePage.getOutputMessage4());
    }

    @Then("the {string}, {string}, {string} will be shown")
    public void ShowErrorMessages(String errorMessage5, String errorMessage6){
        assertEquals(errorMessage5, homePage.getOutputMessage5());
        assertEquals(errorMessage6, homePage.getOutputMessage6());
    }


}
