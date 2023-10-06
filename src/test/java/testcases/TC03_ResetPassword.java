package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_ResetPassword;
import utility.Utilities;

public class TC03_ResetPassword extends Test_Base {
    static String EMAIL = TC01_Registeration.EMAIL;

    @Test
    public void resetPassword() throws InterruptedException {
        new P03_ResetPassword(driver).getLoginBtn().clickForgotPasswordBtn().addRecoveryEmail(EMAIL).clickSendBtn();
        Thread.sleep(1000);
        Utilities.captureScreenshot(driver, "restPassword");
        Assert.assertTrue(new P03_ResetPassword(driver).confirmResetPassword());

    }
}
