package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExamples {
	WebDriver dr;

@Given("^Enter the HRM Orange URL in the browser$")
public void enter_the_HRM_Orange_URL_in_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "F:\\Ajeeth\\SELENIUM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	dr = new ChromeDriver();
	dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	dr.manage().window().maximize();
}


@When("^Enter the user credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_the_user_credentials_and(String uname, String pword) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dr.findElement(By.id("txtUsername")).sendKeys(uname);
	dr.findElement(By.id("txtPassword")).sendKeys(pword);
    
}

@When("^click Submit button$")
public void click_Submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dr.findElement(By.id("btnLogin")).click();	    
    
}



}
