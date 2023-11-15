package com.bootcamp.level2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
		
		@Test
		public void checkoutTest() throws Exception {
			CheckoutPage checkoutpage= new CheckoutPage(driver);
			
			//type on search box the name of product 
			checkoutpage.typeOnSearchBox("Java All-In-One for Dummies by Lowe, Doug");
			Thread.sleep(30);
			
			//click on search button
			checkoutpage.clickOnSearchButton();
			
			//click on the product 
			checkoutpage.clickOnJavaBooks();
			
			// code to switch to another window 
			Set<String> handles = driver.getWindowHandles();
			Iterator iterator = handles.iterator();
			String parentid=(String) iterator.next();
			String childid=(String) iterator.next();
			driver.switchTo().window(childid);
			
			//add product to the cart
			checkoutpage.clickOnAddCartButton();
			checkoutpage.clickOnCheckoutButton();
			
		
			
			
			

}
		
			
			
			
		}
	//	@AfterMethod
		//public void teardown() {
		//	driver.quit();
		//}
