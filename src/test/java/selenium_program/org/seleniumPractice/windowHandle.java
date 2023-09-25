package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {
	public static void main(String[]arg) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).click();
			String mainID= driver.getWindowHandle();
			Set<String> allID=driver.getWindowHandles();
			for (String id: allID) {
				if(!mainID.equals(id)) {
				driver.switchTo().window(id);
			}
				
				String price=driver.findElement(By.xpath("//div[@class='aMaAEs']/div[@class='dyC4hf']/div[@class='CEmiEU']")).getText();
				
				System.out.println(price);
			}
			
			
			
			
	}}
