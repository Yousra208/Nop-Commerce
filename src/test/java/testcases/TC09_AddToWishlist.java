package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC09_AddToWishlist extends Test_Base {
    @Test
    public void addProductToWishlist() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P09_AddToWishlist(driver).ProductAddedToWishlist();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P09_AddToWishlist(driver).ProductAddedToWishlist());
        softAssert.assertAll();
        Thread.sleep(1000);
    }
}
