package testcases;

import javafx.scene.text.Text;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;
import static testcases.TC13_BillingAddress.*;

public class TC14_ShippingMethod extends Test_Base {

    @Test
    public void ShippingMethod_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).confirmBillingAddress();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();
        Utilities.captureScreenshot(driver,"shipping method");
        //Assert.assertTrue(new P14_ShippingMethod(driver).shippingMethodSuccess());


    }

}
