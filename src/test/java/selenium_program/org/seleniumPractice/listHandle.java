package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listHandle {
	public static void main(String[]arg) throws InterruptedException, AWTException {
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Employment Status']/../following-sibling::div//div[@class='oxd-select-text--after']")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("(//div[text()='Full-Time Permanent'])[2]")).click();
      
}}
