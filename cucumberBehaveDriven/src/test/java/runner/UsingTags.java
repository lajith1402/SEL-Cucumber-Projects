package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles",
				 glue = "stepDefinitions",
				 dryRun=true,
				 monochrome = true,
				 tags={"@tagname1", "@tagname2"})  
// {"~@SimpleLogin", "@OpenGoogle"} represents "OR" condition, and use ~ symbol to ignore the specified tagname and run all other scenarios/feature files
		 
// tags={"@tagname1, @tagname2"}) represents "and" condition. Scenarios/feature files will execute if both the tags are defined

public class UsingTags {

}

