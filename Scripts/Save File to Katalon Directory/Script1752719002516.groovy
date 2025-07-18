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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.chrome.ChromeOptions

String downloadFilepath = RunConfiguration.getProjectDir() + File.separator + "Download"
new File(downloadFilepath).mkdirs()

String browserType = DriverFactory.getExecutedBrowser().getName()
WebDriver driver

if (browserType.equalsIgnoreCase("FIREFOX_DRIVER")) {
    FirefoxProfile profile = new FirefoxProfile()
    profile.setPreference("browser.download.folderList", 2)
    profile.setPreference("browser.download.dir", downloadFilepath)
    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream,application/pdf")
    profile.setPreference("pdfjs.disabled", true)
    FirefoxOptions options = new FirefoxOptions()
    options.setProfile(profile)
    driver = new org.openqa.selenium.firefox.FirefoxDriver(options)
} else {
    HashMap<String, Object> chromePrefs = new HashMap<String, Object>()
    chromePrefs.put("profile.default_content_settings.popups", 0)
    chromePrefs.put("download.default_directory", downloadFilepath)
    chromePrefs.put("download.prompt_for_download", false)
    chromePrefs.put("safebrowsing.enabled", true)
    ChromeOptions options = new ChromeOptions()
    options.setExperimentalOption("prefs", chromePrefs)
    driver = new org.openqa.selenium.chrome.ChromeDriver(options)
}

// Switch Katalon to use your custom driver
DriverFactory.changeWebDriver(driver)

// Now you can use WebUI keywords—no need to open a new browser
WebUI.navigateToUrl("https://the-internet.herokuapp.com/download")
WebUI.delay(2)
WebUI.click(findTestObject("Object Repository/Page_The Internet/a_some-file.txt"))


