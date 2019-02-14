package common
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


class OrangeHRMLoginStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */



	@Given("Navigate to Orange HRM Login page")
	public void navigate_to_Orange_HRM_Login_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.openBrowser("")
		WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/")
	}

	@When("User enters username (.*)")
	public void user_enters_username_admin(String UserName) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/OragneHRM/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), UserName)
	}

	@When("User enters password (.*)")
	public void user_enters_password_admin(String Password) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/OragneHRM/Page_OrangeHRM/input_Username_txtPassword'), Password)
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject
				('Object Repository/OragneHRM/Page_OrangeHRM/input_Password_Submit'))
	}


	@Then("User has to be loggedin")
	public void user_has_to_be_loggedin() {
		// Write code here that turns the phrase above into concrete actions

		//  WebUI.verifyImagePresent(findTestObject('Object Repository/Page_OrangeHRM/img'))

		//WebUI.verifyImagePresent(findTestObject('Object Repository/OragneHRM/Page_OrangeHRM/img'))

		//	WebUI.verifyImagePresent(findTestObject('Object Repository/Test/Page_OrangeHRM/img'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/OragneHRM/Page_OrangeHRM/img'))

		WebUI.closeBrowser()

	}
}