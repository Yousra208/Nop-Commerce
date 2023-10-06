package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

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
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).confirmBillingAddress();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();
        new P15_PaymentMethod(driver).addPaymentMethod().clickContinuePaymentButton();
        new P16_PaymentInformation(driver).selectPaymentCard().addCardHolderName(cardHolder_Name).addCardNumber(cardNumber).selecttExipryMonth().selectExpiryYear().addCardCode(cardCode).SaveCardDetails();
        Utilities.captureScreenshot(driver,"successPayment");
        Thread.sleep(2000);
       // Assert.assertTrue(new P16_PaymentInformation(driver).correctPaymentInformation());
    }
}
