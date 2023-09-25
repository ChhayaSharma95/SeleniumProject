package pomObjectRepo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SharedLibrary {
private String mainID;
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void rejectAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
	
	public String getAlertmsg(WebDriver driver) {
		String msg=driver.switchTo().alert().getText();
		return msg;
	}
	
	//listBox
	public void selectItemFromListByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void selectItemFromListByValue(WebElement element, String Value) {
		Select s = new Select(element);
		s.selectByVisibleText(Value);
	}
	
	//mouseOver
	
	public void moveMouseOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	//WindowHandling
	public void switchDriverFocusToChild(WebDriver driver) {
	mainID=driver.getWindowHandle();
	Set<String> allID=driver.getWindowHandles();
	
	for(String id: allID) {
		if(!mainID.equals(id)) {
			driver.switchTo().window(id);
		}
	}
	}

	public void switchDriverFocusToMain(WebDriver driver) {
		driver.switchTo().window(mainID);
	}
}


