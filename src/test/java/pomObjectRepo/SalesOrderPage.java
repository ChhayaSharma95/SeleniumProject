package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	@FindBy(xpath="//img[@title='Create Sales Order...']")
	private WebElement createsalesordermg;
	
	public SalesOrderPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCreateSalesOrderImg() {
		createsalesordermg.click();
		
	}
}
