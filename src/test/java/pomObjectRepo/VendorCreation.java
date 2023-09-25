package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorCreation {

	//Vendor Locators
		@FindBy(xpath="//a[text()='More']")
		private WebElement more;
		
		
		@FindBy(xpath="//img[@title='Create Vendor...']")
		private WebElement createLink;
		
		@FindBy(name="vendorname")
		private WebElement vendornm;
		
		@FindBy(css="[type='submit']")
		private WebElement submittb;
		
		@FindBy(name="lvtHeaderText")
		private WebElement validate;
		
		public VendorCreation(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		
	
	
	public void clickOnCreateImg() {
		createLink.click();
	}
	
	public void entername(String name) {
		vendornm.sendKeys(name);
	}
	public void clickOnsubmitButton() {
		vendornm.click();
	}
	
	public void validateVendor(String info) {
		validate.getText();
	}
}
