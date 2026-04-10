package com.zohocrm.generic;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		 ChromeOptions options = new ChromeOptions();

	    // Disable notifications & popups
	    options.addArguments("--disable-notifications");
	    options.addArguments("--disable-infobars");
	    options.addArguments("--disable-extensions");

	    // Open fresh session (avoids saved password issues)
	    options.addArguments("--incognito");

	    // Optional: disable password save UI
	    options.addArguments("--disable-save-password-bubble");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("OpenBrowser", true);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("closeBrowser", true);
	}
	@BeforeMethod
	public void login() throws IOException {
//		driver.get("http://192.168.23.128:8080/");
//		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
//		driver.findElement(By.id("passWord")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
//		FileLib f = new FileLib();
//		String url = f.getPropertyData("url");
//		String un = f.getPropertyData("LoginName");
//		String pw = f.getPropertyData("Password");
//		driver.get(url);
		driver.get("http://192.168.23.128:8080/");	
		LoginPage l = new LoginPage(driver);
	    l.setLogin("rashmi@dell.com", "123456");
		Reporter.log("login", true);
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException {	
		HomePage hpage =new HomePage(driver);
		hpage.setLogut();
		//driver.findElement(By.xpath("(//a[contains(text(),'Logout')])")).click();
		Reporter.log("LogOut", true);
		Thread.sleep(2000);
	}
}
