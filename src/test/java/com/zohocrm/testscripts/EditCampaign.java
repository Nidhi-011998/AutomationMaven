package com.zohocrm.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.EditCampaignPage;
@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class EditCampaign extends BaseClass {
	@Test
	public void testEditCampaign() throws InterruptedException {
		Reporter.log("Edit campaign",true); 
		EditCampaignPage editCampaignpg = new EditCampaignPage(driver);
		editCampaignpg.getActualCostTxtField().sendKeys("25000");
	}
}
