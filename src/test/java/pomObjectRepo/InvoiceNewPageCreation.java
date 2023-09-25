package pomObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceNewPageCreation {
	
	@FindBy(name="subject")
	private WebElement invoiesub;
	
	@FindBy(xpath="//input[@id='single_accountid']/..//img")
	private WebElement orgName;
	
    @FindBy(name="bill_street")
    private WebElement billaddress;
    
    @FindBy(name="bill_street")
    private WebElement shippaddress;
    
    @FindBy(id="searchIcon1")
    private WebElement itemNameImg;
    
    @FindBy(id="qty1")
    private WebElement stockQty;
    
    @FindBy(xpath="//a[contains(text(),'Organization Name')]/../../following-sibling::tr[1]/td[1]/a")
    private WebElement selectOrganizationName;
    
    @FindBy(xpath="//td[@class='lvtCol']/../following-sibling::tr[1]//a")
    private WebElement selectItemName;
    
    @FindBy(css="[type='submit']")
	private WebElement submit;

public InvoiceNewPageCreation(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterSubjectName(String name) {
	invoiesub.sendKeys(name);
}

public void clickOnOrganizationName() {
	orgName.click();
}

public void enterBillStreetaddress(String billName) {
	billaddress.sendKeys(billName);
}

public void enterShippingaddress(String shippName) {
	shippaddress.sendKeys(shippName);
}

public void clickOnItemNameImg() {
	itemNameImg.click();
}

public void enterStockQty(String qty) {
	stockQty.sendKeys(qty);
}

public void clickOnFirstOrganizationName() {
	selectOrganizationName.click();
}

public void clickOnFirstItemName() {
	selectItemName.click();
}
public void clickOnSaveBtn() {
	submit.click();
}
}