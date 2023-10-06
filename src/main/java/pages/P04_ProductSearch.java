package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P04_ProductSearch {
    static WebDriver driver;

    public P04_ProductSearch(WebDriver driver) {
        this.driver = driver;
    }

    public P04_ProductSearch addSearchText(String search) {
        driver.findElement(this.Search).sendKeys(search);
        return this;
    }

    public P04_ProductSearch clickSearchBtn() {
        driver.findElement(this.searchBtn).click();
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 400).perform();
        return this;
    }

    private final By Search = By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
    private final By searchBtn = By.xpath("//button[@class='button-1 search-box-button']");
    private final By searchResult = By.xpath("//label[text()='Search keyword:']");

    public boolean searchResultConfirm() {
        return driver.findElement(this.searchResult).isDisplayed();
    }

}
