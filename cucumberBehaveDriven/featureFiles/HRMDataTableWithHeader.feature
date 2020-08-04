Feature: Login to HRM App using DataTable with Header
Scenario: Login scenario by passing credentials through data table
	Given Enter HRM URL in the address bar of the browser
	Given enter following login credentials in username and password
	|UserName|Password|
	|Admin|admin123|
	When Click on the login button
	Then HRM Home page should get landed 