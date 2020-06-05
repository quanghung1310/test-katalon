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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('admin login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Town Square - team1 Mattermost/button_admin_style--none sidebar-header-dro_b41f5f'))

WebUI.click(findTestObject('Page_Town Square - team6 Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Page_surveybot - hoa3 Mattermost/button_Display'))

WebUI.click(findTestObject('Page_surveybot - hoa3 Mattermost/span_Clock Display'))

WebUI.click(findTestObject('Page_surveybot - hoa3 Mattermost/input_Clock Display_clockFormat'))

WebUI.click(findTestObject('Page_surveybot - hoa3 Mattermost/button_Save'))

WebUI.closeBrowser()

