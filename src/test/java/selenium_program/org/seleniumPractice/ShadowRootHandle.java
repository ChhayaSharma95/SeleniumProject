package selenium_program.org.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootHandle {
	public static void main(String[]arg) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://books-pwakit.appspot.com/");
			WebElement bookapp=driver.findElement(By.xpath("//book-app"));
			SearchContext root1= bookapp.getShadowRoot();
			
			root1.findElement(By.cssSelector("app-header>app-toolbar[class='toolbar-bottom']>book-input-decorator>[id='input']")).sendKeys("Chetan",Keys.ENTER);
			driver.quit();
			
			
			
			
			//https://shop.polymer-project.org/ then click on men's T-shirt
			
}}
