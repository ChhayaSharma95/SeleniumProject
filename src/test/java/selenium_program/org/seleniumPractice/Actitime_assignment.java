package selenium_program.org.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime_assignment {
	public static void main(String[]arg) throws InterruptedException {
       WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
    
    driver.findElement(By.id("container_users")).click();
    driver.findElement(By.className("components_button_label")).click();
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    //wait.until(ExpectedConditions.);
    driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Piyush");
    driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Rajguru");
    driver.findElement(By.id("createUserPanel_emailField")).sendKeys("piyushrajguru222@gmail.com");
    driver.findElement(By.xpath("//div[text() ='Save & Send Invitation']")).click();
    driver.quit();
}}
