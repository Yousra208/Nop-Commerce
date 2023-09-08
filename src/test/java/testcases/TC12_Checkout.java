package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC12_Checkout extends Test_Base{

    @Test
    public void Checkout_P(){
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();

        Assert.assertTrue(new P12_Checkout(driver).checkoutConfirmation());
    }
}
