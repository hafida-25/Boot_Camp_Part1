package com.bootcamp.level3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class VerifyTitle {
	public WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void verifyWebSiteTitle() {
		String actualTitle =driver.getTitle();//get the actual title of the page 
		String expectedTitle = "Amazon.com. Spend less. Smile more.";// expected title of the page
		Assert.assertEquals(actualTitle, expectedTitle," Page titile does not  match the expeted title");
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
}
