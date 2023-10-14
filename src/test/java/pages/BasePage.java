package pages;

import driver.WebDriverSingleton;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.CountryDataUtility;
import utilities.JsonReader;
import utilities.WaitUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class BasePage extends AbstractTestNGCucumberTests {

    WebDriverSingleton driverSingleton;

    {
        try {
            driverSingleton = WebDriverSingleton.getDriverSingleton();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    WebDriver driver = driverSingleton.getWebDriver();
    WaitUtils wait  = new WaitUtils(driver);;


    @BeforeSuite
    public void setup() throws IOException {
        driverSingleton.maximizeWindow();

    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.close();
        }
    }
}