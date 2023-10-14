package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.CountryDataUtility;
import utilities.JsonReader;

import java.util.List;
import java.util.Map;

import static utilities.CountryDataUtility.getCountryData;

public class StcSubscriptionPackageStepdefs {
    HomePage homePage = new HomePage();
    List<Map<String, Object>> countries;

    {
        try {
            countries = JsonReader.readJsonData(
                    System.getProperty("user.dir") + "/src/main/resources/testData.json", "countries");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    Map<String, Object> countryData ;
    CountryDataUtility countryDataUtility = new CountryDataUtility();

    @Given("user Navigate to STC Tv Website")
    public void user_navigate_to_stc_tv_website() {
        homePage.loadPage();
    }

    @When("user select {string}")
    public void user_selectCountry(String country ) {
        homePage.chooseCountry(country);
    }



    @Then("user Should see lite plan price in {string} currency and selected language")
    public void user_should_see_lite_plan_price_in_country_currency_and_selected_language(String country) throws Exception {
        getCountryData(country, countries);
        homePage.elementValueAssertion(HomePage.litePrice, CountryDataUtility.getPriceForType(country,"LITE",countries).toString());
        homePage.elementValueAssertion(HomePage.classicCurrency, CountryDataUtility.getCurrency(country,countries).toString());
    }

    @Then("user Should see classic plan price in {string} currency and selected language")
    public void user_should_see_classic_plan_price_in_country_currency_and_selected_language(String country) throws Exception {
        getCountryData(country, countries);
        homePage.elementValueAssertion(HomePage.classicPrice, CountryDataUtility.getPriceForType(country,"CLASSIC",countries).toString());
        homePage.elementValueAssertion(HomePage.classicCurrency, CountryDataUtility.getCurrency(country,countries).toString());

    }

    @Then("user Should see permium plan price in {string} currency and selected language")
    public void user_should_see_permium_plan_price_in_country_currency_and_selected_language(String country) throws Exception {
        getCountryData(country, countries);
        homePage.elementValueAssertion(HomePage.premiumPrice, CountryDataUtility.getPriceForType(country,"PREMIUM",countries).toString());
        homePage.elementValueAssertion(HomePage.classicCurrency, CountryDataUtility.getCurrency(country,countries).toString());

    }


}