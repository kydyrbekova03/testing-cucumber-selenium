package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://demowebshop.tricentis.com/";

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    WebElement outputMessage1;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")
    WebElement outputMessage2;

    public HomePage(WebDriver driver) { this.driver = driver; }


    private static final Map<String, By> itemButtons = Map.of(
            "Simple Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[7]/div/div[2]/div[3]/div[2]/input"),
            "Expensive Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/div[3]/div[2]/input"),
            "Build your own cheap computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]/input"),
            "1-inch Laptop", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"),
            "Cheap Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")
    );

    public static final Map<String, By> navigationButton = Map.of(
            "LogIn", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"),
            "Log In", By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"),
            "Log Out", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    );

    private static final Map<String, By> textFields = Map.of(
            "Email", By.id("Email"),
            "Password", By.id("Password")
    );

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButton.get(button)).click();
    }

    public String getOutputMessage1(){
        return outputMessage1.getText();
    }
    public String getOutputMessage2(){
        return outputMessage2.getText();
    }

    public void addTheItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public String getPageUrl(){return driver.getCurrentUrl();}
    public void closePage() {
        driver.quit();
    }
}
