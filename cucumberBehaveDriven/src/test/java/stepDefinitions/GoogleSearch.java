package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {
	WebDriver dr;

	@Given("^User is entering the google url google\\.co\\.in$")
	public void user_is_entering_the_google_url_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "F:\\Ajeeth\\SELENIUM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http:www.google.co.in");	    
		dr.manage().window().maximize();
	}
	

	@When("^the user is keying the search text \"([^\"]*)\"$")
	public void the_user_is_keying_the_search_text(String searchName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.name("q")).sendKeys(searchName);
	    
	}

	@When("^press the Enter key$")
	public void press_the_Enter_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	    
	}

	@Then("^the result is displayed to the user$")
	public void the_result_is_displayed_to_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   boolean result = dr.findElement(By.partialLinkText("Seleni")).isDisplayed();
	   if(result) {
		   System.out.println("Result is displayed");
	   }
	   
		
		
	}


	
	
}
