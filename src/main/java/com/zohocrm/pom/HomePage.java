package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadTab;

	@FindBy(xpath="//a[text()='Accounts']")
	private WebElement accountTab;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactTab;
	
	@FindBy(xpath="//a[text()='Potentials']")
	private WebElement potentialTab;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignTab;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogut() {
		lgOut.click();
	}
	public void setHomeTab() {
		homeTab.click();
	}
	
	public void setLeadTab() {
		leadTab.click();
	}
	
	public void setAccountTab() {
		accountTab.click();
	}
		
	public void setContactTab() {
		contactTab.click();
	}
	
	public void setPotentials() {
		potentialTab.click();
	}
	
	public void setcampaignTab() {
		campaignTab.click();
	}
		
}
