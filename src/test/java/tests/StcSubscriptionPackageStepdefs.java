package tests;

import driver.WebDriverSingleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

import static driver.WebDriverSingleton.getDriverSingleton;

public class StcSubscriptionPackageStepdefs {




    @Given("user Navigate to STC Tv Website")
    public void user_navigate_to_stc_tv_website() throws IOException {
        HomePage homePage = new HomePage() ;
         homePage.loadPage();
    }

    @When("user select {string}")
    public void user_select(String string) {
    
    }

    @Then("user should see country name in the selected language")
    public void user_should_see_country_name_in_the_selected_language() {
    
    }

    @Then("user Should see lite plan price in country currency and selected language")
    public void user_should_see_lite_plan_price_in_country_currency_and_selected_language() {
    
    }

    @Then("user Should see classic plan price in country currency and selected language")
    public void user_should_see_classic_plan_price_in_country_currency_and_selected_language() {
    
    }

    @Then("user Should see permium plan price in country currency and selected language")
    public void user_should_see_permium_plan_price_in_country_currency_and_selected_language() {
    
    }


}
