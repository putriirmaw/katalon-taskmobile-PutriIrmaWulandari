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

Mobile.startApplication(GlobalVariable.apk, false)

Mobile.tap(findTestObject('AddName-Profile/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('AddName-Profile/btn-edit'), 0)

Mobile.tap(findTestObject('AddName-Profile/field-name'), 0)

Mobile.clearText(findTestObject('AddName-Profile/clearText-name'), 0)

Mobile.setText(findTestObject('AddName-Profile/clearText-name'), 'ini namaku', 0)

Mobile.tap(findTestObject('AddName-Profile/btn-okName'), 0)

Mobile.tap(findTestObject('AddName-Profile/field-email'), 0)

Mobile.clearText(findTestObject('AddName-Profile/clearText-email'), 0)

Mobile.setText(findTestObject('AddName-Profile/clearText-email'), 'iniemail@gmail.com', 0)

Mobile.tap(findTestObject('AddName-Profile/btn-okEmail'), 0)

Mobile.closeApplication()

