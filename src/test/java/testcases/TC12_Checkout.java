package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC12_Checkout extends Test_Base{

    @Test
    public void Checkout_P(){
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        Utilities.captureScreenshot(driver,"Checkout");
//        Assert.assertTrue(new P12_Checkout(driver).checkoutConfirmation());
    }
}
