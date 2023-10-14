package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (features = "src/test/java/tests/StcSubscriptionPackages.feature",
        plugin = {"html:reports/Stc.html"},
        monochrome = true,
        tags =("@PricePlansEn")
)

public class StcSubscriptionPackagesTestRunner extends AbstractTestNGCucumberTests {



}
