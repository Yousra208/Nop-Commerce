package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P09_AddToWishlist {
    WebDriver driver;
    private final By addToWishlist = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]");
    public P09_AddToWishlist(WebDriver driver){
        this.driver = driver;
    }

    public P09_AddToWishlist addToWishlist() {
        driver.findElement(addToWishlist).click();
        return this;
    }



}
