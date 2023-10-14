package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pages.BasePage;

import java.io.IOException;

@CucumberOptions
        (features = "src/test/java/tests/StcSubscriptionPackages.feature",
                glue = {""},
                plugin = {"html:test-output/cucumber_reports/data.html"}
)


public class StcSubscriptionPackagesTestRunner extends BasePage {



}
