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

WebUI.click(findTestObject('Object Repository/Page_Secure File Locker - TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/a_Points Categories'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/a_Points Categories'))

WebUI.click(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/a_Points Categories'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/input_- Published -_title'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/input_- Published -_title'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/input_- Published -_title'), 
    'General')

WebUI.click(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/button_- Published -_btn border'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/a_General Points'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/a_General Points'))

