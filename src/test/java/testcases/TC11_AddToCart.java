package testcases;

import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P11_AddToCart;

import static testcases.TC01_Registeration.*;

public class TC11_AddToCart extends Test_Base {

    @Test
    public void AddToCart_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        Thread.sleep(1000);
    }

}
