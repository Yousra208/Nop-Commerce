package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC13_BillingAddress extends Test_Base{
    private static Faker faker = new Faker();
    static final String company = faker.company().name();
    static final String city = faker.address().cityName();
    static final String postalCode = faker.address().zipCode();
    static final String phoneNumber = faker.phoneNumber().phoneNumber();

    static final String address = faker.address().fullAddress();

    @Test
    public void BillingAddress_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).addAddress1(address).addCompany(company).addCountry().addCity(city).addPostalCode(postalCode).addPhoneNumber(phoneNumber).clickContinuButton();
        Utilities.captureScreenshot(driver,"Billing Address");
        Thread.sleep(2000);
       // Assert.assertTrue(new P13_BillingAddress(driver).BillingAddressconfirmation());


    }
}
