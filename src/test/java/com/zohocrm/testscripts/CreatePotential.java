package com.zohocrm.testscripts;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CreatePotentialPage;
import com.zohocrm.pom.DisplayCustomViewPage;
import com.zohocrm.pom.HomePage;

@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class CreatePotential extends BaseClass {
	@Test
	public void testCreatePotential() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.setPotentials();
		DisplayCustomViewPage customPage = new DisplayCustomViewPage(driver);
		customPage.getNewPotentialBtn().click();
		CreatePotentialPage potentialpg = new CreatePotentialPage(driver);
		potentialpg.getAccountNameTxtField().sendKeys("Arayan");
		potentialpg.getPotentialNameTxtField().sendKeys("New Business Deal");
		potentialpg.getAmountTxtField().sendKeys("100000");
		potentialpg.getClosingDateTxtField().sendKeys("02/28/2026");
		potentialpg.getProbabilityTxtField().sendKeys("70");
		potentialpg.getNextStepTxtField().sendKeys("Follow up with client");
		potentialpg.getDescriptionTxtField().sendKeys("High value deal expected to close soon");
		Thread.sleep(5000);
		Reporter.log("Created Potential Successfully",true);  
	}
}
