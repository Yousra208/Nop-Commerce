package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_Registration;

public class TC01_Registeration extends Test_Base {
    // P02_Registration registration;
    private static Faker faker = new Faker();
    static final String First_Name = faker.name().firstName();
    static final String Last_Name = faker.name().lastName();
    static String EMAIL = faker.internet().emailAddress();
    static String Email2 = EMAIL;
    static String PASSWORD = faker.internet().password();
    private static String Confirm_password = PASSWORD;


    @Test
    public void emailExisting_N() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addPassword(PASSWORD).addConfirm_password(Confirm_password).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).clickRegisterBtn();
        Assert.assertTrue(new P01_Registration(driver).confirmRegistrationSuccessfully());
    }

        @Test
        public void emailExisting() {
            new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addPassword(PASSWORD).addConfirm_password(Confirm_password).addBirth_day().addBirth_month().addBirth_year().addEmail(Email2).clickRegisterBtn();

        Assert.assertTrue(new P01_Registration(driver).emilExists_N());
        }
    }




