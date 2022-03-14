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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyTextPresent('CURA Healthcare Service', false)

WebUI.verifyTextPresent('We Care About Your Health', false)

if (WebUI.verifyElementClickable(findTestObject('HomePageObj_OR2/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars')) == 
true) {
    WebUI.click(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))
}

if (WebUI.verifyElementClickable(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/a_Home')) == 
true) {
    WebUI.click(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/a_Home'))

    WebUI.verifyTextPresent('CURA Healthcare Service', false)

    WebUI.verifyTextPresent('We Care About Your Health', false)
}

WebUI.click(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/a_Login')) == 
true) {
    WebUI.click(findTestObject('Object Repository/HomePageObj_OR2/Page_CURA Healthcare Service/a_Login'))
}

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [findTestObject('HomePageObj_OR2/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x')
        , findTestObject('HomePageObj_OR2/Page_CURA Healthcare Service/a_Home'), findTestObject('HomePageObj_OR2/Page_CURA Healthcare Service/h3_We Care About Your Health')])
