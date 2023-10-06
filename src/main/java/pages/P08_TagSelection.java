package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_TagSelection {
    WebDriver driver;

    public P08_TagSelection(WebDriver driver){
        this.driver = driver;
    }

    public P08_TagSelection selectCategory() {
        driver.findElement(Category).click();
        return this;
    }
    public P08_TagSelection selectTag() {
        driver.findElement(Tag).click();
        return this;
    }


    private final By Category = By.xpath("//a[text()='Computers '][1]");
    private final By Tag = By.xpath("//a[@href='/camera']");
    private final By TagSelectedConfirm = By.xpath("//div[@class='page product-tag-page']");

    public boolean tagConfirmation(){
    return driver.findElement(this.TagSelectedConfirm).getText().contains("Products tagged with");
    }
}
