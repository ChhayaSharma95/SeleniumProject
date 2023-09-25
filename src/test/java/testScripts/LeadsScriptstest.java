package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;

public class LeadsScriptstest extends BaseClass {

@Test(groups= {"smoke"})
	public void CreateLeads() throws EncryptedDocumentException, IOException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(tdu.fetchDataFromExcel("Data", 7, 2));
		driver.findElement(By.name("company")).sendKeys(tdu.fetchDataFromExcel("Data", 7, 3));
		
		WebElement leadsour=driver.findElement(By.name("leadsource"));
		Select source=new Select(leadsour);
		source.selectByValue(tdu.fetchDataFromExcel("Data", 7, 4));
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		String info=driver.findElement(By.className("dvHeaderText")).getText();
	    
		if(info.contains(tdu.fetchDataFromExcel("Data", 7, 5))) {
		System.out.println("Lead Created Successfully");
		}
		else {
			System.out.println("Lead Creation fail");
		}
	}
}
