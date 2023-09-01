package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {
    //define driver
    WebDriver driver;
    public P02_LoginPage(WebDriver driver)
    {
        this.driver=driver;
        }

    public P02_LoginPage addUserEmail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
        return this;
    }

    public P02_LoginPage addUserPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public P02_LoginPage ClickLoginBtn() {
        driver.findElement(this.LoginBtn).click();

        return this;
    }

    //    //TODO:Define locators
//    @FindBy(xpath = "//input[@class=\"email\"]") //driver.findelement(By.xpath("")
//    WebElement Email;
//    @FindBy(xpath = "//input[@class=\"password\"]")
//    WebElement Password;
//    @FindBy(xpath = "//button[text()=\"Log in\"]")
//    WebElement LoginButton;
//
//    //define actions
//    public void login(String email,String password){
//        Email.sendKeys(email);
//        Password.sendKeys(password);
//        LoginButton.click();
//    }
//TODO// define locators by
    private final By email= By.xpath("//input[@class=\"email\"]");
    private final By password=By.xpath("//input[@class=\"password\"]");
    private final By LoginBtn=By.xpath("//button[text()=\"Log in\"]");


    //TODO:define setters and getters

    // TODO: define actions
    public void login(String email,String password){
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(LoginBtn).click();
    }
}
