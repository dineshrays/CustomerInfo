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

import io.cucumber.datatable.DataTable

import sun.reflect.UTF8

//import com.kms.katalon.core.testobject.ConditionType
//import com.kms.katalon.core.testobject.RequestObject
//import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import 	java.util.List
import java.util.concurrent.locks.Condition
import java.util.ArrayList


class VerifyandAddCustomerDetails {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	def response

	@Given("Enter customer Id as (.*)")
	def Enter_customer_Id_as(String id) {
		println id
	}

	@When("Click on the request button")
	def Click_on_the_request_button() {

		response = WS.sendRequest(findTestObject('GetCustomerDetails', [('') : 'id=2']))
	}

	@Then("I get response code (.*)")
	def I_get_response_code_200(String status) {
		println status


		//def response1 = WS.sendRequest(findTestObject('TestingGet'))

		WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Verify the customer information as below")
	def Verify_the_customer_information_as_below(DataTable data){

		List<Map<String, String>> issue_info = data.asMaps(String.class, String.class);


		WS.verifyElementPropertyValue(response, 'name[1]', issue_info[0].name , FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(response, 'issuer[1]', issue_info[0].issuer, FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(response, 'address[1].zipcode',issue_info[0].zipcode , FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(response, 'cardsList[1].cardNo',issue_info[0].cardno , FailureHandling.STOP_ON_FAILURE)
	}

	// POST  Customer Details---------------------------------------------------------------------------------------------------------------->


	def request
	String body
	@Given("Adding the new customer info")
	def Adding_the_new_customer_info(){

		//request = (RequestObject)findTestObject('InsertCustomerInfo')
		//body = '{ "id": 10, "name": "SriLaxmi10", "issuer": "BOA", "address": { "street": "El Camino Real", "city": "New Jersy", "zipcode": 95041 }, "cards": [ {} ] } '

		request = (RequestObject)findTestObject('AddNewCustomer')
		body = '{  "name": "Sabareesh10", "issuer": "BOA", "address": { "street": "Ell Camino Reall", "city": "New York City", "zipcode": 95031 } } '
	}

	@When("Click on the create button")
	def Click_on_the_create_button(){

		try{

			request.setBodyContent(new HttpTextBodyContent(body, "UTF-8", "application/json"))
		}

		catch(Exception ex){
			println(ex.detailMessage)
		}
		WS.sendRequest(request)

	}

	@Then("Verify whether the new data is inserted")
	def Verify_whether_the_new_data_is_inserted(DataTable data){

		def complete_response = (RequestObject)findTestObject('GetCustomerDetails')


		List<TestObjectProperty> params = new ArrayList();
		params.add(new TestObjectProperty("id", ConditionType.EQUALS, "10"))
		//List<TestObjectProperty> params = new ArrayList();
		//params.add(new TestObjectProperty("id", ConditionType.EQUALS, "5"))
		//params.add(new TestObjectProperty("id", ConditionType.EQUALS, "9"))

		complete_response.setRestParameters(params)

		def result = WS.sendRequest(complete_response)

		List<Map<String, String>> issue_info = data.asMaps(String.class, String.class);


		WS.verifyElementPropertyValue(result, 'name[9]', issue_info[0].name , FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(result, 'issuer[9]', issue_info[0].issuer, FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(result, 'address[9].zipcode',issue_info[0].zipcode , FailureHandling.STOP_ON_FAILURE)
	}


	// Post Card Details ------------------------------------------------------------------------------------------------>


	def request1
	String body1
	@Given("Adding the new card info for the customer")
	def Adding_the_new_card_info_for_the_customer(){

		//request = (RequestObject)findTestObject('InsertCustomerInfo')
		//body = '{ "id": 10, "name": "SriLaxmi10", "issuer": "BOA", "address": { "street": "El Camino Real", "city": "New Jersy", "zipcode": 95041 }, "cards": [ {} ] } '

		 request1 = (RequestObject)findTestObject('AddCardDetails')
		 body1 = '{ "id":10, "cardNo": "1234-9856-1455-7890", "nameOnCard": "Sabreesh10 v", "expiryDate": "05/2022", "status": "Inactive", "cardType": "Credit", "service": "Visa" }'
	}

	@When("Click on the add card button")
	def Click_on_the_add_card_button(){

		try{

			request1.setBodyContent(new HttpTextBodyContent(body1, "UTF-8", "application/json"))
		}

		catch(Exception ex){
			println(ex.detailMessage)
		}
		WS.sendRequest(request1)

	}

	@Then("Verify whether the new card data is inserted")
	def Verify_whether_the_new_card_data_is_inserted(DataTable data){

		def complete_response = (RequestObject)findTestObject('GetCustomerDetails')


		List<TestObjectProperty> params = new ArrayList();
		params.add(new TestObjectProperty("id", ConditionType.EQUALS, "10"))
		//List<TestObjectProperty> params = new ArrayList();
		//params.add(new TestObjectProperty("id", ConditionType.EQUALS, "5"))
		//params.add(new TestObjectProperty("id", ConditionType.EQUALS, "9"))

		complete_response.setRestParameters(params)

		def result = WS.sendRequest(complete_response)

		List<Map<String, String>> issue_info = data.asMaps(String.class, String.class);


		WS.verifyElementPropertyValue(result, 'name[9]', issue_info[0].name , FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(result, 'issuer[9]', issue_info[0].issuer, FailureHandling.STOP_ON_FAILURE)

		WS.verifyElementPropertyValue(result, 'address[9].zipcode',issue_info[0].zipcode , FailureHandling.STOP_ON_FAILURE)
		
		WS.verifyElementPropertyValue(result, 'cardsList[9].cardNo',issue_info[0].cardno , FailureHandling.STOP_ON_FAILURE)

    }
}