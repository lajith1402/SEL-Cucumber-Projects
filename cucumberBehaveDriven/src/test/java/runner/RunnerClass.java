package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/OpenGoogle.feature", glue="stepDefinitions")
public class RunnerClass {
	
	// this class should combine both feature file and step definition class

}
