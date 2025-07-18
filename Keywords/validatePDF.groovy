import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable
import java.io.File
import java.nio.file.Paths
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripperByArea
import java.awt.Rectangle

import java.awt.Rectangle;
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.pdfbox.pdmodel.PDPage;

public class validatePDF {

	
	@Keyword
    String extractRegion(def filePath, int pageNum, x,  y,  width,  height) {
        PDDocument document = null
        try {
            File file = new File(filePath)
            document = PDDocument.load(file)
            PDFTextStripperByArea stripper = new PDFTextStripperByArea()
            Rectangle rect = new Rectangle(x, y, width, height)
            stripper.addRegion("label", rect)

            def page = document.getPage(pageNum)
            stripper.extractRegions(page)
            String regionText = stripper.getTextForRegion("label")
            println("Text in label (page ${pageNum + 1}): " + regionText)
            return regionText
        } finally {
            if (document != null) {
                document.close()
            }
        }
    }
}

