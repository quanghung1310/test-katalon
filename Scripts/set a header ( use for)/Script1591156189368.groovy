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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/button_Set a Header'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_Edit the Channel Header_edit_textbox'), 
    'n')
for(int i=0;i<3;i++){
WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_n'), 'ne')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_ne'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new'), 'new ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new_1'), 'new n')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new n'), 'new ')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new_1'), 'new m')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new m'), 'new mw')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new mw'), 'new m')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new m'), 'new me')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new me'), 'new mes')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new mes'), 'new mess')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new mess'), 'new messg')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new messg'), 'new messga')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new messga'), 'new messg')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new messg'), 'new mess')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new mess'), 'new messa')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new messa'), 'new messag')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/textarea_new messag'), 'new message')
WebUI.click(findTestObject('Object Repository/Page_Town Square - teamm5 Mattermost/button_Save'))
}



