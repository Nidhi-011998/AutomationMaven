package com.zohocrm.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CreateLeadPage;
import com.zohocrm.pom.DisplayCustomViewPage;
import com.zohocrm.pom.HomePage;
@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class CreateLead extends BaseClass {
	@Test
	public void testCreateLead() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.setLeadTab();
		DisplayCustomViewPage customPage = new DisplayCustomViewPage(driver);
		customPage.getNewLeadBtn().click();
		CreateLeadPage leadpg = new CreateLeadPage(driver);
		leadpg.getFirstNameTxtField().sendKeys("Vihan");
		leadpg.getLastNameTxtField().sendKeys("Sharma");
		leadpg.getCompanyTxtField().sendKeys("Tech Solutions Pvt Ltd");
		leadpg.getDesignationTxtField().sendKeys("QA Engineer");
		leadpg.getEmailTxtField().sendKeys("vihan.sharma@gmail.com");
		leadpg.getPhoneTxtField().sendKeys("08012345678");
		leadpg.getFaxTxtField().sendKeys("08099887766");
		leadpg.getMobileTxtField().sendKeys("9876543210");
		leadpg.getWebsiteTxtField().sendKeys("www.techsolutions.com");
		leadpg.getNoOfEmployeesTxtField().sendKeys("150");
		leadpg.getAnnualRevenueTxtField().sendKeys("5000000");
		leadpg.getStreetTxtField().sendKeys("123 MG Road");
		leadpg.getCityTxtField().sendKeys("Bangalore");
		leadpg.getStateTxtField().sendKeys("Karnataka");
		leadpg.getZipCodeTxtField().sendKeys("560001");
		leadpg.getCountryTxtField().sendKeys("India");
		leadpg.getDescriptionTxtField().sendKeys("Interested in our product offerings");
		Thread.sleep(5000);
		Reporter.log("Created Lead Successfully",true);  
	}
}
