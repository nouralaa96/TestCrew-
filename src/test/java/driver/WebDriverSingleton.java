package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import utilities.ReadPropertiesFile;


import java.io.IOException;


public class WebDriverSingleton {

    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;

        private WebDriverSingleton() throws IOException {
            setDriverCapabilities(ReadPropertiesFile.setConfiguration().getProperty("Browser"));
        }
    public static WebDriverSingleton getDriverSingleton() throws IOException {
        if (webDriverSingleton == null)
            webDriverSingleton = new WebDriverSingleton();
        return webDriverSingleton;
    }
        private void setDriverCapabilities(String browserName) {
            if (browserName.equalsIgnoreCase("chrome")) {
                webDriver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                webDriver = new EdgeDriver();
            }
        }

        public  WebDriver getWebDriver() {
            return webDriver;
        }

        public void navigateTo(String link) {
            webDriver.navigate().to(link);
        }

        public void maximizeWindow() {
            webDriver.manage().window().maximize();
        }

        public  void close() {
            webDriver.quit();
        }


        @Test
      public void test(){

            WebDriver  webdriver22 = getWebDriver();
        //   navigateTo("https://subscribe.stctv.com/sa-en");
           maximizeWindow();

        }

}
