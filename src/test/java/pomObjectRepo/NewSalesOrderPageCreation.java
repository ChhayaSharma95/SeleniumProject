package pomObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewSalesOrderPageCreation {

		
		
		@FindBy(name="subject")
		private WebElement subname;
		
		@FindBy(name="sostatus")
		private WebElement status;
	
		@FindBy(xpath="//input[@id='single_accountid']/following-sibling::img")
		private WebElement OrganizationImg;
		
		@FindBy(xpath="//a[contains(text(),'Organization Name')]/../../following-sibling::tr[1]/td[1]/a")
		private WebElement organizationFirstName;
		
		@FindBy(id="searchIcon1")
		private WebElement searchIcon;
		
		@FindBy(xpath="//a[@id='popup_product_52']")
		private WebElement product;
		
		@FindBy(xpath="//select[@name='invoicestatus']")
		private WebElement selectInvoiceStatus;
		
		@FindBy(id="searchIcon1")
         private WebElement searchImg;
		
		@FindBy(xpath="//a[@id='popup_product_52']")
		private WebElement searchFirstName;
		
		@FindBy(name="bill_street")
		private WebElement billStreet;
		
		@FindBy(name="ship_street")
		private WebElement shipStreet;
		
		@FindBy(name="qty1")
		private WebElement quantity;
		
		@FindBy(css="[type='submit']")
		private WebElement submit;
		
		@FindBy(className=("lvtHeaderText"))
		private WebElement salesOrdervalidation;
		
		public NewSalesOrderPageCreation(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		
		
		public void enterSubjectName(String name) {
			
			subname.sendKeys(name);
		}
			
//		public void selectItemFromStatusListbox(String value) {
//			
//			SharedLibrary ssl=new SharedLibrary();
//			ssl.selectItemFromListByValue(status,value);
//			
//		}
		public void clickonorganizationImg(WebDriver driver) {
			
			OrganizationImg.click();
//			
		}
		
		public void clickOnPopupFirstName() {
			organizationFirstName.click();
		}
		
		public void clickOnProductPopupFirstName() {
			product.click();
		}
		
		public void selectItemFromInvoiceStatusListbox(String value) {
			SharedLibrary ssl=new SharedLibrary();
			ssl.selectItemFromListByValue(selectInvoiceStatus,value);
		}
		
		
		public void clickOnSearchImg() {
			searchImg.click();
		}
		
		public void clickonFirstName() {
			searchFirstName.click();
		}
		
		public void enterBiilingAddress(String billname) {
			billStreet.sendKeys(billname);
		}
		
		public void enterShippingAddress(String shippingStreet) {
			shipStreet.sendKeys(shippingStreet);
		}
		
		public void enterFirstProductQty(String qty) {
			quantity.sendKeys(qty);
		}
		
		public void clickOnSaveBtn() {
			submit.click();
		}
		
		

}
