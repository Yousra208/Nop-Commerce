package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_Checkout {
    WebDriver driver;

    public P12_Checkout(WebDriver driver){
        this.driver = driver;
    }
    private final By TermsCheckbox = By.xpath("//input[@name='termsofservice']");
    private final  By CheckOutButton = By.xpath("//button[@name='checkout']");
    private final By CheckoutConfirmation = By.xpath("//div[@class='page-title']");

    public  P12_Checkout CheckTermsCheckbox() {
        driver.findElement(TermsCheckbox).click();
        return this;
    }

    public  P12_Checkout ClickCheckOutButton() {
        driver.findElement(CheckOutButton).click();
        return this;
    }
    public boolean checkoutConfirmation(){
        return driver.findElement(this.CheckoutConfirmation).isDisplayed();
    }
}
