package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P07_ColorSelect {
    WebDriver driver;
    Select select;

    public P07_ColorSelect(WebDriver driver){
        this.driver = driver;
    }
    private final By Category = By.xpath("//a[text()='Apparel ']");
    private final By SubCategory = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a");
    private final By Color = By.xpath("//html/body/div[6]/div[3]/div/div[2]/div[1]/div/div[2]/ul/li[2]");


    public P07_ColorSelect viewCategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Category)).perform();
        return this;
    }
    public P07_ColorSelect selectSubCategory() {
        driver.findElement(SubCategory).click();
        return this;
    }
    public P07_ColorSelect selectColor() {
        driver.findElement(Color).click();

//        select=new Select(driver.findElement(this.Color));
//        select.selectByIndex(Utilities.generateRandomInteger(0,2));
        return this;
    }


}
