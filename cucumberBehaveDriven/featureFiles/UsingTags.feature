@SimpleLogin
Feature: Checking tags keyword in cucumber
Scenario: Simple login in any webpage using dryRun execution only
	Given Open the browser and enter URL
	Given Enter valid credentials
	Then click on Login button
	And Exit the webpage
	
@tagname1 @tagname2
Scenario: Second simple login in a webpage 
	Given Open browser and provide URL
	Given Enter credentials
	Then click on the submit button
	And Exit webpage

@tagname2
Scenario: Third easy login page
	Given Browser open and type URL
	Given Enter login details
	Then click submit button
	And quit the page