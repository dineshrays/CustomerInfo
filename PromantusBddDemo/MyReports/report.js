$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To login a valid user credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in BDD Demo Login Page \u003cUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username in BDD Demo \u003cUserName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters password  in BDD Demo \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Url",
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "http://promantusbdddemo.azurewebsites.net/Account/Login",
        "Promantus",
        "bdd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To login a valid user credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in BDD Demo Login Page http://promantusbdddemo.azurewebsites.net/Account/Login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_is_in_BDD_Demo_Login_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username in BDD Demo Promantus",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_username_in_BDD_Demo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password  in BDD Demo bdd",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_enters_password_in_BDD_Demo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/MakePayment.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To make a payment with valid Payment details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in BDD Demo Login Page \u003cUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username in BDD Demo \u003cUserName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password  in BDD Demo \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user is redirected to paybill page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters dayofpayment",
  "keyword": "And "
});
formatter.step({
  "name": "user enters amount",
  "keyword": "And "
});
formatter.step({
  "name": "user enters SwiftCode",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on make payment",
  "keyword": "When "
});
formatter.step({
  "name": "user is redirected to otp page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the otp",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on submit otp",
  "keyword": "And "
});
formatter.step({
  "name": "user should see the payment successful page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Url",
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "http://promantusbdddemo1.azurewebsites.net",
        "Promantus",
        "bdd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To make a payment with valid Payment details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in BDD Demo Login Page http://promantusbdddemo1.azurewebsites.net",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_is_in_BDD_Demo_Login_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username in BDD Demo Promantus",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_enters_username_in_BDD_Demo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password  in BDD Demo bdd",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_enters_password_in_BDD_Demo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is redirected to paybill page",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_is_redirected_to_paybill_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dayofpayment",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_enters_dayofpayment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters amount",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_enters_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters SwiftCode",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_enters_SwiftCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on make payment",
  "keyword": "When "
});
formatter.match({
  "location": "MakePaymentStepDef.user_clicks_on_make_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is redirected to otp page",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_is_redirected_to_otp_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the otp",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_enters_the_otp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit otp",
  "keyword": "And "
});
formatter.match({
  "location": "MakePaymentStepDef.user_clicks_on_submit_otp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the payment successful page",
  "keyword": "Then "
});
formatter.match({
  "location": "MakePaymentStepDef.user_should_see_the_payment_successful_page()"
});
formatter.result({
  "status": "passed"
});
});