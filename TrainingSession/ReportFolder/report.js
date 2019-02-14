$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login the user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Navigate to Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.Navigate_to_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_has_to_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
});