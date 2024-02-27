package com.zigwheels.TestRunner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
// features= {".//Features/"},
//		features = { ".//src/test/resources/FeatureFiles/smoke.feature" },
		features = { ".//src/test/resources/FeatureFiles/ZigWheels.feature" },
//		features = { ".//src/test/resources/FeatureFiles/Regression.feature" },
//		features = { "@target/rerun.txt" }, 
		glue = "com.zigwheels.StepDefinition", plugin = { "pretty", "html:reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, // to avoid junk characters in output
		publish = true // to publish report in cucumber server
// tags="@smoke" // this will execute scenarios tagged with @sanity
// tags="@regression"
// tags="@smoke and @regression" //Scenarios tagged with both @sanity and
// @regression
// tags="@smoke and not @regression" //Scenarios tagged with @sanity but not
// tagged with @regression
// tags="@smoke or @regression" //Scenarios tagged with either @sanity or
// @regression
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
