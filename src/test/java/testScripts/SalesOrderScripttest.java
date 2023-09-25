package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;
import pomObjectRepo.HomePage;
import pomObjectRepo.NewSalesOrderPageCreation;
import pomObjectRepo.SalesOrderInfoPage;
import pomObjectRepo.SalesOrderPage;
import pomObjectRepo.SharedLibrary;

public class SalesOrderScripttest extends BaseClass {
	@Test(groups= {"regression"})
	public void CreateSaleOrder() throws AWTException, InterruptedException, EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		SalesOrderPage sp=new SalesOrderPage(driver);
		SharedLibrary sl=new SharedLibrary();
		NewSalesOrderPageCreation sop=new NewSalesOrderPageCreation(driver);
		SalesOrderInfoPage soip=new SalesOrderInfoPage(driver);
		
		hp.clickOnSalesOrderLink(driver);
		sp.clickOnCreateSalesOrderImg();
		sop.enterSubjectName(tdu.fetchDataFromExcel("Data",13, 2));
		//sop.selectItemFromStatusListbox(tdu.fetchDataFromExcel("Data",13,3));
		sop.clickonorganizationImg(driver);
		sl.switchDriverFocusToChild(driver);
		sop.clickOnPopupFirstName();
		sl.acceptAlert(driver);
		sl.switchDriverFocusToMain(driver);
		sop.selectItemFromInvoiceStatusListbox(tdu.fetchDataFromExcel("Data",13, 4));
		Thread.sleep(5000);
		sop.clickOnSearchImg();
		Thread.sleep(5000);
		sl.switchDriverFocusToChild(driver);
		sop.clickOnProductPopupFirstName();
		sl.switchDriverFocusToMain(driver);
		sop.enterBiilingAddress(tdu.fetchDataFromExcel("Data", 13, 5));
		sop.enterShippingAddress(tdu.fetchDataFromExcel("Data", 13, 6));
		sop.enterFirstProductQty(tdu.fetchDataFromExcel("Data", 13, 7));
		sop.clickOnSaveBtn();
		String info=soip.getSalesOrderInfoMsg();
		Assert.assertTrue(info.contains(tdu.fetchDataFromExcel("Data", 13, 8)));
	}}





//	WebElement	more= driver.findElement(By.xpath("//a[text()='More']"));
//	Actions act=new Actions(driver);
//	act.moveToElement(more).perform();
//	
//	driver.findElement(By.linkText("Sales Order")).click();
//	driver.findElement(By.xpath("//img[@title='Create Sales Order...']")).click();
//	driver.findElement(By.name("subject")).sendKeys(tdu.fetchDataFromExcel("Data",13, 2));
//	
//	WebElement st= driver.findElement(By.name("sostatus"));
//	Select s=new Select(st);
//	s.selectByValue(tdu.fetchDataFromExcel("Data",13,3));
//	
//	driver.findElement(By.xpath("//input[@id='single_accountid']/following-sibling::img")).click();
//	String	orgID=driver.getWindowHandle();
//	Set<String> allID=driver.getWindowHandles();
//	for(String id: allID) {
//		if(!orgID.equals(id)) {
//			driver.switchTo().window(id);
//			
//		}}
//		
//	 driver.findElement(By.xpath("//a[contains(text(),'Organization Name')]/../../following-sibling::tr[1]/td[1]/a")).click();
//	Alert alt=driver.switchTo().alert();
//	alt.accept();
//	driver.switchTo().window(orgID);
//	
//
//	
//	WebElement invoicest= driver.findElement(By.xpath("//select[@name='invoicestatus']"));
//	Select in=new Select(invoicest);
//	in.selectByValue(tdu.fetchDataFromExcel("Data",13, 4));
//	
//	
//	Thread.sleep(5000);
//	driver.findElement(By.id("searchIcon1")).click();
//	
//	String mainID=driver.getWindowHandle();
//	Set<String> allsearchID= driver.getWindowHandles();
//	for(String id: allsearchID) {
//		
//		if(!mainID.equals(id)) {
//			
//			driver.switchTo().window(id);
//			}
//	}
//	 //driver.findElement(By.xpath("//a[contains(text(),'Product Name')]/../..following-sibling::tr[1]/td[2]/a")).click();
//	driver.findElement(By.xpath("//a[@id='popup_product_52']")).click();
//	driver.switchTo().window(mainID);
//	
//	 driver.findElement(By.name("bill_street")).sendKeys(tdu.fetchDataFromExcel("Data", 13, 5));
//	 driver.findElement(By.name("ship_street")).sendKeys(tdu.fetchDataFromExcel("Data", 13, 6));
//	
//	 driver.findElement(By.id("qty1")).sendKeys(tdu.fetchDataFromExcel("Data", 13, 7));
//	
//	 driver.findElement(By.cssSelector("[type='submit']")).click();
//	 
//	 String info=driver.findElement(By.className("lvtHeaderText")).getText();
//	 if(info.contains(tdu.fetchDataFromExcel("Data", 13, 8))) {
//		 

//	 }
//	 else {
//		 System.out.println("Sales Order creation fail");
//	 }
//}
//}