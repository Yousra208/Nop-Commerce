package testcases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P05_SelectCategory;
import pages.P09_AddToWishlist;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC05_SelectCategory extends Test_Base {
    @Test
    public void selectCategory_P() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P05_SelectCategory(driver).viewCategoryMain().selectSubCategoryList();
        new P09_AddToWishlist(driver).addToWishlist();
        Utilities.captureScreenshot(driver, "select category");
        Thread.sleep(1000);


    }
}
