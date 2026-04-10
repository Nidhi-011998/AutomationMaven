package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement lgTbx; //declaration

	@FindBy(id="passWord")
	private WebElement pwTbx;

	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement logingBtn;

	public LoginPage(WebDriver driver) {
		PageFactory. initElements(driver, this); //initialization
	}

	//business logic method
	public void setLogin(String un, String pw) {
		lgTbx.sendKeys(un);
		pwTbx.sendKeys(pw);          //utilization
		logingBtn.click();
	}
}
