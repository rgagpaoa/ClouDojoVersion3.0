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

WebUI.navigateToUrl('https://clouddevelopmentresources.tovuti.io/')

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_username'), 
    'rodel.agpaoa@emids.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_password'), 
    'jxqMmeXTJsPBYkL9vIO9Rw==')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/div_Login_tov_login-left_content'))

WebUI.setEncryptedText(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_password'), 
    'KOluUIDmtGE0LIGTGJcFSw==')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_login_button'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/img_Your Points 26700_bw'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/span_Administrator Options'))

WebUI.switchToWindowTitle('TOVUTI - Administration')

WebUI.click(findTestObject('Object Repository/Administrator/Page_TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_TOVUTI - Administration/a_User Manager'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/a_User Profile Fields'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/input_Search_filtersearch'), 
    'Rodel Agpaoa')

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/a_Rodel Agpaoa'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Users Edit Profile - TOVUTI - Administration/button_Close'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/a_Instructions_nav-link active'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/a_User Groups'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/input_Search_filtersearch'), 
    'Registered')

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/a_Registered'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/i_Instructions_fas fa-shapes'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/a_Interactive Content'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'), 
    '')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/span_ID_k-icon k-clear-value k-i-close'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/span_ID_k-icon k-clear-value k-i-close'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'), 
    'Tovuti Quiz')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_Tovuti Quiz'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Add Interactive Content Tovuti Quiz - _03665c/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'), 
    '')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/span_ID_k-icon k-i-close'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'), 
    'Tovuti Quiz')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_Tovuti Quiz'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Add Interactive Content Tovuti Quiz - _03665c/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_Instructions_nav-link active'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_eLearning Packages'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_eLearning Packages - TOVUTI - Administration/input_LRS Configuration_title'), 
    'Work Health and Safety')

WebUI.click(findTestObject('Object Repository/Administrator/Page_eLearning Packages - TOVUTI - Administration/button_LRS Configuration_btn border'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_eLearning Packages - TOVUTI - Administration/a_Work Health and Safety'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_eLearning Packages Work Health and Saf_66a63f/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Instructions_nav-link active'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Quizzes'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/input_- Quiz Course Name -_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/i_- Quiz Course Name -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Estimation Assessment'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes Estimation Assessment - TOVUTI_800fea/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Surveys'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/input_- Published -_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/button_- Published -_btn border'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/a_Estimation Feedback'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys Estimation Feedback - TOVUTI -_c51c5c/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/i_Instructions_fas fa-graduation-cap'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/a_Course Categories'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Course Categories - TOVUTI - Administration/input_- Status -_title'), 
    'General')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Categories - TOVUTI - Administration/i_- Status -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Categories - TOVUTI - Administration/a_General Courses'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Categories General Courses - TO_7d6d77/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/i_Instructions_fas fa-graduation-cap'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Courses'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    'Rootcause')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/i_- Category -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Rootcause Analysis Tools and Methods'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Lessons'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/input_Duplicate Lesson(s)_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/i_Duplicate Lesson(s)_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/a_Courses'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/a_Estimation'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/a_Checklists'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/input_- Published -_title'), 
    'Test Automation Trainings')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/a_Test Automation Trainings'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/a_Course Assignments'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/input_Duplicate Assignment(s)_title'), 
    'Test Assignment')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/i_Duplicate Assignment(s)_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Test Assignment'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Assigned  Recommended Courses Test Ass_3c4fce/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Awards'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/input_- Published -_title'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/td_LJMB Leadership Training Badge - Men'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/input_- Published -_title'), 
    'LJMB Leadership Training Badge - Men')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/a_LJMB Leadership Training Badge - Men'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards LJMB Leadership Training Badge _ff6abf/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/i_Instructions_fas fa-analytics'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Awards - TOVUTI - Administration/a_Report Builder'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Report Builder - TOVUTI - Administration/input_Report Builder_name'), 
    'Test Report')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Report Builder - TOVUTI - Administration/i_Report Builder_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Report Builder - TOVUTI - Administration/a_Test Report'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Report Builder Test Report - TOVUTI - _ce4c6c/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Instructions_nav-link active'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Activity Reports'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/input_Report Builder_name'), 
    'Test Activity Report')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/i_Report Builder_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Test Activity Report'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports Test Activity Report _4c2933/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Expiration Reports'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Expiration Reports - TOVUTI - Administration/input_Report Builder_name'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Expiration Reports - TOVUTI - Administration/a_Activity Dashboards'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/a_QA Courses'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards QA Courses - TOVUT_a18918/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/i_Instructions_fas fa-analytics'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/a_Activity Dashboards'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/input_Report Builder_name'), 
    'QA Courses')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/button_Report Builder_btn border'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards - TOVUTI - Administration/a_QA Courses'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Dashboards QA Courses - TOVUT_a18918/a_Quiz Results'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quiz Results - TOVUTI - Administration/input_Delete_k-input'), 
    'Rodel Agpaoa')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quiz Results - TOVUTI - Administration/span_Contains_k-select'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quiz Results - TOVUTI - Administration/a_Rodel Agpaoa'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quiz Results Edit - TOVUTI - Administration/button_Cancel'))

WebUI.closeBrowser()

