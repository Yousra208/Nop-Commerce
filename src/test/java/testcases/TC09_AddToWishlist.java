package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC09_AddToWishlist extends Test_Base {
    @Test
    public void addProductToWishlist() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P09_AddToWishlist(driver).addToWishlist();
        //Take screenshot
        Utilities.captureScreenshot(driver,"P_AddToWishlist");
        SoftAssert softAssert = new SoftAssert();
      //  softAssert.assertTrue(new P09_AddToWishlist(driver).ProductAddedToWishlist());
        softAssert.assertAll();
        Thread.sleep(1000);
    }
}
