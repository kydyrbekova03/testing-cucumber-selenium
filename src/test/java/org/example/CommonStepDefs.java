package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDefs extends AbstractStepDefs{
    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} section is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @Then("user redirected to {string}")
    public void userRedirectedToPage(String url){ assertEquals(url, homePage.getPageUrl());}

    @Then("the {string} page will be opened")
    public void theUserIsDirectedToPageUrl(String pageUrl) {
        assertEquals(pageUrl, homePage.getPageUrl());
    }

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }
}
