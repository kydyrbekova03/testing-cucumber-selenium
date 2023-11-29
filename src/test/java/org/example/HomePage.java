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

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span")
    WebElement subTotal;



    public HomePage(WebDriver driver) { this.driver = driver; }


    private static final Map<String, By> itemButtons = Map.ofEntries(
            Map.entry("Simple Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[7]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("Expensive Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("Build your own cheap computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("1-inch Laptop", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("Cheap Computer", By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("BOOKS Computing and Internet", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")),
            Map.entry("BOOKS Fiction", By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > input")),
            Map.entry("BOOKS Health Book", By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(5) > div > div.details > div.add-info > div.buttons > input"))
    );

    public static final Map<String, By> navigationButton = Map.ofEntries(
            Map.entry("LogIn", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")),
            Map.entry("Log In", By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input")),
            Map.entry("Log Out", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")),
            Map.entry("BOOKS", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")),
            Map.entry("COMPUTERS", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")),
            Map.entry("ELECTRONICS", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")),
            Map.entry("APPAREL&SHOES", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")),
            Map.entry("DIGITAL DOWNLOADS", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")),
            Map.entry("JEWELRY", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")),
            Map.entry("Shopping Cart()", By.cssSelector(".ico-cart .cart-label"))
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

    public String getTotalPrice() {return subTotal.getText(); }

    public void closePage() {
        driver.quit();
    }
}
