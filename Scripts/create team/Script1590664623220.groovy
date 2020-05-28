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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('login'), [('username') : 'test1', ('password') : 'aeHFOx8jV/A='], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Mattermost/span_Create a team'))

WebUI.setText(findTestObject('Page_Mattermost/input_Team Name_teamNameInput'), name_team = 'test')

WebUI.click(findTestObject('Page_Mattermost/span_Next'))

WebUI.click(findTestObject('Page_Mattermost/span_Finish'))

WebUI.click(findTestObject('Page_Town Square - test Mattermost/span_Skip Tutorial'))

WebUI.callTestCase(findTestCase('chat'), [:], FailureHandling.STOP_ON_FAILURE)

