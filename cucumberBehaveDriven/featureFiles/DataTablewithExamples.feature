Feature: Login to the HRM Orange application
Scenario Outline: Check the login scenario using examples data
	Given Enter the HRM Orange URL in the browser
	When Enter the user credentials "<UserName>" and "<PassWord>"
	And click Submit button
	
Examples:
|UserName |PassWord|
|Admin |admin123|
|Test12 |admin11|