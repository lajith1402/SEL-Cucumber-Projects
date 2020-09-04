package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

public class BackgroundHooks {
	
	@Before
	public void beforeAllScenario() {
		System.out.println("This should be the first message");
	}
	
	@Before(order=1)
	public void beforeMediScenario() {
		System.out.println("This should be the Medicine msg");
	}
	
	@After(order=1)
	public void afterAllScenario() {
		System.out.println("This should be the last message of each scenario");
	}
	
	@After("@Medicine")  // tagged hooks style
	public void afterMediScenario() {
		System.out.println("This should be the last message of Meidicine scenario");
	}
	
	
	@Before("@Agri, @Medicine") // tagged hooks style
	public void beforeAgriMedicine() {
		System.out.println("Should run this scenario before Agri and Medicine");
	}	
	
	@After("@Agri")
	public void afterAgri() {
		System.out.println("This should run after Agri scripts");
	}
	
	@After(order=0)
	public void afterscenario() {
		System.out.println("This should be the prev to last message");
	}
	
	@After
	public void lastScenario() {
		System.out.println("This is the last msg of this prg");
	}
	
}
