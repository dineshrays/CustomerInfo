package bddDemo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStepDef {

	int flag = 0

	@Given("User is in BDD Demo Login Page (.*)")
	public void user_is_in_BDD_Demo_Login_Page(String loginUrl) {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(loginUrl)
		println "User is in Login Page"
	}

	@When("User enters username in BDD Demo (.*)")
	public void user_enters_username_in_BDD_Demo(String userName) {

		WebUI.setText(findTestObject('bddDemo_Login/input_UserName_UserName'), userName)

		if (userName != "" || userName != null){
			println"Entered if"
			flag = 1
		}
		else {
			println"Entered else"
		}


		println "User entered the username"
	}

	@When("user enters password  in BDD Demo (.*)")
	public void user_enters_password_in_BDD_Demo(String password) {
		WebUI.setText(findTestObject('bddDemo_Login/input_Password_Password'), password)
		//WebUI.delay(3)
		println "User entered the password"
	}


	@When("user clicks on Login button")
	def user_clicks_on_Login_button() {

		WebUI.delay(2)
		WebUI.click(findTestObject('bddDemo_Login/input_Password_btn btn-default'))
		//WebUI.delay(3)


		println "User clicks on login button"
	}

	@Then("Validate the username and password")
	def Validate_the_username_and_password() {

		println "Validate the username and password"
	}

	@Then("user should be logged in")
	def user_should_be_logged_in() {

		println "user has logged in"
		WebUI.closeBrowser()
	}

	@Then("user should be able to login successfully")
	def user_login_successfully() {

		//WebUI.click(findTestObject('bddDemo_Login/input_Password_btn btn-default'))
		WebUI.verifyTextPresent('PayBill', false)
		println"Successfully loggedin"
		WebUI.closeBrowser()
	}



	@Then("user should not be able to login successfully (.*)")
	def user_login_unsuccessfully(String errormsg) {

		WebUI.verifyTextPresent(errormsg, false)
		println"Unable to login"
		WebUI.closeBrowser()
	}
}
