package DemoAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Section2DataDrivenTesting.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToVtiger extends BaseClass{
	
	@Test
	public void homePageValidation() throws EncryptedDocumentException, IOException {
		WebElement homeEle= driver.findElement(By.xpath(""));
		String homeText= tdu.fetchDataFromExcel("TestCaseData",1,2);
		
//		if(homeEle.getText().contains(homeText)) {
//			System.out.println("Login pass");
//		}
//		else {
//			System.out.println("Login fail");
//		}
		String exc= "homeText";
		//Assert.assertEquals(exc,"homeText");
		//Assert.assertEquals(exc,"Home");  //java.lang.AssertionError
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(exc,"homeText");
		
		//Assert.assertTrue(exc.contains("Text"));
		//Assert.assertTrue(exc.contains("TextH"));   //java.lang.AssertionError
		sa.assertTrue(exc.contains("Text"));
		sa.assertAll();	
		driver.quit();
	}	
}
