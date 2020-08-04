package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles/Expressions.feature", glue="stepDefinitions")
public class RunnerExpression {

}
