package selenium_program.org.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mvn_repository {

	public static void main(String[]arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse_prog\\chromedriver\\chromedriver.exe");	//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://mvnrepository.com/search?q=chrome");
	driver.findElement(By.className("textfield")).sendKeys("Apache common IO");
	driver.findElement(By.cssSelector("[type=submit]")).click();
	driver.findElement(By.xpath("//a[text()='Apache Commons IO']")).click();
	driver.findElement(By.xpath("//a[text()='2.11.0']")).click();
	
	driver.quit();
	}
}
