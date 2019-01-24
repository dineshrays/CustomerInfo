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


class RegistrationStepDef {
	@Given("User is in Register Page")
	def User_is_in_Register_Page() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://promantusbdddemo.azurewebsites.net/Account/Register')
		println "User is in Register Page"
	}

	@When("User enters the First Name")
	def User_enters_the_First_Name() {

		WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_FirstName_FirstName'), 'PromantusInc')
		println "User entered the first name"
	}

	@When("User enters the NameID")
	def User_enters_the_NameID() {

		WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_NameId_NameId'), 'Pro2034Inc1')

		println "User entred the NameId"
	}

	@When("User enters the Email")
	def User_enters_the_Email() {

		WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_Email_Email'), 'PromantusInc@gmail.com')

		println "User entered the email"
	}

	@When("User enters the UserName")
	def User_enters_the_UserName() {

		WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_UserName_UserName'), 'PromantusInc')
		println "User entred the username"
	}

	@When("User enters the Password")
	def User_enters_the_Password() {

		WebUI.setEncryptedText(findTestObject('Object Repository/bddDemo_Register/input_Password_Password'),
				'tzH6RvlfSTg=')

		println "User entered the password"
	}

	@When("User enters the Confirm Password")
	def User_enters_the_Confirm_Password() {

		WebUI.setEncryptedText(findTestObject('Object Repository/bddDemo_Register/input_ConfirmPassword_ConfirmP'),
				'tzH6RvlfSTg=')

		println "User entered the confirm password"
	}

	@Then("User clicks on Register button")
	def User_clicks_on_Register_button() {

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/bddDemo_Register/input_ConfirmPassword_btn btn-'))

		println "User clicks on the register button"
	}

	@Then("User clicks on click here to login")
	def User_clicks_on_click_here_to_login() {

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/bddDemo_Register/a_Click here to Login'))

		//WebUI.delay(5)
		println "User clicks on login here button"

		WebUI.closeBrowser()
	}
}