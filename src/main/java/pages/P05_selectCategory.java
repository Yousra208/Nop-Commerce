package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_selectCategory {
    WebDriver driver;

    public P05_selectCategory(WebDriver driver){
        this.driver = driver;
    }

    public static final By categoryList = By.xpath("//ul[@class= 'top-menu notmobile']");

}
