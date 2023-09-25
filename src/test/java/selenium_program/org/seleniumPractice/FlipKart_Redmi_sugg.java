package selenium_program.org.seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart_Redmi_sugg {
	public static void main(String[]arg) throws InterruptedException {
 
 WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("redme");
	
	
	List<WebElement> redmisugg= driver.findElements(By.xpath("//ul//li"));
	
	for(WebElement wb:redmisugg) {
		System.out.println(wb.getText());
		String text= wb.getText();
	Thread.sleep(2000);
		if(text.contains("redme note 11pro")) {
			//Thread.sleep(1000);			//System.out.println("mobile is present")	;
	wb.click();
		break;
	}
	}
	System.out.println(redmisugg.size());
	driver.quit();
}
}

