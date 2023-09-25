package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddenDivisionPopup {
	public static void main(String[]arg) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox')])[2]")).click();
		driver.findElement(By.cssSelector("[class='assignTo button']")).click();
		driver.findElement(By.xpath("//div[@class='buttonIcon']//span[text()='Assign']")).click();
		driver.quit();
		
}
}