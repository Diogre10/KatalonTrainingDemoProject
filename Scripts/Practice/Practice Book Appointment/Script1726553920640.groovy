import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.sendKeys(findTestObject('Object Repository/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Tokyo CURA Healthcare Center        _5b4107'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/td_1'))

WebUI.click(findTestObject('Object Repository/td_30'))

WebUI.setText(findTestObject('Object Repository/textarea_Comment_comment'), 'Practice 1')

WebUI.click(findTestObject('Object Repository/div_Make Appointment                       _4e05d4'))

WebUI.click(findTestObject('Object Repository/button_Book Appointment'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.click(findTestObject('Object Repository/a_Go to Homepage'))

WebUI.closeBrowser()

