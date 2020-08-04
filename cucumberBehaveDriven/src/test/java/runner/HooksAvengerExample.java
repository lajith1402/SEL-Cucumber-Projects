package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles",
				glue = {"stepDefinitions", "hooks"},  
				dryRun = false,
				strict = false,
				monochrome = true,
				plugin = "html:report/hooksreport.html",
				tags = "@Hooks")
// In glue keyword use all packages that are all need to run and group with {} 

public class HooksAvengerExample {

}
