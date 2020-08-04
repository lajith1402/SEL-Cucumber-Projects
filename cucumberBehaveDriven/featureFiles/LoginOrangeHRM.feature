Feature: Login to the Orange HRM site
Scenario: Login to Orange HRM page with valid credentials
Given Open the Orange HRM URL in the browser
When User enters valid credentials in username "Admin" and password "admin123" 
And click on the Submit button
Then The Orange HRM page should be displayed