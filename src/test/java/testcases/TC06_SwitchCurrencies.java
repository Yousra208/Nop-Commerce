package testcases;

import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P06_SelectCurrency;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;


public class TC06_SwitchCurrencies extends Test_Base {
    P06_SelectCurrency selectCurrency;

    @Test
    public void selectCurrency_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P06_SelectCurrency(driver).getCurrencyList();
        Thread.sleep(2000);
    }
}
