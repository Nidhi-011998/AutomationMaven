package com.zohocrm.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateLeadPage {
	@FindBy(xpath = "//input[@name='property(Company)']")
	private WebElement CompanyTxtField;

	@FindBy(xpath = "//input[@name='property(First Name)']")
	private WebElement FirstNameTxtField;

	@FindBy(xpath = "//input[@name='property(Last Name)']")
	private WebElement LastNameTxtField;

	@FindBy(xpath = "//input[@name='property(Designation)']")
	private WebElement DesignationTxtField;

	@FindBy(xpath = "//input[@name='property(Email)']")
	private WebElement EmailTxtField;

	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement PhoneTxtField;

	@FindBy(xpath = "//input[@name='property(Fax)']")
	private WebElement FaxTxtField;

	@FindBy(xpath = "//input[@name='property(Mobile)']")
	private WebElement MobileTxtField;

	@FindBy(xpath = "//input[@name='property(Website)']")
	private WebElement WebsiteTxtField;

	@FindBy(xpath = "//select[@name='property(Lead Source)']")
	private WebElement LeadSourceDropdown;

	@FindBy(xpath = "//select[@name='property(Lead Status)']")
	private WebElement LeadStatusDropdown;

	@FindBy(xpath = "//select[@name='property(Industry)']")
	private WebElement IndustryDropdown;

	@FindBy(xpath = "//input[@name='property(No of Employees)']")
	private WebElement NoOfEmployeesTxtField;

	@FindBy(xpath = "//input[@name='property(Annual Revenue)']")
	private WebElement AnnualRevenueTxtField;

	@FindBy(xpath = "//select[@name='property(Rating)']")
	private WebElement RatingDropdown;

	@FindBy(xpath = "//select[@name='property(Campaign Source)']")
	private WebElement CampaignSourceDropdown;
	
	@FindBy(xpath = "//input[@name='property(Street)']")
	private WebElement StreetTxtField;

	@FindBy(xpath = "//input[@name='property(City)']")
	private WebElement CityTxtField;

	@FindBy(xpath = "//input[@name='property(State)']")
	private WebElement StateTxtField;

	@FindBy(xpath = "//input[@name='property(Zip Code)']")
	private WebElement ZipCodeTxtField;

	@FindBy(xpath = "//input[@name='property(Country)']")
	private WebElement CountryTxtField;
	
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionTxtField;
	
	@FindBy(xpath = "(//input[@value='Save'])[last()]")
	private WebElement savebtn;
	
	@FindBy(xpath = "(//input[@value='Save & New'])[last()]")
	private WebElement SaveAndNewbtn;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[last()]")
	private WebElement Cancelbtn;
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCompanyTxtField() {
		return CompanyTxtField;
	}

	public WebElement getFirstNameTxtField() {
		return FirstNameTxtField;
	}

	public WebElement getLastNameTxtField() {
		return LastNameTxtField;
	}

	public WebElement getDesignationTxtField() {
		return DesignationTxtField;
	}

	public WebElement getEmailTxtField() {
		return EmailTxtField;
	}

	public WebElement getPhoneTxtField() {
		return PhoneTxtField;
	}

	public WebElement getFaxTxtField() {
		return FaxTxtField;
	}

	public WebElement getMobileTxtField() {
		return MobileTxtField;
	}

	public WebElement getWebsiteTxtField() {
		return WebsiteTxtField;
	}

	public WebElement getLeadSourceDropdown() {
		return LeadSourceDropdown;
	}

	public WebElement getLeadStatusDropdown() {
		return LeadStatusDropdown;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getNoOfEmployeesTxtField() {
		return NoOfEmployeesTxtField;
	}

	public WebElement getAnnualRevenueTxtField() {
		return AnnualRevenueTxtField;
	}

	public WebElement getRatingDropdown() {
		return RatingDropdown;
	}

	public WebElement getCampaignSourceDropdown() {
		return CampaignSourceDropdown;
	}

	public WebElement getStreetTxtField() {
		return StreetTxtField;
	}

	public WebElement getCityTxtField() {
		return CityTxtField;
	}

	public WebElement getStateTxtField() {
		return StateTxtField;
	}

	public WebElement getZipCodeTxtField() {
		return ZipCodeTxtField;
	}

	public WebElement getCountryTxtField() {
		return CountryTxtField;
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
