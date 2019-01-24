import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://promantusbdddemo1.azurewebsites.net/')

WebUI.setText(findTestObject('bddDemo_Login/input_UserName_UserName'), 'Promantus')

WebUI.setEncryptedText(findTestObject('bddDemo_Login/input_Password_Password'), '/0NTViPtOaw=')

WebUI.click(findTestObject('bddDemo_Login/input_Password_btn btn-default'))



WebUI.setText(findTestObject('bddDemo_MakePayment/input_DayOfPayment_DayOfPaymen'), '15/01/2019')

WebUI.setText(findTestObject('bddDemo_MakePayment/input_Amount_Amount'), '140')

WebUI.setText(findTestObject('bddDemo_MakePayment/input_SwiftCode_SwiftCode'), 'PRO2054C')

WebUI.click(findTestObject('bddDemo_MakePayment/input_SwiftCode_btn btn-defaul'))

WebUI.setText(findTestObject('bddDemo_EnterOTP/input_OTP_OTP'), '1473')

WebUI.click(findTestObject('bddDemo_EnterOTP/input_OTP_btn btn-default'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://promantusbdddemo1.azurewebsites.net/')

WebUI.click(findTestObject('Page_Login - My ASP.NET Application/a_Click here to Register'))

WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_FirstName_FirstName'), 'Sabareesh')

WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_NameId_NameId'), 'SAB0328KE')

WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_Email_Email'), 'sabareesh@gmail.com')

WebUI.setText(findTestObject('Object Repository/bddDemo_Register/input_UserName_UserName'), 'Sabareesh')

WebUI.setEncryptedText(findTestObject('Object Repository/bddDemo_Register/input_Password_Password'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/bddDemo_Register/input_ConfirmPassword_ConfirmP'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/bddDemo_Register/input_ConfirmPassword_btn btn-'))

WebUI.click(findTestObject('Object Repository/bddDemo_Register/a_Click here to Login'))

WebUI.closeBrowser()

