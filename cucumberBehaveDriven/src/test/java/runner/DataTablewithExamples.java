package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles//DataTablewithExamples.feature", glue = "stepDefinitions")
public class DataTablewithExamples {

}
