package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_ResetPassword {
    WebDriver driver;

    public P03_ResetPassword(WebDriver driver) {
        this.driver = driver;
    }

    private final By LoginBtn = By.xpath("//a[@class= 'ico-login']");
    private final By forgotPasswordBtn = By.xpath("//a[text()='Forgot password?']");
    private final By recoveryEmail = By.xpath("//input[@class ='email']");
    private final By sendBtn = By.xpath("//button[@name='send-email']");

    private final By successMsg = By.xpath("//div[@class='bar-notification success']");


    public P03_ResetPassword getLoginBtn() {
        driver.findElement(this.LoginBtn).click();
        return this;
    }

    public P03_ResetPassword clickForgotPasswordBtn() {
        driver.findElement(this.forgotPasswordBtn).click();
        return this;
    }

    public P03_ResetPassword addRecoveryEmail(String Email) {
        driver.findElement(this.recoveryEmail).sendKeys(Email);
        return this;
    }

    public P03_ResetPassword clickSendBtn() {
        driver.findElement(this.sendBtn).click();
        return this;
    }
    public boolean confirmResetPassword() {
        return driver.findElement(this.successMsg).isDisplayed();
    }
}
