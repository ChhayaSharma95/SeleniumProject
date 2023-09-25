package pomObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="//span[@class='userName']/../following-sibling::td/img")   
     private WebElement administrator;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
// Common xpath
	@FindBy(xpath="//a[text()='More']")
	private WebElement more;
	
//Vendor Locator
	@FindBy(linkText="Vendors")
	private WebElement vendortb;
	
// SalesOrder Locators
	@FindBy(linkText="Sales Order")
	private WebElement salestb;
	
	@FindBy(linkText="Invoice")
	private WebElement invoicetb;
	
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public void LogoutFromApp(WebDriver driver) {
		
		Actions act=new Actions(driver);
		act.moveToElement(administrator).perform();
		signout.click();
		
	}
	
	
	public void clickOnvenderLink(WebDriver driver) {
		
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		vendortb.click();
		
	}
	
	public void clickOnSalesOrderLink(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		salestb.click();
	}
	
	public void clickOnInvoiceLink(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		invoicetb.click();
	}
	
	
}