package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P01_Registration;


public class TC01_Login extends Test_Base {
//    P01_LoginPage loginUser;
    P01_Registration registration;
    private static Faker faker = new Faker();
    private static final String First_Name = faker.name().firstName();
    private static final String Last_Name = faker.name().lastName();
    static final String EMAIL = faker.internet().emailAddress();
    static final String PASSWORD = faker.internet().password();
    private static final String Confirm_password = PASSWORD;

//    private String loginEmail=faker.internet().emailAddress();
//    private  String loginPassword= faker.internet().password();

    @Test
    public void Login_user_P() throws InterruptedException {
//        loginUser =new P01_LoginPage(driver);
        registration=new P01_Registration(driver);
        // TODO: step1- click register tap in home page
        driver.findElement(By.xpath("//a[@class= 'ico-register']")).click();
        // TODO: step2- register new user
         registration.registration(First_Name,Last_Name,EMAIL,PASSWORD,Confirm_password);
        // TODO: step3- login
        driver.findElement(By.xpath("//a[@class= 'ico-login']")).click();
        //loginUser.login(EMAIL,PASSWORD);
        new P02_LoginPage(driver).addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
    }
}

