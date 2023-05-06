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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://clouddevelopmentresources.tovuti.io/')

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_username'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_username'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_username'), 
    'rodel.agpaoa@emids.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_password'), 
    'KOluUIDmtGE0LIGTGJcFSw==')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_login_button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Dashboard/h2_Welcome to Cloudojo'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Dashboard/h2_Welcome to Cloudojo'), FailureHandling.STOP_ON_FAILURE)

