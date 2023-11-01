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

WebUI.navigateToUrl(GlobalVariable.urlDev)

WebUI.verifyElementPresent(findTestObject('Moservice/button_masukDaftar'), 0)

WebUI.scrollToElement(findTestObject('Moservice/label_promoDanProgramseru'), 0)

labelPromo = WebUI.getText(findTestObject('Moservice/label_promoDanProgramseru'))

println(labelPromo)

result = CustomKeywords.'latihanTest.latihanCustomKeyword.splitText'(labelPromo, 'o', 3)

println(result)

result2 = CustomKeywords.'latihanTest.latihanCustomKeyword.textToArray'(labelPromo)

println(result2)

result3 = CustomKeywords.'latihanTest.latihanCustomKeyword.textToLowerCase'(labelPromo)

println(result3)

result4 = CustomKeywords.'latihanTest.latihanCustomKeyword.textUpperCase'(labelPromo)

println(result4)

result5 = CustomKeywords.'latihanTest.latihanCustomKeyword.textToCapitalize'(labelPromo, 2)

println(result5)

