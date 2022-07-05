package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				monochrome = true,
				plugin = { "pretty","html:target/reports/cucumber-pretty.html" },
				features = "src/test/java/feature", 
				glue = "stepDef",
//				tags = "@tag2",
				dryRun = false
		
		)

public class runner {

}
