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

WebUI.setText(findTestObject('Object Repository/Page_Welcome to TOVUTI  You must login to continue/input_Register_username'), 
    'rodel.agpaoa@emids.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to TOVUTI  You must login to continue/input_Register_password'), 
    'KOluUIDmtGE0LIGTGJcFSw==')

WebUI.click(findTestObject('Object Repository/Page_Welcome to TOVUTI  You must login to continue/input_Register_login_button'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/img_Your Points 26700_bw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Administrator Options'))

WebUI.switchToWindowTitle('TOVUTI - Administration')

WebUI.click(findTestObject('Object Repository/Page_TOVUTI - Administration/i_Instructions_fas fa-users'))

WebUI.click(findTestObject('Object Repository/Page_TOVUTI - Administration/a_User Teams'))

WebUI.setText(findTestObject('Object Repository/Page_User Teams - TOVUTI - Administration/input_- Published -_title'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_User Teams - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_User Teams - TOVUTI - Administration/a_Test Team'))

WebUI.click(findTestObject('Object Repository/Page_User Teams Test Team - TOVUTI - Admini_051c72/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_User Teams - TOVUTI - Administration/a_User Importer'))

WebUI.setText(findTestObject('Object Repository/Page_User Importer - TOVUTI - Administration/input_Workday Connect_title'), 
    'Admin')

WebUI.click(findTestObject('Object Repository/Page_User Importer - TOVUTI - Administration/i_Workday Connect_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_User Importer - TOVUTI - Administration/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_User Importer Admin - TOVUTI - Administration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_User Importer - TOVUTI - Administration/a_User Notes'))

WebUI.setText(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/input_Search_filtersearch'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/a_Test User Notes'))

WebUI.click(findTestObject('Object Repository/Page_User Notes NewEdit - TOVUTI - Administration/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_User Notes - TOVUTI - Administration/a_User Note Categories'))

WebUI.setText(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/input_Search_filtersearch'), 
    'Billing')

WebUI.click(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/a_Billing'))

WebUI.click(findTestObject('Object Repository/Page_User Notes Edit Category - TOVUTI - Ad_9d5446/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_User Notes Categories - TOVUTI - Admin_0a62e3/a_Access Levels'))

WebUI.setText(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/input_Search_filtersearch'), 
    'Special')

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/button_Search_btn border'))

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/button_Search_btn border'))

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/div_People                                 _30c0d1'))

WebUI.setText(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/input_Search_filtersearch'), 
    'Public')

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/span_Search_icon-search'))

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/a_Public'))

WebUI.click(findTestObject('Object Repository/Page_Access Levels Edit - TOVUTI - Administration/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Access Levels - TOVUTI - Administration/a_Admin Roles  Permissions'))

WebUI.click(findTestObject('Object Repository/Page_Admin Roles  Permissions - TOVUTI - Ad_1228d6/a_Instructors'))

WebUI.setText(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/input_- Status -_title'), 'Juan')

WebUI.click(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/input_- Status -_title'))

WebUI.click(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/i_- Status -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/a_Juan Carlos Elorde'))

WebUI.click(findTestObject('Object Repository/Page_Instructors Juan Carlos Elorde - TOVUT_07552d/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_Instructors - TOVUTI - Administration/a_Media Items'))

WebUI.setText(findTestObject('Object Repository/Page_Media Items - TOVUTI - Administration/input_Delete_title'), 'Calculator')

WebUI.click(findTestObject('Object Repository/Page_Media Items - TOVUTI - Administration/i_Delete_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_Media Items - TOVUTI - Administration/a_Tovuti Payment Calculator'))

WebUI.click(findTestObject('Object Repository/Page_Media Items Tovuti Payment Calculator _3a0310/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Media Items - TOVUTI - Administration/a_Media Categories'))

WebUI.setText(findTestObject('Object Repository/Page_Media Categories - TOVUTI - Administration/input_- Published -_title'), 
    'All Media')

WebUI.click(findTestObject('Object Repository/Page_Media Categories - TOVUTI - Administration/button_- Published -_btn border'))

WebUI.click(findTestObject('Object Repository/Page_Media Categories - TOVUTI - Administration/a_All Media'))

WebUI.click(findTestObject('Object Repository/Page_Media Categories New - TOVUTI - Admini_c9d0c6/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Media Categories - TOVUTI - Administration/a_File Manager'))

WebUI.click(findTestObject('Object Repository/Page_File Manager - TOVUTI - Administration/a_Secure File Locker'))

WebUI.click(findTestObject('Object Repository/Page_Secure File Locker - TOVUTI - Administration/a_Instructions_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_Secure File Locker - TOVUTI - Administration/a_Virtual Classroom'))

WebUI.setText(findTestObject('Object Repository/Page_Virtual Classrooms - TOVUTI - Administration/input_- Published -_meetingName'), 
    'virtual')

WebUI.click(findTestObject('Object Repository/Page_Virtual Classrooms - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_Virtual Classrooms - TOVUTI - Administration/a_Virtual Classroom'))

WebUI.click(findTestObject('Object Repository/Page_Virtual Classrooms Edit - TOVUTI - Adm_f00978/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Virtual Classrooms - TOVUTI - Administration/a_Course Comments'))

WebUI.click(findTestObject('Object Repository/Page_Course Comments - TOVUTI - Administration/a_Certificate Designer'))

WebUI.setText(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/input_Duplicate Certificate(s)_title'), 
    'Top Sales')

WebUI.click(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/button_Duplicate Certificate(s)_btn border'))

WebUI.click(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/a_Top Sales Person'))

WebUI.click(findTestObject('Object Repository/Page_Certificate Designer Top Sales Person _35f4b4/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Certificate Designer - TOVUTI - Admini_291073/a_Points Categories'))

WebUI.setText(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/input_- Published -_title'), 
    'General')

WebUI.click(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/button_- Published -_btn border'))

WebUI.click(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/a_General Points'))

WebUI.click(findTestObject('Object Repository/Page_Points Categories General Points - TOV_4f577d/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/i_Instructions_fas fa-bullhorn'))

WebUI.click(findTestObject('Object Repository/Page_Points Categories - TOVUTI - Administration/a_Notifications'))

WebUI.setText(findTestObject('Object Repository/Page_Notifications - TOVUTI - Administration/input_- Published -_name'), 
    'Leadership')

WebUI.click(findTestObject('Object Repository/Page_Notifications - TOVUTI - Administration/i_- Published -_icon-search text-muted'))

WebUI.click(findTestObject('Object Repository/Page_Notifications - TOVUTI - Administration/a_Leadership 101 Registration'))

WebUI.click(findTestObject('Object Repository/Page_Notifications Leadership 101 Registrat_6de448/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Notifications - TOVUTI - Administration/a_Email Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Email Notifications - TOVUTI - Administration/a_Popup Notifications'))

WebUI.click(findTestObject('Object Repository/Page_Popup Notifications - TOVUTI - Administration/i_Instructions_fas fa-analytics'))

WebUI.click(findTestObject('Object Repository/Page_Popup Notifications - TOVUTI - Administration/i_Instructions_fas fa-comment-alt'))

WebUI.closeBrowser()

