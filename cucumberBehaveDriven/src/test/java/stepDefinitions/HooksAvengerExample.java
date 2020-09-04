package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksAvengerExample {
	
	@Given("^Thanos has infinity stones$")
	public void thanos_has_infinity_stones() throws Throwable {
		
		System.out.println("Thanos has infinity stones");
	    
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
		System.out.println("Thanos snaps his fingers");
	    
	}

	@Then("^Half of the population killed$")
	public void half_of_the_population_killed() throws Throwable {
		System.out.println("Half of the population killed");
	   
	}


	@Given("^Thanos birth is defined$")
	public void thanos_birth_is_defined() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos birth is defined");
	}

	@When("^Enters into the universe$")
	public void enters_into_the_universe() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enters into the universe");
	}

	@When("^Destory the universe$")
	public void destory_the_universe() throws Throwable {
	    System.out.println("Destoryed the universe");
	}

	

}
