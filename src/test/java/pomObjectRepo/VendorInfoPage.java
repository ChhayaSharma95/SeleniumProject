package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorInfoPage {

	
	@FindBy(className="lvtHeaderText")
	private WebElement vendorInfomsg;
	
public VendorInfoPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public String VendorInfoMsg() {
		return vendorInfomsg.getText();
	}
	
	
}


