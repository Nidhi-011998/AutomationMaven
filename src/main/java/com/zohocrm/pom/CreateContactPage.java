package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(xpath = "//input[@name='property(Contact Owner)']")
	private WebElement contactOwnerTxtField;

	@FindBy(xpath = "//select[@name='property(Lead Source)']")
	private WebElement leadSourceDropdown;

	@FindBy(xpath = "//input[@name='property(First Name)']")
	private WebElement firstNameTxtField;

	@FindBy(xpath = "//input[@name='property(Last Name)']")
	private WebElement lastNameTxtField;

	@FindBy(xpath = "//input[@name='property(Account Name)']")
	private WebElement accountNameTxtField;

	@FindBy(xpath = "//input[@name='property(Vendor Name)']")
	private WebElement vendorNameTxtField;

	@FindBy(xpath = "//input[@name='property(Email)']")
	private WebElement emailTxtField;

	@FindBy(xpath = "//input[@name='property(Title)']")
	private WebElement titleTxtField;

	@FindBy(xpath = "//input[@name='property(Department)']")
	private WebElement departmentTxtField;

	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement phoneTxtField;

	@FindBy(xpath = "//input[@name='property(Home Phone)']")
	private WebElement homePhoneTxtField;

	@FindBy(xpath = "//input[@name='property(Other Phone)']")
	private WebElement otherPhoneTxtField;

	@FindBy(xpath = "//input[@name='property(Fax)']")
	private WebElement faxTxtField;

	@FindBy(xpath = "//input[@name='property(Mobile)']")
	private WebElement mobileTxtField;

	@FindBy(xpath = "//input[@name='property(Date of Birth)']")
	private WebElement dateOfBirthField;

	@FindBy(xpath = "//input[@name='property(Assistant)']")
	private WebElement assistantTxtField;

	@FindBy(xpath = "//input[@name='property(Asst Phone)']")
	private WebElement assistantPhoneTxtField;

	@FindBy(xpath = "//input[@name='property(Reports To)']")
	private WebElement reportsToTxtField;

	@FindBy(xpath = "//input[@name='property(Mailing Street)']")
	private WebElement mailingStreetTxtArea;

	@FindBy(xpath = "//input[@name='property(Other Street)']")
	private WebElement otherStreetTxtArea;

	@FindBy(xpath = "//input[@name='property(Mailing City)']")
	private WebElement mailingCityTxtField;

	@FindBy(xpath = "//input[@name='property(Other City)']")
	private WebElement otherCityTxtField;

	@FindBy(xpath = "//input[@name='property(Mailing State)']")
	private WebElement mailingStateTxtField;

	@FindBy(xpath = "//input[@name='property(Other State)']")
	private WebElement otherStateTxtField;

	@FindBy(xpath = "//input[@name='property(Mailing Zip)']")
	private WebElement mailingZipTxtField;

	@FindBy(xpath = "//input[@name='property(Other Zip)']")
	private WebElement otherZipTxtField;

	@FindBy(xpath = "//input[@name='property(Mailing Country)']")
	private WebElement mailingCountryTxtField;

	@FindBy(xpath = "//input[@name='property(Other Country)']")
	private WebElement otherCountryTxtField;
	
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionTxtField;
	
	@FindBy(xpath = "(//input[@value='Save'])[last()]")
	private WebElement savebtn;
	
	@FindBy(xpath = "(//input[@value='Save & New'])[last()]")
	private WebElement SaveAndNewbtn;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[last()]")
	private WebElement Cancelbtn;
	
	

	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactOwnerTxtField() {
		return contactOwnerTxtField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getFirstNameTxtField() {
		return firstNameTxtField;
	}

	public WebElement getLastNameTxtField() {
		return lastNameTxtField;
	}

	public WebElement getAccountNameTxtField() {
		return accountNameTxtField;
	}

	public WebElement getVendorNameTxtField() {
		return vendorNameTxtField;
	}

	public WebElement getEmailTxtField() {
		return emailTxtField;
	}

	public WebElement getTitleTxtField() {
		return titleTxtField;
	}

	public WebElement getDepartmentTxtField() {
		return departmentTxtField;
	}

	public WebElement getPhoneTxtField() {
		return phoneTxtField;
	}

	public WebElement getHomePhoneTxtField() {
		return homePhoneTxtField;
	}

	public WebElement getOtherPhoneTxtField() {
		return otherPhoneTxtField;
	}

	public WebElement getFaxTxtField() {
		return faxTxtField;
	}

	public WebElement getMobileTxtField() {
		return mobileTxtField;
	}

	public WebElement getDateOfBirthField() {
		return dateOfBirthField;
	}

	public WebElement getAssistantTxtField() {
		return assistantTxtField;
	}

	public WebElement getAssistantPhoneTxtField() {
		return assistantPhoneTxtField;
	}

	public WebElement getReportsToTxtField() {
		return reportsToTxtField;
	}

	public WebElement getMailingStreetTxtArea() {
		return mailingStreetTxtArea;
	}

	public WebElement getOtherStreetTxtArea() {
		return otherStreetTxtArea;
	}

	public WebElement getMailingCityTxtField() {
		return mailingCityTxtField;
	}

	public WebElement getOtherCityTxtField() {
		return otherCityTxtField;
	}

	public WebElement getMailingStateTxtField() {
		return mailingStateTxtField;
	}

	public WebElement getOtherStateTxtField() {
		return otherStateTxtField;
	}

	public WebElement getMailingZipTxtField() {
		return mailingZipTxtField;
	}

	public WebElement getOtherZipTxtField() {
		return otherZipTxtField;
	}

	public WebElement getMailingCountryTxtField() {
		return mailingCountryTxtField;
	}

	public WebElement getOtherCountryTxtField() {
		return otherCountryTxtField;
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
