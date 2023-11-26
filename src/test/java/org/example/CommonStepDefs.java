package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.example.AbstractStepDefs.homePage;

public class CommonStepDefs {
    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the form out forms page is opened")
    public void theFormOutFormsIsOpened() {
        homePage.navigateToFormsPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }


    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }
}
