package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {

		
		@FindBy(css="[title='Create Invoice...']")
		private WebElement createInvoiceImg;
		
		public InvoicePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		
		
	}
		public void clickOnCreateInvoiceImg() {
			createInvoiceImg.click();
		}
}
