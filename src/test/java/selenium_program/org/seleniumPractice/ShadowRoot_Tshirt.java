package selenium_program.org.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoot_Tshirt {
	public static void main(String[]arg) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		WebElement shopapp=driver.findElement(By.xpath("//shop-app"));
		SearchContext app=shopapp.getShadowRoot();
		driver.findElement(By.cssSelector("app-header>div[id='contentContainer']>shop-tab>a[text()='Men's T-Shirts']")).click();
		
	}

}
