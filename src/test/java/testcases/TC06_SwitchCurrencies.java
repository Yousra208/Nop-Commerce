package testcases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P06_SelectCurrency;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC06_SwitchCurrencies extends Test_Base {

    @Test
    public void selectCurrency_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P06_SelectCurrency(driver).getCurrencyList();
        Utilities.captureScreenshot(driver, "select currency");
        Thread.sleep(1000);
    }
}
