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
import com.kms.katalon.core.configuration.RunConfiguration

import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable
import java.io.File
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.util.KeywordUtil


String filePath = RunConfiguration.getProjectDir() + '/Dokumen/JMK_SUR_2024_11_8_0000010.pdf'

// This will NOT work (missing required arguments):
// String text = CustomKeywords.'validatePDF.extractRegion'(filePath)

//PAGE 1
// TITLE
String label_Judul = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 290, 25, 260, 50)
KeywordUtil.logInfo("(TITLE) : "+label_Judul)

CustomKeywords.'validatePDF.validateFunction'(label_Judul, "jaminan")

// NO PERMOHONAN
String No_Permohonan = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 13, 160, 230, 20)
KeywordUtil.logInfo("(No Permohonan) : "+No_Permohonan)

CustomKeywords.'validatePDF.validateFunction'(No_Permohonan, "JMK/SUR/2024/11/8/000001")

// NILAI JAMINAN
String Nilai_Jaminan = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 643, 136, 180, 20)
KeywordUtil.logInfo("(Nilai Jaminan) : "+Nilai_Jaminan)

CustomKeywords.'validatePDF.validateFunction'(Nilai_Jaminan, "Rp 12.000.000.000,00")


// UANG SEJUMLAH
String uang_sejumlah = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 558, 226, 180, 15)
KeywordUtil.logInfo("(Uang Sejumlah) : "+uang_sejumlah)

CustomKeywords.'validatePDF.validateFunction'(uang_sejumlah, "Rp 12.000.000.000,00")

// TANGGAL DOKUMEN PENGADAAN
String tgl_doc_pengadaan = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 434, 269, 87, 15)
KeywordUtil.logInfo("(Tanggal Dokumen Pengadaan) : "+tgl_doc_pengadaan)

CustomKeywords.'validatePDF.validateFunction'(tgl_doc_pengadaan, "tanggal 10 Juli 2025")

// SURAT JAMINAN BERLAKU
String surat_jaminan_berlaku = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 33, 450, 175, 15)
KeywordUtil.logInfo("(Surat Jaminan Berlaku) : "+surat_jaminan_berlaku)

CustomKeywords.'validatePDF.validateFunction'(surat_jaminan_berlaku, "120")

// EFEKTIF MULAI TANGGAL
String efektir_mulai_tgl = CustomKeywords.'validatePDF.extractRegion'(filePath, 0, 380, 454, 300, 15)
KeywordUtil.logInfo("(Efektif Mulai Tanggal) : "+efektir_mulai_tgl)

CustomKeywords.'validatePDF.validateFunction'(efektir_mulai_tgl, "08 November 2024 s.d. 07 Maret 2025")

//PAGE 2
// PT TERJAMIN
String pt_terjamin_ttd = CustomKeywords.'validatePDF.extractRegion'(filePath, 1, 26, 89, 200, 100)
KeywordUtil.logInfo("(PT Terjamin) : "+pt_terjamin_ttd)

CustomKeywords.'validatePDF.validateFunction'(pt_terjamin_ttd, "PT POWER SEJATI")
CustomKeywords.'validatePDF.validateFunction'(pt_terjamin_ttd, "TERJAMIN")

// TTD TERJAMIN AKTOR
String ttd_terjamin = CustomKeywords.'validatePDF.extractRegion'(filePath, 1, 29, 207, 200, 70)
KeywordUtil.logInfo("(TTD TERJAMIN) : "+ttd_terjamin)

CustomKeywords.'validatePDF.validateFunction'(ttd_terjamin, "DETI SAUDI")
CustomKeywords.'validatePDF.validateFunction'(ttd_terjamin, "DIREKTUR")

// PENJAMIN TDD
String ttd_penjamin = CustomKeywords.'validatePDF.extractRegion'(filePath, 1, 393, 195, 500, 70)
KeywordUtil.logInfo("(TTD PENJAMIN) : "+ttd_penjamin)


//PAGE 3

//NAMA PRINCIPAL
String NamaPrincipal = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 49, 125, 100, 150)
KeywordUtil.logInfo("(NAMA PRINCIPAL) : "+NamaPrincipal)

//ALAMAT
String Alamat = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 150, 126, 100, 150)
KeywordUtil.logInfo("(ALAMAT) : "+Alamat)

//TANGGAL PENERBITAN
String tgl_Penerbitan = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 252, 129, 80, 150)
KeywordUtil.logInfo("(Tanggal Penerbitan) : "+tgl_Penerbitan)


//JENIS SURETYBOND
String jenis_suretybond = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 333, 129, 100, 150)
KeywordUtil.logInfo("(Jenis Suretybond) : "+jenis_suretybond)


//NILAI JAMINAN
String nilai_Jaminan = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 433, 129, 90, 150)
KeywordUtil.logInfo("(Nilai Jaminan) : "+nilai_Jaminan)

//JANGKA WAKTU
String jangka_waktu = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 533, 129, 90, 150)
KeywordUtil.logInfo("(Jangka Waktu) : "+jangka_waktu)

//NAMA PROYEK
String Nama_proyek = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 633, 129, 100, 150)
KeywordUtil.logInfo("(Nama Proyek) : "+Nama_proyek)

//IJP
String IJP = CustomKeywords.'validatePDF.extractRegion'(filePath, 2, 723, 129, 100, 150)
KeywordUtil.logInfo("(IJP) : "+IJP)





