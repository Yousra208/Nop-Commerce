package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.Utilities;
import java.util.List;

public class P05_SelectCategory {
    WebDriver driver;

    public P05_SelectCategory(WebDriver driver) {
        this.driver = driver;
    }
    private final By mainCategory = By.xpath("//a[text()='Computers ']");
    private final By subCategoryList = By.xpath("//ul[@class='sublist first-level']");
    public P05_SelectCategory viewCategoryMain() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(mainCategory)).perform();
        return this;
    }
    public P05_SelectCategory selectSubCategoryList() {
        List<WebElement> productSelected = driver.findElements(subCategoryList);
        for (int i = 0; i < productSelected.size(); i++)
            productSelected.lastIndexOf(Utilities.generateRandomInteger(0, 10));
        System.out.println(productSelected);

        return this;
    }
}
