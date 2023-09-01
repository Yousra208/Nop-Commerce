package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

import java.util.Random;

public class P01_Registration {
    static WebDriver driver;
    Select select;

    public P01_Registration(WebDriver driver) {
        this.driver = driver;
    }


    //    public P02_Registration(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(xpath = "//input[@name='FirstName']")
//    WebElement First_Name;
//
//    @FindBy(xpath = "//input[@name='LastName']")
//    WebElement Last_Name;
//    @FindBy(id = "Email")
//    WebElement Mail;
//    @FindBy(id = "Password")
//    WebElement Pass;
//    @FindBy(xpath = "//Select[@name='DateOfBirthDay']")
//    WebElement birthDay;
//
//    @FindBy(xpath = "//Select[@name='DateOfBirthMonth']")
//    WebElement birthMonth;
//    @FindBy(xpath = "//Select[@name='DateOfBirthYear']")
//    WebElement birthYear;
//    @FindBy(id = "ConfirmPassword")
//    WebElement Confirm_Password;
//    @FindBy(xpath = "//button[@name='register-button']")
//    WebElement RegisterBtn;

    ////    define actions
//       public void registration(String firstname, String lastname, String mail, String pass, String confirm_Password) throws InterruptedException {
//        First_Name.sendKeys(firstname);
//        Last_Name.sendKeys(lastname);
//
//
//    // select.selectByIndex(2);
//        birthDay.click();
//        Select selectDay = new Select(birthDay);
//        selectDay.selectByIndex(new Random().nextInt(selectDay.getOptions() .size()));
//        Thread.sleep(1000);
//
//        birthMonth.click();
//        Select selectMonth = new Select(birthMonth);
//        selectMonth.selectByIndex(new Random().nextInt(selectMonth.getOptions().size()));
//        Thread.sleep(1000);
//        //selectMonth.selectByVisibleText("March");
//
//        birthYear.click();
//        Select selectYear = new Select(birthYear);
//        selectYear.selectByIndex(new Random().nextInt(selectYear.getOptions().size()));
//        Thread.sleep(1000);
//        //selectYear.selectByValue("1994");
//
//        Mail.sendKeys(mail);
//        Pass.sendKeys(pass);
//        Confirm_Password.sendKeys(confirm_Password);
//
//        RegisterBtn.click();
//      }
//     TODO: define locators By
    private final By first_name = By.xpath("//input[@name='FirstName']");
    private final By last_name = By.xpath("//input[@name='LastName']");
    private final By email = By.id("Email");
     private final  By birth_day = By.xpath("//Select[@name='DateOfBirthDay']");
    private final By birth_month = By.xpath("//Select[@name='DateOfBirthMonth']");



    private final By birth_year = By.xpath("//Select[@name='DateOfBirthYear']");
    private final By Password = By.id("Password");
    private final By Confirm_password = By.id("ConfirmPassword");
    private final By RegisterBtn = By.xpath("//button[@name='register-button']");

    public P01_Registration addFirst_name(String firstName) {
        driver.findElement(this.first_name).sendKeys(firstName);
        return this;
    }
//
    public P01_Registration addLast_name(String lastName) {
        driver.findElement(this.last_name).sendKeys(lastName);
        return this;
    }

    public P01_Registration addEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public P01_Registration addBirth_day() {
        select=new Select(driver.findElement(this.birth_day));
        select.selectByIndex(Utilities.generateRandomInteger(1,30));
//        driver.findElement(this.birth_day);
        return this;
    }

    public P01_Registration addBirth_month() {
        select=new Select(driver.findElement(this.birth_month));
        select.selectByIndex(Utilities.generateRandomInteger(1,12));
        return this;
    }

    public P01_Registration addBirth_year() {
        select=new Select(driver.findElement(this.birth_year));
        select.selectByIndex(Utilities.generateRandomInteger(1,30));
        return this;
    }
    public P01_Registration addPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P01_Registration addConfirm_password(String confirmPassword) {
        driver.findElement(this.Confirm_password).sendKeys(confirmPassword);
        return this;
    }

    public P01_Registration clickRegisterBtn() {
        driver.findElement(this.RegisterBtn).click();
        return this;
    }

//    TODO:define setters and getters

    //     TODO: define actions
    public void registration(String first_name, String last_name, String email, String password, String confirm_password) throws InterruptedException {
        driver.findElement(this.first_name).sendKeys(first_name);
        driver.findElement(this.last_name).sendKeys(last_name);
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.Password).sendKeys(password);

        driver.findElement(this.Confirm_password).sendKeys(confirm_password);

        Select day = new Select(driver.findElement(birth_day));
        day.selectByIndex(new Random().nextInt(day.getOptions().size()));
      Thread.sleep(1000);

        Select month = new Select(driver.findElement(birth_month));
        day.selectByIndex(new Random().nextInt(month.getOptions().size()));
        Thread.sleep(1000);

        Select year = new Select(driver.findElement(birth_year));
        day.selectByIndex(new Random().nextInt(year.getOptions().size()));
        Thread.sleep(1000);
        driver.findElement(RegisterBtn).click();

    }
}



