package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ShoppingTest {
	
	public WebDriver driver;

	//set up browser
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	
	@Test
	public void shoppingtest() throws Exception {
		ShoppingPage shoppingpage = new ShoppingPage(driver);
		//Add product to the 
		shoppingpage.clickOnBooksButton();
		//add product to the cart
		shoppingpage.clickOnAddToCartButton();
		Thread.sleep(30);
		//navigate to the cart page
		shoppingpage.clickOnShoppingCartButton();
		Thread.sleep(30);
		//verify that the product is added to the cart
		String productNameInTheCart = shoppingpage.verifyProductNameInCart();
		Assert.assertEquals(productNameInTheCart, "Fahrenheit 451 by Ray Bradbury","product not added to the cart");
		Thread.sleep(60);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	


}
