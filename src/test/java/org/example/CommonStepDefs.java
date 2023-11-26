package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDefs extends AbstractStepDefs{
    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the Fake Landing Page is opened")
    public void FakeLandingIsOpened() {
        homePage.navigateFakeLandingPage();
    }
    @Given("the Fake Pricing Page is opened")
    public void FakePricingIsOpened() {
        homePage.navigateFakePricingPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @When("the {string} is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @Then("user redirected to {string}")
    public void userRedirectedToPage(String url){ assertEquals(url, homePage.getPageUrl());}

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }
}
