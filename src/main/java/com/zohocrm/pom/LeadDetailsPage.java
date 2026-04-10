package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {
	@FindBy(xpath = "(//input[@value='Edit'])[last()]")
	private WebElement Editbtn;
	
	@FindBy(xpath = "(//input[@value='Delete'])[last()]")
	private WebElement deleteBtn;

	@FindBy(xpath = "(//input[@value='Clone'])[last()]")
	private WebElement cloneBtn;

	@FindBy(xpath = "(//input[@value='Print Preview '])[last()]")
	private WebElement printBtn;
	
	public LeadDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
