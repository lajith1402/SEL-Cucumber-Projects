$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/LoginOrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Orange HRM site",
  "description": "",
  "id": "login-to-the-orange-hrm-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login to Orange HRM page with valid credentials",
  "description": "",
  "id": "login-to-the-orange-hrm-site;login-to-orange-hrm-page-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open the Orange HRM URL in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters valid credentials in username \"Admin\" and password \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The Orange HRM page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrangeHRM.open_the_Orange_HRM_URL_in_the_browser()"
});
formatter.result({
  "duration": 38112830100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 43
    },
    {
      "val": "admin123",
      "offset": 64
    }
  ],
  "location": "LoginOrangeHRM.user_enters_valid_credentials_in_username_and_password(String,String)"
});
formatter.result({
  "duration": 1694252900,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeHRM.click_on_the_Submit_button()"
});
formatter.result({
  "duration": 8903800900,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeHRM.the_Orange_HRM_page_should_be_displayed()"
});
formatter.result({
  "duration": 301112900,
  "status": "passed"
});
});