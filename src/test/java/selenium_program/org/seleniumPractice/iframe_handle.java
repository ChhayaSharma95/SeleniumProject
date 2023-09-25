package selenium_program.org.seleniumPractice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_handle {
	public static void main(String[]arg) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameEle=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(0);
		WebElement dragEle= driver.findElement(By.id("draggable"));
		WebElement dropEle= driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragEle,dropEle).perform();
		
		driver.switchTo().parentFrame();
		
		
		
		driver.quit();
		
	

}
}