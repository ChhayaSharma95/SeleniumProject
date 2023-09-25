package pomObjectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement userNametb;
	
	@FindBy(name="user_password")
	private WebElement passWordtb;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void loginToApp(String username, String password) {
		
		userNametb.sendKeys(username);
		passWordtb.sendKeys(password);
		submitbutton.click();
	}
	
}
	
	
	
	

