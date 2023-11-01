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

'Buka browser yang digunakan\r\n'
WebUI.openBrowser('')

'Masuk ke page dev.momobil\r\n'
WebUI.navigateToUrl('https://dev.momobil.id/')

'Screenshot page'
WebUI.takeScreenshot()

'Memastikan element button Mobil Baru bisa di klik\r\n'
WebUI.verifyElementClickable(findTestObject('button_MobilBaru'))

'Klik button mobil baru dan masuk ke page selanjutnya\r\n\r\n'
WebUI.click(findTestObject('button_MobilBaru'))

'Screenshot page\r\n'
WebUI.takeScreenshot()

'Memastikan label Atur Ulang muncul\r\n'
WebUI.verifyElementText(findTestObject('label_AturUlang'), 'Atur Ulang')

'Memastikan text hyperlink DAIAHATSU AYLA D MT bisa di klik'
WebUI.verifyElementClickable(findTestObject('texthyperlink_DAIHATSU AYLA D MT'))

'Klik text hyperlink DAIAHATSU AYLA D MT dan masuk ke page selanjutnya\r\n'
WebUI.click(findTestObject('texthyperlink_DAIHATSU AYLA D MT'))

'Screenshot page\r\n'
WebUI.takeScreenshot()

'Tutup browser yang digunakan\r\n'
WebUI.closeBrowser()

