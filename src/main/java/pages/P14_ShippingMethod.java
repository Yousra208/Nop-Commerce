package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.security.pkcs11.P11Util;

public class P14_ShippingMethod {

    WebDriver driver;

    public P14_ShippingMethod(WebDriver driver){
        this.driver = driver;
    }

    private final By shippingMethod = By.xpath("//input[@value='Ground___Shipping.FixedByWeightByTotal']");
    private final By continueShippingButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private final By shippingSuccessful = By.xpath("//label[text()='Check / Money Order']");
    public P14_ShippingMethod addShippingMethod() {
        driver.findElement(shippingMethod).click();
        return this;
    }

    public P14_ShippingMethod clickContinueShippingButton() {
        driver.findElement(continueShippingButton).click();
        return this;
    }
    public boolean shippingMethodSuccess(){
        return driver.findElement(this.shippingSuccessful).isDisplayed();
    }
}

