Feature: Login to Orange HRM page using data through table without header
Scenario: Login to OrangeHRM page using data table
	Given Open Orange HRM page
	When Enter the login credentials through data table
	|Admin |admin123 |
	When Click on the Login button
	Then Home page is navigated