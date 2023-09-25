package Section2DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomObjectRepo.HomePage;
import pomObjectRepo.LoginPage;

public class BaseClass {

	public TestDataUtils tdu= new TestDataUtils();
	public WebDriver driver ;
	public static WebDriver listenerDriver;
	@BeforeClass(alwaysRun=true)
	public void openBrowser() throws IOException {
		System.out.println("Browser Launch");
		
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		listenerDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(tdu.fatchDataFromProperty("URL"));
		
//	@Parameters("browser")
//		@BeforeClass(alwaysRun=true)
//		public void openBrowser(String browser) throws IOException {
//			System.out.println("Browser Launch");
//		if(browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else if(browser.equals("edge")){
//			
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//			
//		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get(tdu.fatchDataFromProperty("URL"));
//		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException {
		System.out.println("login Done");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(tdu.fatchDataFromProperty("UserName"),tdu.fatchDataFromProperty("Password"));
		
//		driver.findElement(By.name("user_name")).sendKeys(tdu.fatchDataFromProperty("UserName"));
//		driver.findElement(By.name("user_password")).sendKeys(tdu.fatchDataFromProperty("Password"));
//		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		System.out.println("logout Done");
		HomePage hp=new HomePage(driver);
		hp.LogoutFromApp(driver);
//		WebElement admin= driver.findElement(By.xpath("//span[@class='userName']/../following-sibling::td/img"));
//		Actions act=new Actions(driver);
//		act.moveToElement(admin).perform();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Browser CLose");
		driver.quit();
	}
	
	
	
}
