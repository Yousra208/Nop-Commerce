package testcases;

import org.testng.annotations.Test;
import pages.P04_ProductSearch;

public class TC04_ProductSearch extends Test_Base{

    String searchText = "desktops";

    @Test
    public void SearchProduct_P() throws InterruptedException {
   new P04_ProductSearch(driver).addSearchText(searchText).clickSearchBtn();
   Thread.sleep(4000);
    }
}
