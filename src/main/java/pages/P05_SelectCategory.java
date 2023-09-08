package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P05_SelectCategory {
    WebDriver driver;

    public P05_SelectCategory(WebDriver driver) {
        this.driver = driver;
    }

    private final By mainCategory = By.xpath("//a[text()='Computers ']");

    private final By subCategoryList = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[size]");
    //List<WebElement> items = subCategoryList.findElements(By.tagName("li"));

    public P05_SelectCategory viewCategoryMain() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(mainCategory)).perform();
        return this;
    }

//    public P05_selectCategory selectSubCategory() {
////        Random random = new Random();
////        int index = random.nextInt(items.size());
////
////        // Get the item at the randomly generated index.
////        WebElement item = items.get(index);
////        System.out.println(item.getText());
//        driver.findElement(this.subCategoryList).click();
//        return this;


//public boolean ProductDisplayed() {
//    return driver.findElement(this.productTitle).isDisplayed();
//
//}



}
