package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;
import pomObjectRepo.HomePage;
import pomObjectRepo.InvoiceCreationInfoPage;
import pomObjectRepo.InvoiceNewPageCreation;
import pomObjectRepo.InvoicePage;
import pomObjectRepo.SharedLibrary;

public class InvoiceScripttest extends BaseClass {

	@Test
	public void createInvoice() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		InvoicePage ip=new InvoicePage(driver);
		InvoiceNewPageCreation inc=new InvoiceNewPageCreation(driver);
		SharedLibrary sl=new SharedLibrary();
		InvoiceCreationInfoPage icip=new InvoiceCreationInfoPage(driver);
		hp.clickOnInvoiceLink(driver);
		ip.clickOnCreateInvoiceImg();
		inc.enterSubjectName(tdu.fetchDataFromExcel("Data",16,2));
		Thread.sleep(1000);
		inc.clickOnOrganizationName();
		sl.switchDriverFocusToChild(driver);
		inc.clickOnFirstOrganizationName();
		sl.acceptAlert(driver);
		sl.switchDriverFocusToMain(driver);
		inc.enterBillStreetaddress(tdu.fetchDataFromExcel("Data",16,3));
		inc.enterShippingaddress(tdu.fetchDataFromExcel("Data",16,4));
		inc.clickOnItemNameImg();
		sl.switchDriverFocusToChild(driver);
		inc.clickOnFirstItemName();
		sl.switchDriverFocusToMain(driver);
		inc.enterStockQty(tdu.fetchDataFromExcel("Data",16,5));
		inc.clickOnSaveBtn();
		String info=icip.validateInvoiceInfomsg();
		Assert.assertTrue(info.contains(tdu.fetchDataFromExcel("Data",16,6)));
		
	}
	
}
