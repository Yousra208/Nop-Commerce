package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class P06_SelectCurrency {
    WebDriver driver;
    Select select;
    public P06_SelectCurrency(WebDriver driver) {
        this.driver = driver;
    }
    private final By currencyOptions = By.id("customerCurrency");

    public P06_SelectCurrency getCurrencyList() {
        select=new Select(driver.findElement(this.currencyOptions));
        select.selectByIndex(Utilities.generateRandomInteger(0,1));
        return this;
    }
}