package TestRunner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		// features= {".//Features/"},
		// features = { ".//src/test/java/FeatureFiles/Regression.feature" },
		// features = { ".//src/test/resources/FeatureFiles/smoke.feature" },
		features = { ".//src/test/java/FeatureFiles/ZigWheels.feature" },
		// features= {"@target/rerun.txt"},
		glue = "StepDefinition", plugin = { "pretty", "html:reports/myreport.html" }

//					dryRun=false,    // checks mapping between scenario steps and step definition methods
//					monochrome=true,    // to avoid junk characters in output
//					publish=true   // to publish report in cucumber server
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
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}

}
