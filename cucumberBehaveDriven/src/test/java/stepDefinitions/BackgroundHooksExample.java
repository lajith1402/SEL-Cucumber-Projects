package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundHooksExample {
	
	@Given("^Should have good education$")
	public void should_have_good_education() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Background message - Should have good education");
	}

	@Given("^Good knowledge$")
	public void good_knowledge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Background Msg2 - Good Knowledge");
	}
	

	@Given("^Student should have good marks in Biology$")
	public void student_should_have_good_marks_in_Biology() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student should have good marks in Biology - Medicine");
	}

	@Given("^Student should pass HSC course$")
	public void student_should_pass_HSC_course() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student should pass HSC course for Medicine");
		
	}

	@Then("^Get into Medical college$")
	public void get_into_Medical_college() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Join to Medical College");
	}

	
	@Given("^Student scored good marks in Maths$")
	public void student_scored_good_marks_in_Maths() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student scored good marks in Maths");
	}

	@Given("^Student should pass Higher secondary$")
	public void student_should_pass_Higher_secondary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student should pass Higher secondary");
	}

	@Then("^Get into Engng college$")
	public void get_into_Engng_college() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Join Engg college");
	}	
	
	
	@Given("^Student scored good marks in Science$")
	public void student_scored_good_marks_in_Science() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("For Agri - Student scored good marks in Science");
	}

	@Given("^Student pass all courses$")
	public void student_pass_all_courses() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student pass all courses");
	}

	@Then("^Get into Agricult college$")
	public void get_into_Agricult_college() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Get into Agricult college");
	}
	
}
