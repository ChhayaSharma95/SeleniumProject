package Section2DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionMonitor implements ITestListener {
	
	public void onTestFailure(ITestResult res) {
		
		System.out.println("Test Case failed");
		TakesScreenshot ts=(TakesScreenshot)BaseClass.listenerDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./screenshots/" + res.getName() + ".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
