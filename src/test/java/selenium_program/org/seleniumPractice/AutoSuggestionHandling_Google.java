package selenium_program.org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandling_Google {
public static void main(String[]arg) throws InterruptedException {
		String searchItem="selenium";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys(searchItem);
		
		Thread.sleep(2000);
		List<WebElement> autosugg=driver.findElements(By.xpath("//span[starts-with(text(),'" + searchItem +"')]"));
		
		for(WebElement wb:autosugg) {
			
			System.out.println(wb.getText());
			
		}
		System.out.println(autosugg.size());
		driver.quit();
		
}
}