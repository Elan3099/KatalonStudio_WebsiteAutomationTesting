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
  
  Setup Katalon Studio Agar BDD bisa running di versi 9 / 10
  
  1. Buat file TestListener di folder Test Listener
  
  2. Copy / sesuaikan isinya sesuai dengan file TestListener yang dibuat dalam project file ini.
  		--- isinya merupakan script untuk memanggil default glue cucumber
  		--- glue Cucumber merupakan framework atau semacam struktur yang telah tersedia untuk menghubungkan atau sebagai jembatan antara feature dengan groovy
  
  3. Buat file feature seperti biasa di include/features
  
  4. Buat file step definition groovy seperti biasa di include/groovy/ dengan package baru (jangan menggunakan package default)
  
  5. Jalankan featurenya
  
*/