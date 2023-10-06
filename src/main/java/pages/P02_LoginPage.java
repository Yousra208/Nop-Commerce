package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {

    WebDriver driver;

    public P02_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //TODO// define locators by
    private final By loginPage = (By.xpath("//a[text()='Log in']"));
    private final By email = By.xpath("//input[@class=\"email\"]");
    private final By password = By.xpath("//input[@class=\"password\"]");
    private final By LoginBtn = By.xpath("//button[text()=\"Log in\"]");
    private final By logoutButton = By.xpath("//a[@class='ico-logout']");

    private final By incorrectLoginMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    //TODO:Define Actions

    public P02_LoginPage addUserEmail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
        return this;
    }

    public P02_LoginPage addUserPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public P02_LoginPage ClickLoginBtn() {
        driver.findElement(this.LoginBtn).click();

        return this;
    }

    public P02_LoginPage cLickonloginPage() {
        driver.findElement(this.loginPage).click();
        return this;
    }

    public boolean logoutButton() {
        return driver.findElement(this.logoutButton).getText().equals("Log out");
    }

    public boolean loginErrorMessage() {
        return driver.findElement(this.incorrectLoginMessage).isDisplayed();
    }

}

