package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P04_ProductSearch;
import utility.Utilities;

import static testcases.TC01_Registeration.EMAIL;
import static testcases.TC01_Registeration.PASSWORD;

public class TC04_ProductSearch extends Test_Base {
    String searchText = "desktops";

    @Test
    public void searchProduct() throws InterruptedException {
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P04_ProductSearch(driver).addSearchText(searchText).clickSearchBtn();
        Utilities.captureScreenshot(driver, "search for product");

        Assert.assertTrue(new P04_ProductSearch(driver).searchResultConfirm());
    }
}
