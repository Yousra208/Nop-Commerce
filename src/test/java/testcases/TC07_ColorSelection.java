package testcases;

import org.testng.annotations.Test;
import pages.P01_Registration;
import pages.P02_LoginPage;
import pages.P07_ColorSelect;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;

public class TC07_ColorSelection extends Test_Base {

    @Test
    public void selectColor_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P07_ColorSelect(driver).viewCategory().selectSubCategory().selectColor();
        Thread.sleep(5000);
    }
}
