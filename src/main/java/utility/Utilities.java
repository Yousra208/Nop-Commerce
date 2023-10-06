package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Utilities {
    public static int generateRandomInteger(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("The minimum value must be less than or equal to the maximum value.");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        int randomInteger = generateRandomInteger(10, 20);
        System.out.println("The random integer is: " + randomInteger);
    }
    //TODO CAPTURE SCREENSHOT
    public static void captureScreenshot(WebDriver driver,String screenshotName){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        Date currntDate=new Date();
        String screenshot=screenshotName+currntDate.toString().replace(" ","-").replace(":","-");
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"/src/test/resources/screenshots/"+screenshot+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
