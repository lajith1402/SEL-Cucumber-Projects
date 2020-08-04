package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginHRMwithDataHeader {
	WebDriver dr;
	
	@Given("^Enter HRM URL in the address bar of the browser$")
	public void enter_HRM_URL_in_the_address_bar_of_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "F:\\Ajeeth\\SELENIUM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		dr.manage().window().maximize();

	}

	@Given("^enter following login credentials in username and password$")
	public void enter_following_login_credentials_in_username_and_password(DataTable datatbl) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)		
		
	 List <Map<String, String>> credentials = datatbl.asMaps(String.class, String.class);
	  String username = credentials.get(0).get("UserName");
	  String pword = credentials.get(0).get("Password");
	  dr.findElement(By.id("txtUsername")).sendKeys(username);
	  dr.findElement(By.id("txtPassword")).sendKeys(pword);
	  
	}

	@When("^Click on the login button$")
	public void click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("btnLogin")).click();	
	    
		
	}

	@Then("^HRM Home page should get landed$")
	public void hrm_Home_page_should_get_landed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean status = dr.findElement(By.partialLinkText("Dash")).isDisplayed();
	    Assert.assertTrue(status);
	}



}
