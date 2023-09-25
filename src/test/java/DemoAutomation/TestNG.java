package DemoAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNG {
	

	@BeforeClass
	public void openBrowser() {
		System.out.println("openBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
		
	}
     
	@Test
	public void createProduct() {
		System.out.println("createProduct");
}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
		
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println("closeBrowser");
		
	}
}
