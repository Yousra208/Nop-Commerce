package testcases;

import com.github.javafaker.Faker;
import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static drivers.DriverHolder.setDriver;


public class Test_Base {
    WebDriver driver;

    @Parameters("browser")
    @BeforeTest()
    public void setupDriver(String browser) throws InterruptedException {

        driver= DriverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
    @AfterTest
    public void quit(){
        driver.quit();
    }

}
