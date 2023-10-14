package pages;

import driver.WebDriverSingleton;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import utilities.WaitUtils;
import java.io.IOException;

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
    WaitUtils wait = new WaitUtils(driver);
    ;


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