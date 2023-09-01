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
    private ChromeOptions options;
    Faker faker=new Faker();

    @Parameters("browser")
    @BeforeTest()
    public void setupChromeDriver(String browser) throws InterruptedException {
//        options = new ChromeOptions();
//        // TODO: handle browsers options
//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("credentials_enable_service", false);
//        prefs.put("profile.password_manager_enabled", false);
//
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-web-security");
//        options.addArguments("--no-proxy-server");
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--no-sandbox");
//        options.setExperimentalOption("prefs", prefs);
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
        driver= DriverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
//        Thread.sleep(5000);
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
