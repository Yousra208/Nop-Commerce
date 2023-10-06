package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P17_ConfirmOrder {
    WebDriver driver;

    public P17_ConfirmOrder(WebDriver driver){
        this.driver = driver;
    }
    private final By ConfirmOrderButton = By.xpath("//button[@onclick='ConfirmOrder.save()']");
    private final By SuccessfulOrder = By.xpath("//div[@class='section order-completed']");

    public P17_ConfirmOrder clickConfirmOrderButton() {
        driver.findElement(ConfirmOrderButton).click();
        return this;
    }
    public boolean orderCreatedSuccessfully(){
        return driver.findElement(SuccessfulOrder).isDisplayed();
    }

}
