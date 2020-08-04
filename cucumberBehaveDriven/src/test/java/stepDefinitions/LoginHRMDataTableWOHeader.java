package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginHRMDataTableWOHeader {

	WebDriver dr;

	@Given("^Open Orange HRM page$")
	public void open_Orange_HRM_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "F:\\Ajeeth\\SELENIUM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		dr.manage().window().maximize();

	}

	@When("^Enter the login credentials through data table$")
	public void enter_the_login_credentials_through_data_table(DataTable datatbl) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		List<String> credentials = datatbl.asList(String.class);
		String uname = credentials.get(0);  //1st value of the datatable in feature file
		String pword = credentials.get(1); //2nd value of the datatable in feature file
		
		dr.findElement(By.id("txtUsername")).sendKeys(uname);
		dr.findElement(By.id("txtPassword")).sendKeys(pword);

	}

	@When("^Click on the Login button$")
	public void click_on_the_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("btnLogin")).click();	

	}

	@Then("^Home page is navigated$")
	public void home_page_is_navigated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		boolean status = dr.findElement(By.linkText("Dashboard")).isDisplayed();
		Assert.assertTrue(status);

	}



}
