package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload2 {
	public static void main(String[]arg) throws AWTException {
		HashMap m=new HashMap();
		m.put("download.default_directory","C:\\Demo");
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",m);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://maven.apache.org/download.cgi");
		
		driver.findElement(By.linkText("apache-maven-3.8.6-bin.zip")).click();
		 
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
}
