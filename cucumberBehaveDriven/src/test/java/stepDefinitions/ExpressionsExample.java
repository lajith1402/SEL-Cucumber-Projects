package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.No;

public class ExpressionsExample {

	// write the below script for my own reference @Given
	// Regular Expression: integer= (/d+) ; For String=

	// the integer value should NOT be hardcoded.. use (\\d+) should be passing integer value
	@Given("^I have (\\d+) system$")   
	public void I_have_1_system(int count) {		
		System.out.println("No. of system:" +count);	
	}
	// for float value (use (\\d+\\.\\d+)), the function considers 2 different integer but pass as single argument
	@Given("^I got (\\d+\\.\\d+) percentage$") 
	public void i_got_percentage(float decim) throws Throwable {
		System.out.println("Mark: "+decim);		
	}
	
    // for string value -use (.*?) it accepts all characters as string except end of line (/n); {e.g. "Ajeeth"= \"(.*?)\" }
	//  String name = "\"Ajeeth\""; 
	@Given("^\"(.*?)\" lives in \"(.*?)\" and \"(.*?)\"$")
	public void lives_in_and(String nam1, String nam2, String name3) throws Throwable {
		
		System.out.println("Name: " +nam1 +" City: "+ nam2 +" State: "+name3);
	   
	}

	@Then("^\"(.*?)\" likes travelling$")
	public void likes_travelling(String nam1) throws Throwable {
		System.out.println("Traveling: " +nam1);
	   
	}

	
	
	
}
