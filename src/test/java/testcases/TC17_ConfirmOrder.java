package testcases;

import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;
import static testcases.TC13_BillingAddress.*;
import static testcases.TC16_PaymentInformation.*;

public class TC17_ConfirmOrder extends Test_Base {
    @Test
    public void ConfirmOrder_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).addAddress1(address).addCompany(company).addCountry().addCity(city).addPostalCode(postalCode).addPhoneNumber(phoneNumber).clickContinuButton();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();
        new P15_PaymentMethod(driver).addPaymentMethod().clickContinuePaymentButton();
        new P16_PaymentInformation(driver).selectPaymentCard().addCardHolderName(cardHolder_Name).addCardNumber(cardNumber).selecttExipryMonth().selectExpiryYear().addCardCode(cardCode).SaveCardDetails();
        new P17_ConfirmOrder(driver).clickConfirmOrderButton();
        Utilities.captureScreenshot(driver, "Confirm Order");
        Thread.sleep(2000);
        //Assert Result
        //Assert.assertTrue(new P17_ConfirmOrder(driver).orderCreatedSuccessfully());
    }

}
