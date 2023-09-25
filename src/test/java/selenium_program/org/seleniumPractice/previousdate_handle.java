package selenium_program.org.seleniumPractice;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class previousdate_handle {
	public static void main(String[]arg) {
	String date="15";
	String month="October";
	String year= "1999";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.findElement(By.id("datepicker")).click();
	while(true) {
	String mon=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
	String yr=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
	
	if(mon.equals(month)&& yr.equals(year)) {
		break;
	}
		else {
		driver.findElement(By.cssSelector(".ui-datepicker-prev")).click();
	}
	
	}
	driver.findElement(By.linkText(date)).click();
	}
}