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

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/i_Instructions_fas fa-graduation-cap'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Courses'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Courses'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Courses'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    'Rootcause')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/i_- Category -_icon-search text-muted'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Rootcause Analysis Tools and Methods'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Rootcause Analysis Tools and Methods'), 
    FailureHandling.STOP_ON_FAILURE)
