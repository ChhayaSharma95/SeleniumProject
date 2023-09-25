package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFile_sendKeys {
	public static void main(String[]arg) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		;
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Demo\\shopware_filterfields.docx");
		
}
}