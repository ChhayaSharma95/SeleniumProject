package selenium_program.org.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_prize {

public static void main(String[]arg) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver","C:\\eclipse_prog\\chromedriver\\chromedriver.exe");	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Nokia");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(1000);
	
String price=driver.findElement(By.xpath("//span[starts-with(text(),'Showing')]")).getText();
System.out.println(price);

driver.quit();
}
}
