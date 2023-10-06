package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_AddToCart {

        WebDriver driver;

        public P11_AddToCart(WebDriver driver) {
            this.driver = driver;
        }

    public P11_AddToCart AddFirstProductToCart() {
            driver.findElement(addProductToCart).click();
        return this;
    }

    public P11_AddToCart OpenCartPage() {
            driver.findElement(openCartPage).click();
        return this;
    }

    private By addProductToCart = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]");
        private By openCartPage = By.xpath("//a[@class='ico-cart']");

}
