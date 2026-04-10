package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloneCampaignPage {
	@FindBy(xpath = "//input[@name='property(Campaign Name)']")
	private WebElement CampaignNameTxtField;
	
	@FindBy(xpath = "//input[@name='property(Start Date)']")
	private WebElement StartDateField;
	
	@FindBy(xpath = "//input[@name='property(Expected Revenue)']")
	private WebElement ExpectedRevenueTxtField;
	
	@FindBy(xpath = "//input[@name='property(Actual Cost)']")
	private WebElement ActualCostTxtField;
	
	@FindBy(xpath = "//input[@name='property(Num sent)']")
	private WebElement NumSentTxtField;
	
	@FindBy(xpath = "//input[@name='property(Type)']")
	private WebElement TypeDropdown;
	
	@FindBy(xpath = "//input[@name='property(Status)']")
	private WebElement StatusDropdown;
	
	@FindBy(xpath = "//input[@name='property(End Date)']")
	private WebElement EndDateField;
	
	@FindBy(xpath = "//input[@name='property(Budgeted Cost)']")
	private WebElement BudgetedCostTxtField;
	
	@FindBy(xpath = "//input[@name='property(Expected Response)']")
	private WebElement ExpectedResponseTxtField;
	
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionTxtField;
	
	@FindBy(xpath = "(//input[@value='Save'])[last()]")
	private WebElement savebtn;
	
	@FindBy(xpath = "(//input[@value='Save & New'])[last()]")
	private WebElement SaveAndNewbtn;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[last()]")
	private WebElement Cancelbtn;
	
	public CloneCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaignNameTxtField() {
		return CampaignNameTxtField;
	}

	public WebElement getStartDateField() {
		return StartDateField;
	}

	public WebElement getExpectedRevenueTxtField() {
		return ExpectedRevenueTxtField;
	}

	public WebElement getActualCostTxtField() {
		return ActualCostTxtField;
	}

	public WebElement getNumSentTxtField() {
		return NumSentTxtField;
	}

	public WebElement getTypeDropdown() {
		return TypeDropdown;
	}

	public WebElement getStatusDropdown() {
		return StatusDropdown;
	}

	public WebElement getEndDateField() {
		return EndDateField;
	}

	public WebElement getBudgetedCostTxtField() {
		return BudgetedCostTxtField;
	}

	public WebElement getExpectedResponseTxtField() {
		return ExpectedResponseTxtField;
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
