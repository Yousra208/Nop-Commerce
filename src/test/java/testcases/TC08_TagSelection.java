package testcases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P02_LoginPage;
import pages.P08_TagSelection;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC08_TagSelection extends Test_Base {

    @Test
    public void SelectTag_P() {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P08_TagSelection(driver).selectCategory().selectTag();
        Utilities.captureScreenshot(driver, "select tag");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P08_TagSelection(driver).tagConfirmation());
        softAssert.assertAll();
    }
}
