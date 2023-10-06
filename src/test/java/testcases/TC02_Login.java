package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import utility.Utilities;
import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;


public class TC02_Login extends Test_Base {

    @Test(priority = 1)
    public void login_user_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).logoutButton();
        Utilities.captureScreenshot(driver, "loginImg");
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).logoutButton());
    }

    @Test(priority = 2)
    public void loginWithInvalidEmailandValidPassw0rd_N() throws InterruptedException {
        EMAIL = "test@yahoo.com";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }

    @Test(priority = 3)
    public void loginWithValidEmailandInValidPassw0rd_N() throws InterruptedException {
        EMAIL = "yousra.ashour2020@gmail.com";
        PASSWORD = "test123";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        Utilities.captureScreenshot(driver, "loginImg");
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }

    @Test(priority = 4)
    public void loginWithInvalidEmailandInValidPassw0rd_N() throws InterruptedException {
        EMAIL = "test@yahoo.com";
        PASSWORD = "test12345";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }
}


