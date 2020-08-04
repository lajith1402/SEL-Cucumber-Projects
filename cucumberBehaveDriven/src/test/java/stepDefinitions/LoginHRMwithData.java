package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginHRMwithData {

	WebDriver dr;

	@Given("^Open the Orange HRM URL in the browser$")
	public void open_the_Orange_HRM_URL_in_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions		
		System.setProperty("webdriver.chrome.driver", "F:\\Ajeeth\\SELENIUM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		dr.manage().window().maximize();
//		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		    
	}


	//	\"(.*?)\" ----> convert into string 	
	@When("^User enters valid credentials in username \"(.*?)\" and password \"(.*?)\"$")
	public void user_enters_valid_credentials_in_username_and_password(String uname, String pword) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("txtUsername")).sendKeys(uname);
		dr.findElement(By.id("txtPassword")).sendKeys(pword);
	}

	
	
/*	@When("^User enters valid credentials in username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_credentials_in_username_and_password(String uname, String pword) throws Throwable {
		dr.findElement(By.id("txtUsername")).sendKeys(uname);
		dr.findElement(By.id("txtPassword")).sendKeys(pword);		
	}
*/
	
	
	@And("^click on the Submit button$")
	public void click_on_the_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("btnLogin")).click();	    
	}

	@Then("^The Orange HRM page should be displayed$")
	public void the_Orange_HRM_page_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		boolean status = dr.findElement(By.linkText("Dashboard")).isDisplayed();
		Assert.assertTrue(status);

	}

}
