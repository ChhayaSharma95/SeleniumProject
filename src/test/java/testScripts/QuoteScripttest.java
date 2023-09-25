package testScripts;

	
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;

	
public class QuoteScripttest extends BaseClass {
	@Test(groups= {"sanity"})	
	public void CreateQuotesValidation() throws InterruptedException, EncryptedDocumentException, IOException {
			
		WebElement	more= driver.findElement(By.xpath("//a[text()='More']"));
			Actions act=new Actions(driver);
			act.moveToElement(more).perform();
			
			driver.findElement(By.linkText("Quotes")).click();
			driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
			driver.findElement(By.name("subject")).sendKeys(tdu.fetchDataFromExcel("Data",10,2));
			
			WebElement create=driver.findElement(By.name("quotestage"));
			Select list=new Select(create);
			list.selectByValue(tdu.fetchDataFromExcel("Data",10,3));
			
			driver.findElement(By.xpath("//input[@id='single_accountid']/following-sibling::img")).click();
			String	orgID=driver.getWindowHandle();
			Set<String> allID=driver.getWindowHandles();
			for(String id: allID) {
				if(!orgID.equals(id)) {
					driver.switchTo().window(id);
					
				}}
				
			driver.findElement(By.xpath("//a[contains(text(),'Organization Name')]/../../following-sibling::tr[1]/td[1]/a")).click();
			Alert alt=driver.switchTo().alert();
			alt.accept();
			driver.switchTo().window(orgID);
			
				
	driver.findElement(By.id("searchIcon1")).click();
	String	itemID=driver.getWindowHandle();
	Set<String> itID=driver.getWindowHandles();
	for(String id: itID) {
		if(!orgID.equals(id)) {
			driver.switchTo().window(id);
			
		}}
		
	  driver.findElement(By.xpath("//a[text()='Vtiger Single User Pack']")).click();
	  driver.switchTo().window(itemID);
	  
	  driver.findElement(By.id("qty1")).sendKeys(tdu.fetchDataFromExcel("Data", 10, 4));

	driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}