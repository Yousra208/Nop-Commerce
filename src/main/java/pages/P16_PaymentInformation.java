package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P16_PaymentInformation {
    WebDriver driver;
    Select select;

    public P16_PaymentInformation(WebDriver driver){
        this.driver = driver;
    }

    public P16_PaymentInformation selectPaymentCard() {
        select=new Select(driver.findElement(paymentCard));
        select.selectByIndex(Utilities.generateRandomInteger(1,3));
        return this;
    }

    public P16_PaymentInformation addCardHolderName(String CardHolderName) {
        driver.findElement(this.cardHolderName).sendKeys(CardHolderName);
        return this;
    }

    public P16_PaymentInformation addCardNumber(String CardNumber) {
        driver.findElement(this.cardNumber).sendKeys(CardNumber);
        return this;
    }

    public P16_PaymentInformation selecttExipryMonth() {
        select=new Select(driver.findElement(this.exipryMonth));
        select.selectByIndex(Utilities.generateRandomInteger(1,12));
        return this;
    }

    public P16_PaymentInformation selectExpiryYear() {
        select=new Select(driver.findElement(this.expiryYear));
        select.selectByIndex(Utilities.generateRandomInteger(1,14));
        return this;
    }

    public P16_PaymentInformation addCardCode(String CardCode) {
        driver.findElement(cardCode).sendKeys(CardCode);
        return this;
    }

    public P16_PaymentInformation SaveCardDetails() {
        driver.findElement(saveCardDetails).click();
        return this;
    }
    public boolean correctPaymentInformation() {
        return driver.findElement(successPaymentInformation).isDisplayed();
    }

    private final By paymentCard = By.id("CreditCardType");
    private final By cardHolderName = By.xpath("//input[@name='CardholderName']");
    private final By cardNumber = By.xpath("//input[@name='CardNumber']");
    private final By exipryMonth = By.xpath("//select[@name='ExpireMonth']");
    private final By expiryYear = By.xpath("//select[@name='ExpireYear']");
    private final By cardCode = By.xpath("//input[@name='CardCode']");
    private final By saveCardDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private final By successPaymentInformation = By.xpath("//table[@class='cart-total']");

}

