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

WebUI.click(findTestObject('Object Repository/Page_TOVUTI - Administration/i_Instructions_fas fa-users'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/a_User Note Categories'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/a_User Note Categories'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/a_User Note Categories'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/input_Search_filtersearch'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/input_Search_filtersearch'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/input_Search_filtersearch'), 
    'Billing')

WebUI.click(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/span_Search_icon-search'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/a_Billing'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/a_Billing'))

