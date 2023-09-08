package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_AddToCompareList {
    WebDriver driver;

    public P10_AddToCompareList(WebDriver driver){
        this.driver = driver;
    }

    public P10_AddToCompareList AddToComparelist() {
        driver.findElement(addToComparelist).click();
        return this;
    }

    private final By addToComparelist = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]");
    private final By SuccessBar = By.xpath("//div[@class='bar-notification success']");


    public boolean ProductAddedToComparelist() {
        return driver.findElement(this.SuccessBar).isDisplayed();
    }

}
