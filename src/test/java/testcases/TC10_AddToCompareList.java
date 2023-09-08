package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P09_AddToWishlist;
import pages.P10_AddToCompareList;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC10_AddToCompareList extends Test_Base {
    @Test
    public void addProductToComparelist() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P10_AddToCompareList(driver).AddToComparelist();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P10_AddToCompareList(driver).ProductAddedToComparelist());
        softAssert.assertAll();
        Thread.sleep(1000);
    }
}
