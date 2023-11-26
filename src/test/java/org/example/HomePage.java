package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://ultimateqa.com/automation";

    private final WebDriver driver;

    @FindBy(linkText = "Fill out forms")
    private WebElement fillOutFormsButton;

    private static final Map<String, By> textFields = Map.of(
            "Name", By.id("et_pb_contact_name_0"),
            "Message", By.id("et_pb_contact_message_0"),
            "Name2", By.id("et_pb_contact_name_1"),
            "Message2", By.id("et_pb_contact_message_1"),
            "Zip Code", By.id("postal-code")
            //sumet_pb_contact_captcha_question
    );
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void navigateToFormsPage() {
        fillOutFormsButton.click();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }
    public void closePage() {
        driver.quit();
    }

}
