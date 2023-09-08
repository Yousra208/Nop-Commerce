package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC13_BillingAddress extends Test_Base{
    private static Faker faker = new Faker();
    static final String company = faker.company().name();
    static final String country = faker.country().name();
    static final String city = faker.address().cityName();
    static final String postalCode = faker.address().zipCode();
    static final String phoneNumber = faker.phoneNumber().phoneNumber();

    static final String address = faker.address().fullAddress();

    @Test
    public void BillingAddress_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).addAddress1(address).addCompany(company).addCountry().addCity(city).addPostalCode(postalCode).addPhoneNumber(phoneNumber);
        new P13_BillingAddress(driver).clickContinuButton();

        Assert.assertTrue(new P13_BillingAddress(driver).BillingAddressconfirmation());


    }
}
