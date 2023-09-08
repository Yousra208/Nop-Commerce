package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P01_Registration;

import static testcases.TC01_Registeration.*;


public class TC02_Login extends Test_Base {

    @Test(priority = 1)
    public void Login_user_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).logoutButton();
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).logoutButton());
    }

    @Test(priority = 2)
    public void LoginWithInvalidEmailandValidPassw0rd_N() throws InterruptedException {
        EMAIL = "test@yahoo.com";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }

    @Test(priority = 3)
    public void LoginWithValidEmailandInValidPassw0rd_N() throws InterruptedException {
        EMAIL = "yousra.ashour2020@gmail.com";
        PASSWORD = "test123";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        //Assert Result
        Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }

    @Test(priority = 4)
    public void LoginWithInvalidEmailandInValidPassw0rd_N() throws InterruptedException {
        EMAIL = "test@yahoo.com";
        PASSWORD = "test12345";
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P02_LoginPage(driver).loginErrorMessage();
        //Assert Result
         Assert.assertTrue(new P02_LoginPage(driver).loginErrorMessage());
    }
}


