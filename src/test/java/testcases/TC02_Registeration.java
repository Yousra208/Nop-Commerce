package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_Registration;

public class TC02_Registeration extends Test_Base {
   // P02_Registration registration;
    private static Faker faker = new Faker();
    private static final String First_Name = faker.name().firstName();
    private static final String Last_Name = faker.name().lastName();
    static final String EMAIL = faker.internet().emailAddress();
    static final String PASSWORD = faker.internet().password();
    private static final String Confirm_password = PASSWORD;

    @Test
    public void registerNewUser_P() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class= 'ico-register']")).click();
       // registration = new P02_Registration(driver);
       // registration.registration(First_Name, Last_Name, EMAIL, PASSWORD, Confirm_password);
        new P01_Registration(driver).addFirst_name(First_Name).addLast_name(Last_Name).addPassword(PASSWORD).addConfirm_password(Confirm_password).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).clickRegisterBtn();

    }

}


