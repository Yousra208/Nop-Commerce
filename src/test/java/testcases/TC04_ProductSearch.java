package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P03_ResetPassword;
import pages.P04_ProductSearch;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC04_ProductSearch extends Test_Base{

    String searchText = "desktops";

    @Test
    public void SearchProduct_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P04_ProductSearch(driver).addSearchText(searchText).clickSearchBtn();
        Assert.assertTrue(new P04_ProductSearch(driver).searchResultConfirm());
    }
}
