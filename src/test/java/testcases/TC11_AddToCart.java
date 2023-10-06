package testcases;

import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P11_AddToCart;
import utility.Utilities;

import static testcases.TC01_Registeration.*;

public class TC11_AddToCart extends Test_Base {

    @Test
    public void AddToCart_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        Thread.sleep(1000);
        Utilities.captureScreenshot(driver, "P_addToCart");

    }

}
