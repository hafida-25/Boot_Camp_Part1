package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void searchTest() {
		SearchPage searchpage = new SearchPage(driver);
		searchpage.typeOnSearchBox("Nokia Lumia 1020");
		searchpage.clickOnsearchButton();
		
		//verify
		String productTitle =searchpage.getProductTitle();
		Assert.assertEquals(productTitle, "Nokia Lumia 1020");
		
		//click on a specific product to navigate to its details page
		searchpage.clickOnProduct();
		
		
	}

}
