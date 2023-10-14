package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {




    By SearchBarLocator = By.xpath("//input[@id='gh-ac']");
    By SearchButtonLocator = By.xpath("//input[@id='gh-btn']");


    public void navigateToEbay( String url) {
        driver.get(url);
    }

    public boolean isMainPageDisplayed() {
        return driver.getTitle().contains("Electronics, Cars, Fashion, Collectibles & More | eBay");
    }

    public void searchForItem(String searchItem) {
        driver.findElement(SearchBarLocator).sendKeys(searchItem);
        driver.findElement(SearchButtonLocator).click();
    }

}
