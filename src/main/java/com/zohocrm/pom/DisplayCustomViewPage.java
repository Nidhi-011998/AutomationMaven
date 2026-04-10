package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayCustomViewPage  {
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampaignBtn;
	
	@FindBy(xpath = "//input[@value='New Lead']")
	private WebElement newLeadBtn;
	
	@FindBy(xpath = "//input[@value='New Account']")
	private WebElement newAccountBtn;
	
	@FindBy(xpath = "//input[@value='New Contact']")
	private WebElement newContactBtn;
	
	@FindBy(xpath = "//input[@value='New Potential']")
	private WebElement newPotentialBtn;
	
	
	public DisplayCustomViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}

	public WebElement getNewLeadBtn() {
		return newLeadBtn;
	}

	public WebElement getNewAccountBtn() {
		return newAccountBtn;
	}

	public WebElement getNewContactBtn() {
		return newContactBtn;
	}

	public WebElement getNewPotentialBtn() {
		return newPotentialBtn;
	}
	
	public void setnewCampaignbtn() {
		newCampaignBtn.click();
	}
	
	
	public void setNewLeadBtn() {
	    newLeadBtn.click();
	}

	public void setNewAccountBtn() {
	    newAccountBtn.click();
	}

	public void setNewContactBtn() {
	    newContactBtn.click();
	}

	public void setNewPotentialBtn() {
	    newPotentialBtn.click();
	}
	
	
	
}
