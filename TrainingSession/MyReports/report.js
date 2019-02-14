$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Promantus Inc/Katalon Studio/TrainingSession/Include/features/Login.feature");
formatter.feature({
  "name": "Login for Test Demo Site",
  "description": "  I want to use this template for my Demo Site",
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
formatter.uri("C:/Users/Promantus Inc/Katalon Studio/TrainingSession/Include/features/OrangeHRMLogin.feature");
formatter.feature({
  "name": "Login for Orange HRM  Site",
  "description": "  I want to use this template for my Orange HRM site",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Navigate to Orange HRM Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "User has to be loggedin",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "Navigate to Orange HRM Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.navigate_to_Orange_HRM_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username admin",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.user_enters_username_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password admin123",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.user_enters_password_admin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to be loggedin",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.user_has_to_be_loggedin()"
});
formatter.result({
  "status": "passed"
});
});