package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/BackgroundHooksExample.feature",
						  glue = {"stepDefinitions", "hooks"},
						  dryRun=false,
						  strict=false,
						  monochrome=true,
						  plugin="html://",
						  tags= {"@BackgroundHooksExample", "~@Agri"})

public class BackgroundHooksExample {

}
