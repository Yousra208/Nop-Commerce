package testcases;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;
import static testcases.TC13_BillingAddress.*;

public class TC16_PaymentInformation extends Test_Base {
    private static Faker faker = new Faker();
    static final String cardHolder_Name= faker.name().fullName();
    static final String cardNumber = faker.finance().creditCard();
    static final String cardCode = faker.finance().creditCard();

    @Test
    public void Payment_Information_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).addAddress1(address).addCompany(company).addCountry().addCity(city).addPostalCode(postalCode).addPhoneNumber(phoneNumber);
        new P13_BillingAddress(driver).clickContinuButton();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();
        new P15_PaymentMethod(driver).addPaymentMethod().clickContinuePaymentButton();
        new P16_PaymentInformation(driver).selectPaymentCard().addCardHolderName(cardHolder_Name).addCardNumber(cardNumber).selecttExipryMonth().selectExpiryYear().addCardCode(cardCode).SaveCardDetails();

        Assert.assertTrue(new P15_PaymentMethod(driver).successPaymentMethod());
    }
}
