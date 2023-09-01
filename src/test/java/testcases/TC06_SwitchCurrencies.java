package testcases;

import org.testng.annotations.Test;
import pages.P06_SelectCurrency;


public class TC06_SwitchCurrencies extends Test_Base {
    P06_SelectCurrency selectCurrency;

    @Test
    public void selectCurrency_P() throws InterruptedException {
        selectCurrency = new P06_SelectCurrency(driver);
        selectCurrency.getCurrencyList();
        Thread.sleep(2000);
    }
}
