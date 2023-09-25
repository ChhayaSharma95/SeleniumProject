package DemoAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileDataDrivenTesting {
	public static void main(String[]arg) throws InterruptedException, IOException {
	
	FileInputStream fis= new FileInputStream("C:\\Users\\chhs\\Documents\\Chhaya_AllDocuments\\PropertiesFile.properties");
	Properties pob=new Properties();
	pob.load(fis);
	String url= pob.getProperty("URL");
	String username= pob.getProperty("UserName");
	String pwd= pob.getProperty("Password");
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(pwd);
	
}
}
