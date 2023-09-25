package selenium_program.org.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_newWindow {
	public static void main(String[]arg) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.google.com/");
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.amazon.com/");
			
			driver.quit();
			

}
}