package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P09_AddToWishlist;
import pages.P10_AddToCompareList;
import utility.Utilities;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC10_AddToCompareList extends Test_Base {
    @Test
    public void addProductToComparelist() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P10_AddToCompareList(driver).AddToComparelist();
        Utilities.captureScreenshot(driver, "P_addToCompareList");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(3000);

        softAssert.assertTrue(new P10_AddToCompareList(driver).ProductAddedToComparelist());
        softAssert.assertAll();

    }
}
