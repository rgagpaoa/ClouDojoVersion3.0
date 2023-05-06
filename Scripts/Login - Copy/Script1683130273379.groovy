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
    'KOluUIDmtGE0LIGTGJcFSw==')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Welcome to TOVUTI  You must login to continue/input_Register_login_button'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/h2_Welcome to Cloudojo'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/h2_Welcome to Cloudojo'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/img_Your Points 26700_bw'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Dashboard/span_Administrator Options'))

WebUI.switchToWindowTitle('TOVUTI - Administration')

WebUI.click(findTestObject('Object Repository/Administrator/Page_TOVUTI - Administration/i_Instructions_fas fa-users'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_TOVUTI - Administration/a_User Manager'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/input_Search_filtersearch'), 
    'rodel agpaoa')

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Manager - TOVUTI - Administration/a_Rodel Agpaoa'))

WebUI.doubleClick(findTestObject('Object Repository/Administrator/Page_Users Edit Profile - TOVUTI - Administration/h4_Rodel Agpaoa'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Users Edit Profile - TOVUTI - Administration/input__jformname'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Users Edit Profile - TOVUTI - Administration/a_User Profile Fields'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Community - Profile Fields - TOVUTI - _0d0129/a_User Groups'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/input_Search_filtersearch'), 
    'registered')

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/input_Search_filtersearch'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/a_Registered'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_User Groups - TOVUTI - Administration/a_Interactive Content'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/input_ID_k-input'), 
    'isms overview')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_ISMS Overview'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Add Interactive Content ISMS Overview _772651/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Manage Interactive Content - TOVUTI - _299cbf/a_Quizzes'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/input_- Quiz Course Name -_title'), 
    'SDLC')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/button_- Quiz Course Name -_btn border'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/body_Request received.A Tovuti Team Member _471054'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/input_- Quiz Course Name -_title'), 
    'Test Plan')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/body_Request received.A Tovuti Team Member _471054_1'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/input_- Quiz Course Name -_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Estimation Assessment'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes Estimation Assessment - TOVUTI_800fea/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quizzes - TOVUTI - Administration/a_Surveys'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/input_- Published -_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/button_- Published -_btn border'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/a_Estimation Feedback'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys Estimation Feedback - TOVUTI -_c51c5c/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Surveys - TOVUTI - Administration/a_Courses'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    'estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/div_Sets the maximum number of results to r_ab84a7'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    'Estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/td_No records were found'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/input_- Category -_title'), 
    'Rootcause')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses - TOVUTI - Administration/a_Rootcause Analysis Tools and Methods'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Courses Rootcause Analysis Tools and M_f98544/a_Lessons'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/input_Duplicate Lesson(s)_title'), 
    'estimation')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/i_Duplicate Lesson(s)_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/a_Estimation'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Lessons Estimation - TOVUTI - Administration/input_Action_1-source-forDisplay'), 
    '')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons Estimation - TOVUTI - Administration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Lessons - TOVUTI - Administration/a_Checklists'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/input_- Published -_title'), 
    'scrum master')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/td_Scrum Master Trainings 2023'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/a_Scrum Master Trainings 2023'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists Scrum Master Trainings 2023_d912fd/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Checklists - TOVUTI - Administration/a_Course Assignments'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/input_Duplicate Assignment(s)_title'), 
    'Test Assignment')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Test Assignment'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Assigned  Recommended Courses Test Ass_3c4fce/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Course Assignments - TOVUTI - Administration/a_Activity Reports'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/input_Report Builder_name'), 
    'Test Activity')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/i_Report Builder_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Test Activity Report'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports Test Activity Report _4c2933/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Activity Reports - TOVUTI - Administration/a_Quiz Results'))

WebUI.setText(findTestObject('Object Repository/Administrator/Page_Quiz Results - TOVUTI - Administration/input_Delete_k-input'), 
    'Rodel Agpaoa')

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quiz Results - TOVUTI - Administration/a_Rodel Agpaoa'))

WebUI.click(findTestObject('Object Repository/Administrator/Page_Quiz Results Edit - TOVUTI - Administration/i_Cancel_fas fa-close'))

WebUI.closeBrowser()

