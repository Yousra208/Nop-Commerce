package testcases;

import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC15_PaymentMethod extends Test_Base {

    @Test
    public void PaymentMethod_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).confirmBillingAddress();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();
        new P15_PaymentMethod(driver).addPaymentMethod().clickContinuePaymentButton();
        Utilities.captureScreenshot(driver, "payment method");
        // Assert.assertTrue(new P15_PaymentMethod(driver).successPaymentMethod());
    }


}
