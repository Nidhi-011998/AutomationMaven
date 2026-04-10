package com.zohocrm.testscripts;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CreateAccoutPage;
import com.zohocrm.pom.DisplayCustomViewPage;
import com.zohocrm.pom.HomePage;
@Listeners(com.zohocrm.generic.ListnersImplementation.class)
public class CreateAccount extends BaseClass {
		@Test
		public void testCreateAccount() throws InterruptedException {
			HomePage hpage = new HomePage(driver);
			hpage.setAccountTab();
			DisplayCustomViewPage customPage = new DisplayCustomViewPage(driver);
			customPage.getNewAccountBtn().click();
			CreateAccoutPage accountpg = new CreateAccoutPage(driver);
			accountpg.getAccountNameTxtField().sendKeys("Sarvesh");
			accountpg.getPhoneTxtField().sendKeys("08012345678");
			accountpg.getAccountSiteTxtField().sendKeys("www.sarveshcorp.com");
			accountpg.getFaxTxtField().sendKeys("08099887766");
			accountpg.getParentAccountTxtField().sendKeys("Global Corp");
			accountpg.getWebsiteTxtField().sendKeys("www.sarvesh.com");
			accountpg.getAccountNumberTxtField().sendKeys("ACC12345");
			accountpg.getTickerSymbolTxtField().sendKeys("SARV");
			accountpg.getEmployeesTxtField().sendKeys("200");
			accountpg.getAnnualRevenueTxtField().sendKeys("10000000");
			accountpg.getSICCodeTxtField().sendKeys("1234");
			accountpg.getBillingStreetTxtField().sendKeys("123 MG Road");
			accountpg.getBillingCityTxtField().sendKeys("Bangalore");
			accountpg.getBillingStateTxtField().sendKeys("Karnataka");
			accountpg.getBillingCodeTxtField().sendKeys("560001");
			accountpg.getBillingCountryTxtField().sendKeys("India");
			accountpg.getShippingStreetTxtField().sendKeys("456 Brigade Road");
			accountpg.getShippingCityTxtField().sendKeys("Bangalore");
			accountpg.getShippingStateTxtField().sendKeys("Karnataka");
			accountpg.getShippingCodeTxtField().sendKeys("560002");
			accountpg.getShippingCountryTxtField().sendKeys("India");
			accountpg.getDescriptionTxtField().sendKeys("Account created for business operations");
			Thread.sleep(5000);
			Reporter.log("Created Account Successfully",true);  
		}
	}

