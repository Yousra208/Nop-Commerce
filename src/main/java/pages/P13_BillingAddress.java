package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P13_BillingAddress {
    WebDriver driver;
    Select select;

    public P13_BillingAddress(WebDriver driver) {
        this.driver = driver;
    }

//    private final By firstName = By.xpath("//input[@name='BillingNewAddress.FirstName']");
//    private final By lastName = By.xpath("//input[@name='BillingNewAddress.LastName']");
//    private final By email = By.xpath("//input[@name='BillingNewAddress.Email']");
    private final By company = By.xpath("//input[@name='BillingNewAddress.Company']");
    private final By country = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    private final By city = By.xpath("//input[@name='BillingNewAddress.City']");
    private final By postalCode=By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    private final By address1 = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private final By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private final By continuButton = By.xpath("//button[@onclick='Billing.save()']");
    private final By confirmBillingAddress= By.xpath("//div[@class='section shipping-method']");

    public P13_BillingAddress addCompany(String companyName) {
        driver.findElement(this.company).sendKeys(companyName);
        return this;
    }

    public P13_BillingAddress addCountry() {
        select=new Select(driver.findElement(this.country));
        select.selectByIndex(Utilities.generateRandomInteger(1,12));
        return this;
    }

    public P13_BillingAddress addCity(String City) {
        driver.findElement(city).sendKeys(City);
        return this;
    }

    public P13_BillingAddress addPostalCode(String PostalCode) {
        driver.findElement(postalCode).sendKeys(PostalCode);
        return this;
    }

    public P13_BillingAddress addAddress1(String Address) {
        driver.findElement(address1).sendKeys(Address);
        return this;
    }

    public P13_BillingAddress addPhoneNumber(String phone) {
        driver.findElement(phoneNumber).sendKeys(phone);
        return this;
    }

    public P13_BillingAddress clickContinuButton() throws InterruptedException {
        driver.findElement(continuButton).click();
        Thread.sleep(1000);
        return this;
    }

    public boolean BillingAddressconfirmation(){
        return driver.findElement(this.confirmBillingAddress).isDisplayed();
    }

}
