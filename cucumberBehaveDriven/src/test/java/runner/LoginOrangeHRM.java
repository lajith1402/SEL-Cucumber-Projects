package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/LoginOrangeHRM.feature", 
				glue="stepDefinitions",
				dryRun=false,
				strict=true,
				monochrome=true,
				format= {"html:report/Webreport", "json:report/jsonreport.json", "junit:report/xmlreport.xml"}) 
         // use this 'format' keyword to generate report in html, json, etc.
         // use "plugin" keyword instead of 'format' in the script
public class LoginOrangeHRM {

}
