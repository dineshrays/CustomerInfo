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

class MakePaymentStepDef {
	@When("user is redirected to paybill page")
	def user_is_redirected_to_paybill_page() {

		//WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Password_btn btn-default'))
		//WebUI.delay(5)
		println "User is on paybill page"
	}

	@Then("user enters dayofpayment")
	def user_enters_dayofpayment() {

		WebUI.setText(findTestObject('bddDemo_MakePayment/input_DayOfPayment_DayOfPaymen'), '11/01/2019')

		println "user enters dayofpayment"
	}

	@Then("user enters amount")
	def user_enters_amount() {

		WebUI.setText(findTestObject('bddDemo_MakePayment/input_Amount_Amount'), '145')

		WebUI.delay(2)
		println "user enters amount"
	}


	/*@Then("user enters SwiftCode")
	 def user_enters_SwiftCode() {
	 WebUI.setText(findTestObject('bddDemo_MakePayment/input_SwiftCode_SwiftCode'),'FD124')
	 WebUI.delay(2)
	 println "user enters Swift Code"
	 }*/

	@Then("user clicks on make payment")
	def user_clicks_on_make_payment() {

		//WebUI.click(findTestObject('bddDemo_MakePayment/input_Amount_btn btn-default'))
		WebUI.click(findTestObject('bddDemo_MakePayment/input_SwiftCode_btn btn-defaul'))

		WebUI.delay(2)
		println "user clicks on make payment"

	}


	@Then("user is redirected to otp page")
	def user_is_redirected_to_otp_page() {

		println "user is redirected to otp page"
	}

	@Then("user enters the otp")
	def user_enters_the_otp() {

		WebUI.setText(findTestObject('bddDemo_EnterOTP/input_OTP_OTP'), '32728')
		WebUI.delay(2)
		println "user enters the otp"
	}

	@Then("user clicks on submit otp")
	def user_clicks_on_submit_otp() {

		WebUI.click(findTestObject('bddDemo_EnterOTP/input_OTP_btn btn-default'))
		WebUI.delay(2)
		println "user clicks on submit otp"
	}

	@Then("user should see the payment successful page")
	def user_should_see_the_payment_successful_page() {
		WebUI.delay(2)

		WebUI.closeBrowser()

		println "user sees the payment successful page"
	}
}