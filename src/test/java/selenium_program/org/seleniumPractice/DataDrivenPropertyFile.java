package selenium_program.org.seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenPropertyFile {
	public static void main(String[]arg) throws InterruptedException, IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\eclipse_prog\\chromedriver\\chromedriver.exe");	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
		FileInputStream fis= new FileInputStream("C:\\Users\\chhs\\Documents\\Chhaya_AllDocuments\\PropertiesFile.properties");
		Properties pob=new Properties();
		pob.load(fis);
		String url= pob.getProperty("URL");
		String username= pob.getProperty("UserName");
		String pwd= pob.getProperty("UserName");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
		
}
}