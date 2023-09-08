package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
                return this;
        }
        private final By Search = By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
        private final By searchBtn = By.xpath("//button[@class='button-1 search-box-button']");
        private final By searchResult = By.xpath("//label[text()='Search keyword:']");
        public boolean searchResultConfirm() {
                return driver.findElement(this.searchResult).isDisplayed();
        }

}
