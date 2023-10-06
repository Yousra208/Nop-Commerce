package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P15_PaymentMethod {
    WebDriver driver;

    public P15_PaymentMethod(WebDriver driver) {
        this.driver = driver;
    }

    private final By paymentMethod = By.xpath("//input[@value='Payments.Manual']");
    private final By continuePaymentButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private final By paymentMethodSuccess = By.xpath("//div[@class='info']");
    public P15_PaymentMethod addPaymentMethod() {
        driver.findElement(paymentMethod).click();
        return this;
    }

    public P15_PaymentMethod clickContinuePaymentButton() {
        driver.findElement(continuePaymentButton).click();
        return this;
    }
    public boolean successPaymentMethod(){
        return driver.findElement(paymentMethodSuccess).isDisplayed();
    }

}