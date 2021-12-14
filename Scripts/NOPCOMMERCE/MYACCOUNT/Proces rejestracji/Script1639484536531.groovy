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

/*
 *Uruchomienie aplikacji
 */
WebUI.openBrowser(GlobalVariable.url)

WebUI.delay(2)

/*
 * Uruchomienie rejestracji 
 */
WebUI.click(findTestObject('Object Repository/NOPCOMMERCE/registrationPage/register'))

/*
 * Zmaksymalizowanie okna
 */
WebUI.maximizeWindow()

WebUI.check(findTestObject('NOPCOMMERCE/registrationPage/radio_male'))

/*
*Wprowadzenie imienia użytkownika
*/
WebUI.setText(findTestObject('Object Repository/NOPCOMMERCE/registrationPage/input_fName'), findTestData('data').getValue(
        1, 1))

/*
 *Wprowadzenie nazwiska użytkownika
 */
WebUI.setText(findTestObject('Object Repository/NOPCOMMERCE/registrationPage/input_lName'), findTestData('data').getValue(
        2, 1))

/*
 *Ustawienie daty urodzin z listy rozwijanej
 */
WebUI.selectOptionByLabel(findTestObject('NOPCOMMERCE/registrationPage/DropDown_BirthDate/dropDwon_days'), label, false)

WebUI.selectOptionByValue(findTestObject('NOPCOMMERCE/registrationPage/DropDown_BirthDate/dropDown_months'), month, false)

WebUI.selectOptionByIndex(findTestObject('NOPCOMMERCE/registrationPage/DropDown_BirthDate/dropDown_years'), index)

WebUI.setText(findTestObject('NOPCOMMERCE/registrationPage/input_email'), findTestData('data').getValue(3, 1))

WebUI.setText(findTestObject('NOPCOMMERCE/registrationPage/input_companyName'), findTestData('data').getValue(4, 1))

WebUI.check(findTestObject('Object Repository/NOPCOMMERCE/registrationPage/checbox_newsletter'))

WebUI.setText(findTestObject('NOPCOMMERCE/registrationPage/input_password'), findTestData('data').getValue(5, 1))

WebUI.setText(findTestObject('NOPCOMMERCE/registrationPage/input_confirmPassw'), findTestData('data').getValue(5, 1))

WebUI.click(findTestObject('NOPCOMMERCE/registrationPage/btn_registerBtn'))

WebUI.click(findTestObject('NOPCOMMERCE/registrationPage/myAccount'))

