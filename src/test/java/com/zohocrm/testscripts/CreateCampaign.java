package com.zohocrm.testscripts;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CreateCampaignPage;
import com.zohocrm.pom.DisplayCustomViewPage;
import com.zohocrm.pom.HomePage;






@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class CreateCampaign extends BaseClass {
	@Test
	public void testCreateCampaign() throws InterruptedException {
		Reporter.log("create campaign",true);  
		HomePage hpage = new HomePage(driver);
		hpage.setcampaignTab();
		DisplayCustomViewPage customPage = new DisplayCustomViewPage(driver);
		customPage.getNewCampaignBtn().click();
		Thread.sleep(2000);
		CreateCampaignPage campaignpg= new CreateCampaignPage(driver);
		campaignpg.getCampaignNameTxtField().sendKeys("Nokia Mobile Reno Series 1 Roadshow");
		campaignpg.getStartDateField().sendKeys("04/30/2026");
		campaignpg.getEndDateField().sendKeys("06/06/2026");
		campaignpg.getExpectedRevenueTxtField().sendKeys("50000");
		campaignpg.getBudgetedCostTxtField().sendKeys("70000");
		campaignpg.getActualCostTxtField().sendKeys("80000");
		campaignpg.getExpectedResponseTxtField().sendKeys("1000");
		campaignpg.getNumSentTxtField().sendKeys("350");
		campaignpg.getDescriptionTxtField().sendKeys("To sell more products to the customer");
		campaignpg.getSavebtn().click();
		//Thread.sleep(5000);
		
		
	}
}
