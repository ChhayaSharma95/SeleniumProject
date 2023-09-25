package DemoAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Section2DataDrivenTesting.BaseClass;

public class DataProviderExecution {

	@Test(dataProvider="credentialsSupplier")
	public void loginToApp(String UserName, String Password) {
		System.out.println("username: "+ UserName);
		System.out.println("Password: " + Password);
		
	}
	@DataProvider
	public Object[][] credentialsSupplier(){
		Object [][] objarr=new Object[4][2];
		
		objarr[0][0]="admin";
		objarr[0][1]="root";
		
		objarr[1][0]="admin1";
		objarr[1][1]="root1";
		
		objarr[2][0]="admin2";
		objarr[2][1]="root2";
		
		objarr[3][0]="admin3";
		objarr[3][1]="root3";
		return objarr;
		
	}
}
//@DataProvider annotation method return type is always Object[][](2D object Array)
