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

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/i_Instructions_fas fa-graduation-cap'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Awards'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Awards'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Awards'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/input_- Published -_title'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/input_- Published -_title'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/input_- Published -_title'), 
    'LJMB Leadership Training Badge - Men')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/a_LJMB Leadership Training Badge - Men'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/a_LJMB Leadership Training Badge - Men'), 
    FailureHandling.STOP_ON_FAILURE)

