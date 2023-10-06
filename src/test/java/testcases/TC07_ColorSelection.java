package testcases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P07_ColorSelect;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC07_ColorSelection extends Test_Base {

    @Test
    public void selectColor_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P07_ColorSelect(driver).viewCategory().selectSubCategory().selectColor();
        Utilities.captureScreenshot(driver, "select color");
        Thread.sleep(5000);
    }
}
