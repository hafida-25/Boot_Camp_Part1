package com.bootcamp.level2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HomePageTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
   @Test(priority=1)
	public void homePageTest() {
		
		HomePage homepage = new HomePage(driver);
		
		//verify the presence of certain element(Shop by category)
	String titileInPage =homepage.getPageTitle();
	Assert.assertEquals(titileInPage, "Shop by category","Incorrect page title");
	
	//verify the presence of Daily Deals Title
	
	String DailyDeals =homepage.DailyDealsTitle();
	Assert.assertEquals(DailyDeals, "Daily Deals","Incorrect page title");
	
	//verify the presence of Brand Outlet Title
	
	 String BrandOutlet =homepage.BrandOutletTitle();
		Assert.assertEquals(BrandOutlet, "Brand Outlet","Incorrect page title");
		
	}
	
	@Test(priority=2)
	public void navigatePageTest() throws Exception {
		HomePage homepage = new HomePage(driver);
		
		//navigate to motors page
			homepage.clickOnMotorsPage();
				
	   // navigate to arts page
			homepage.clickOnArt();
				Thread.sleep(30);
			homepage.clickOnSearchButton();
				
		//navigate to help and contact page 
				Thread.sleep(30);
				homepage.clickOnHelpAndContactPage();
				
	
		
	}
	
	
	

}
