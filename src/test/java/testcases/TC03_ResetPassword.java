package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P03_ResetPassword;

public class TC03_ResetPassword extends Test_Base{
    P03_ResetPassword resetPassword;
    String Email = "yousra.ashour2020@gmail.com";



    @Test
    public void resetPassword() throws InterruptedException {
        resetPassword = new P03_ResetPassword(driver);
        new P03_ResetPassword(driver).getLoginBtn().clickForgotPasswordBtn().addRecoveryEmail(Email).clickSendBtn();
        Thread.sleep(1000);
        new P03_ResetPassword(driver).viewSuccessMsg();

    }
}
