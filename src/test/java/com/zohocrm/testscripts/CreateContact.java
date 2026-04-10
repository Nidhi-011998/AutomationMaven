package com.zohocrm.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CreateContactPage;
import com.zohocrm.pom.DisplayCustomViewPage;
import com.zohocrm.pom.HomePage;
@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class CreateContact extends BaseClass {
	@Test
	public void testCreateContact() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.setContactTab();
		DisplayCustomViewPage customPage = new DisplayCustomViewPage(driver);
		customPage.getNewContactBtn().click();
		CreateContactPage contactpg = new CreateContactPage(driver);
		contactpg.getFirstNameTxtField().sendKeys("Uma");
		contactpg.getLastNameTxtField().sendKeys("Sharma");
		contactpg.getAccountNameTxtField().sendKeys("ABC Pvt Ltd");
		contactpg.getVendorNameTxtField().sendKeys("XYZ Vendors");
		contactpg.getEmailTxtField().sendKeys("uma.sharma@gmail.com");
		contactpg.getTitleTxtField().sendKeys("Software Engineer");
		contactpg.getDepartmentTxtField().sendKeys("QA");
		contactpg.getPhoneTxtField().sendKeys("08012345678");
		contactpg.getHomePhoneTxtField().sendKeys("08087654321");
		contactpg.getOtherPhoneTxtField().sendKeys("08011223344");
		contactpg.getFaxTxtField().sendKeys("08099887766");
		contactpg.getMobileTxtField().sendKeys("9876543210");
		contactpg.getDateOfBirthField().sendKeys("01/15/1995");
		contactpg.getAssistantTxtField().sendKeys("Ravi");
		contactpg.getAssistantPhoneTxtField().sendKeys("9123456780");
		contactpg.getReportsToTxtField().sendKeys("Manager Name");
		contactpg.getMailingStreetTxtArea().sendKeys("123 MG Road");
		contactpg.getOtherStreetTxtArea().sendKeys("456 Brigade Road");
		contactpg.getMailingCityTxtField().sendKeys("Bangalore");
		contactpg.getOtherCityTxtField().sendKeys("Mysore");
		contactpg.getMailingStateTxtField().sendKeys("Karnataka");
		contactpg.getOtherStateTxtField().sendKeys("Karnataka");
		contactpg.getMailingZipTxtField().sendKeys("560001");
		contactpg.getOtherZipTxtField().sendKeys("570001");
		contactpg.getMailingCountryTxtField().sendKeys("India");
		contactpg.getOtherCountryTxtField().sendKeys("India");
		contactpg.getDescriptionTxtField().sendKeys("Contact Details");
		Thread.sleep(5000);
		Reporter.log("create Contact Successfull",true);  
	}
}
