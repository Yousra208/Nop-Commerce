package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P01_Registration {
    static WebDriver driver;
    Select select;

    public P01_Registration(WebDriver driver) {
        this.driver = driver;
    }

    //     TODO: define locators By
    private final By registrationPage = By.xpath("//a[@class= 'ico-register']");
    private final By first_name = By.xpath("//input[@name='FirstName']");
    private final By last_name = By.xpath("//input[@name='LastName']");
    private final By email = By.id("Email");
    private final By birth_day = By.xpath("//Select[@name='DateOfBirthDay']");
    private final By birth_month = By.xpath("//Select[@name='DateOfBirthMonth']");
    private final By birth_year = By.xpath("//Select[@name='DateOfBirthYear']");
    private final By Password = By.id("Password");
    private final By Confirm_password = By.id("ConfirmPassword");
    private final By RegisterBtn = By.xpath("//button[@name='register-button']");
    private final By confirmRegistration = By.xpath("//div[@class=\"result\"]");
    private final By existingEmailMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public P01_Registration openRegistrationPage() {
        driver.findElement(registrationPage).click();
        return this;
    }

    public P01_Registration addFirst_name(String firstName) {
        driver.findElement(this.first_name).sendKeys(firstName);
        return this;
    }

    public P01_Registration addLast_name(String lastName) {
        driver.findElement(this.last_name).sendKeys(lastName);
        return this;
    }

    public P01_Registration addEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public P01_Registration addBirth_day() {
        select = new Select(driver.findElement(this.birth_day));
        select.selectByIndex(Utilities.generateRandomInteger(1, 30));
        return this;
    }

    public P01_Registration addBirth_month() {
        select = new Select(driver.findElement(this.birth_month));
        select.selectByIndex(Utilities.generateRandomInteger(1, 12));
        return this;
    }

    public P01_Registration addBirth_year() {
        select = new Select(driver.findElement(this.birth_year));
        select.selectByIndex(Utilities.generateRandomInteger(1, 30));
        return this;
    }

    public P01_Registration addPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P01_Registration addConfirm_password(String confirmPassword) {
        driver.findElement(this.Confirm_password).sendKeys(confirmPassword);
        return this;
    }

    public P01_Registration clickRegisterBtn() {
        driver.findElement(this.RegisterBtn).click();
        return this;
    }

    public boolean confirmRegistrationSuccessfully() {
        return driver.findElement(this.confirmRegistration).getText().equals("Your registration completed");

    }

    public boolean emilExists_N() {
        return driver.findElement(this.existingEmailMessage).isDisplayed();
    }
}



