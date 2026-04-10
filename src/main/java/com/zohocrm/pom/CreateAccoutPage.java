package com.zohocrm.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateAccoutPage {
	@FindBy(xpath = "//input[@name='property(Account Name)']")
	private WebElement AccountNameTxtField;

	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement PhoneTxtField;

	@FindBy(xpath = "//input[@name='property(Account Site)']")
	private WebElement AccountSiteTxtField;

	@FindBy(xpath = "//input[@name='property(Fax)']")
	private WebElement FaxTxtField;

	@FindBy(xpath = "//input[@name='property(Parent Account)']")
	private WebElement ParentAccountTxtField;

	@FindBy(xpath = "//input[@name='property(Website)']")
	private WebElement WebsiteTxtField;

	@FindBy(xpath = "//input[@name='property(Account Number)']")
	private WebElement AccountNumberTxtField;

	@FindBy(xpath = "//input[@name='property(Ticker Symbol)']")
	private WebElement TickerSymbolTxtField;

	@FindBy(xpath = "//select[@name='property(Account Type)']")
	private WebElement AccountTypeDropdown;

	@FindBy(xpath = "//select[@name='property(Ownership)']")
	private WebElement OwnershipDropdown;

	@FindBy(xpath = "//select[@name='property(Industry)']")
	private WebElement IndustryDropdown;

	@FindBy(xpath = "//input[@name='property(Employees)']")
	private WebElement EmployeesTxtField;

	@FindBy(xpath = "//input[@name='property(Annual Revenue)']")
	private WebElement AnnualRevenueTxtField;

	@FindBy(xpath = "//input[@name='property(SIC Code)']")
	private WebElement SICCodeTxtField;


	// Address Information
	@FindBy(xpath = "//input[@name='property(Billing Street)']")
	private WebElement BillingStreetTxtField;

	@FindBy(xpath = "//input[@name='property(Billing City)']")
	private WebElement BillingCityTxtField;

	@FindBy(xpath = "//input[@name='property(Billing State)']")
	private WebElement BillingStateTxtField;

	@FindBy(xpath = "//input[@name='property(Billing Code)']")
	private WebElement BillingCodeTxtField;

	@FindBy(xpath = "//input[@name='property(Billing Country)']")
	private WebElement BillingCountryTxtField;
	
	@FindBy(xpath = "//input[@value='Copy Address']")
	private WebElement CopyAddressbtn;

	@FindBy(xpath = "//input[@name='property(Shipping Street)']")
	private WebElement ShippingStreetTxtField;

	@FindBy(xpath = "//input[@name='property(Shipping City)']")
	private WebElement ShippingCityTxtField;

	@FindBy(xpath = "//input[@name='property(Shipping State)']")
	private WebElement ShippingStateTxtField;

	@FindBy(xpath = "//input[@name='property(Shipping Code)']")
	private WebElement ShippingCodeTxtField;

	@FindBy(xpath = "//input[@name='property(Shipping Country)']")
	private WebElement ShippingCountryTxtField;

	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionTxtField;
	
	@FindBy(xpath = "(//input[@value='Save'])[last()]")
	private WebElement savebtn;
	
	@FindBy(xpath = "(//input[@value='Save & New'])[last()]")
	private WebElement SaveAndNewbtn;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[last()]")
	private WebElement Cancelbtn;
	
	public CreateAccoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountNameTxtField() {
		return AccountNameTxtField;
	}

	public WebElement getPhoneTxtField() {
		return PhoneTxtField;
	}

	public WebElement getAccountSiteTxtField() {
		return AccountSiteTxtField;
	}

	public WebElement getFaxTxtField() {
		return FaxTxtField;
	}

	public WebElement getParentAccountTxtField() {
		return ParentAccountTxtField;
	}

	public WebElement getWebsiteTxtField() {
		return WebsiteTxtField;
	}

	public WebElement getAccountNumberTxtField() {
		return AccountNumberTxtField;
	}

	public WebElement getTickerSymbolTxtField() {
		return TickerSymbolTxtField;
	}

	public WebElement getAccountTypeDropdown() {
		return AccountTypeDropdown;
	}

	public WebElement getOwnershipDropdown() {
		return OwnershipDropdown;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getEmployeesTxtField() {
		return EmployeesTxtField;
	}

	public WebElement getAnnualRevenueTxtField() {
		return AnnualRevenueTxtField;
	}

	public WebElement getSICCodeTxtField() {
		return SICCodeTxtField;
	}

	public WebElement getBillingStreetTxtField() {
		return BillingStreetTxtField;
	}

	public WebElement getBillingCityTxtField() {
		return BillingCityTxtField;
	}

	public WebElement getBillingStateTxtField() {
		return BillingStateTxtField;
	}

	public WebElement getBillingCodeTxtField() {
		return BillingCodeTxtField;
	}

	public WebElement getBillingCountryTxtField() {
		return BillingCountryTxtField;
	}

	public WebElement getCopyAddressbtn() {
		return CopyAddressbtn;
	}

	public WebElement getShippingStreetTxtField() {
		return ShippingStreetTxtField;
	}

	public WebElement getShippingCityTxtField() {
		return ShippingCityTxtField;
	}

	public WebElement getShippingStateTxtField() {
		return ShippingStateTxtField;
	}

	public WebElement getShippingCodeTxtField() {
		return ShippingCodeTxtField;
	}

	public WebElement getShippingCountryTxtField() {
		return ShippingCountryTxtField;
	}

	public WebElement getDescriptionTxtField() {
		return DescriptionTxtField;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSaveAndNewbtn() {
		return SaveAndNewbtn;
	}

	public WebElement getCancelbtn() {
		return Cancelbtn;
	}

		
}
