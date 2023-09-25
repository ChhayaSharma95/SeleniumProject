package testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;
import pomObjectRepo.HomePage;
import pomObjectRepo.VendorCreation;
import pomObjectRepo.VendorInfoPage;


@Listeners(Section2DataDrivenTesting.ExecutionMonitor.class)
public class VendorScripttest extends BaseClass {

	@Test(groups= {"smoke"})
	public void CreateVendor () throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		VendorCreation vc=new VendorCreation(driver);
		VendorInfoPage vip=new VendorInfoPage(driver);
		hp.clickOnvenderLink(driver);
		vc.clickOnCreateImg();
		vc.entername(tdu.fetchDataFromExcel("Data",4,2));
		vc.clickOnsubmitButton();
		String info=vip.VendorInfoMsg();
		//Assert.assertTrue(info.contains(tdu.fetchDataFromExcel("Data",4,3)));
		System.out.println("Vendor created successfully");
		
	}}	
		
		
		
		
		
		
		
		
//			WebElement	more= driver.findElement(By.xpath("//a[text()='More']"));
//			Actions act=new Actions(driver);
//			act.moveToElement(more).perform();
//			
//			driver.findElement(By.linkText("Vendors")).click();
//			driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
//			driver.findElement(By.name("vendorname")).sendKeys(tdu.fetchDataFromExcel("Data",4,2));
//			
//			driver.findElement(By.cssSelector("[type='submit']")).click();
			
		//	String info=driver.findElement(By.className("lvtHeaderText")).getText();
			
//			 if(info.contains(tdu.fetchDataFromExcel("Data",4,3))) {
//				 System.out.println("Vendor created successfully");
//			 }
//			 else {
//				 System.out.println("Vendor creation fail");
//			 }
//	}
//}
