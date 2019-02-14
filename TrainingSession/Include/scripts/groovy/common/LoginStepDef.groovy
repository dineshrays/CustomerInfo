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


class LoginStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	/**@Given("Navigate to Login page")
	 public void navigate_to_Login_page() {
	 }
	 @When("User enters username")
	 public void user_enters_username() {
	 }
	 @When("User enters password")
	 public void user_enters_password() {
	 }
	 @When("User click on login")
	 public void user_click_on_login() {
	 }
	 @Then("User has to be logged in")
	 public void user_has_to_be_logged_in() {
	 }*/


	@Given("Navigate to Login page")
	public void Navigate_to_Login_page(){
		WebUI.openBrowser("")
		//WebUI.navigateToUrl("http://localhost:60497")
		WebUI.navigateToUrl("http://164.164.39.5:5002/")
	}

	@When("User enters username")
	public void user_enters_username() {

		WebUI.setText(findTestObject('Object Repository/trainingSession_Login/input_UserName_UserName'), "Promantus")
	}

	@When("User enters password")
	public void user_enters_password() {
		WebUI.setText(findTestObject('Object Repository/trainingSession_Login/input_Password_Password'), "bdd")
	}

	@When("User click on login")
	public void user_click_on_login() {

		WebUI.click(findTestObject('Object Repository/trainingSession_Login/input_Password_btn btn-default'))
	}


	@Then("User has to be logged in")
	public void user_has_to_be_logged_in() {

		WebUI.verifyTextPresent("PayBill", false)

		WebUI.delay(3)

		WebUI.closeBrowser()
	}
}