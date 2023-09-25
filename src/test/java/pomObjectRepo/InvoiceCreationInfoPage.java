package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceCreationInfoPage {

	@FindBy(className="lvtHeaderText")
	private WebElement invoiceInfomsg;
	
	
	public InvoiceCreationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String validateInvoiceInfomsg() {
		return invoiceInfomsg.getText();
	}
	
}