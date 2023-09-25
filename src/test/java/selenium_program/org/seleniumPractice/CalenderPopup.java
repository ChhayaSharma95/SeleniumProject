package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {
	public static void main(String[]arg) throws AWTException {
		String date="12";
		String month="October";
		String year= "2025";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.className("ui-state-highlight")).click();
		while(true) {
			String cal_month= driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String cal_year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
			if(cal_month.equals(month) && cal_year.equals(year)) {
				break;
			}else {
				driver.findElement(By.cssSelector("a.ui-datepicker-next")).click();
				
				}
		}
			driver.findElement(By.linkText(date)).click();
		}
		
		
		
}
