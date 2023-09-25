package selenium_program.org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_allLinks {
	public static void main(String[]arg) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement wb: allLinks) {
			System.out.println(wb.getAttribute("href"));
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("total number of links" + count);
		driver.quit();
	}
}
