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

    public HomePage(WebDriver driver) { this.driver = driver; }

    @FindBy(linkText = "Error Message")
    private WebElement errorMessage;

    @FindBy(linkText = "Fake Landing Page")
    private WebElement fakePricingPage;

    private static final Map<String, By> itemButtons = Map.of(
            "Simple Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[7]/div/div[2]/div[3]/div[2]/input"),
            "Expensive Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/div[3]/div[2]/input"),
            "Build your own cheap computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]/input"),
            "1-inch Laptop", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"),
            "Cheap Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")
    );

    public static final Map<String, By> navigationButton = Map.of(
            "LogIn", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"),
            "LogOut", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
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

    public void addTheItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public String getPageUrl(){return driver.getCurrentUrl();}
    public void closePage() {
        driver.quit();
    }
}
