package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login");
	}
	@Test
	public void loginTestWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		//enter email
		loginpage.enterEmailField("ganihaddad@gmail.com");
		//enter password
		loginpage.enterPasswordField("Ilyan1107%");
		//click On Login Button
		loginpage.clickOnLoginButton();
		
		//verify successful login with valid credentials.

		
		String expectedUrl ="https://demo.nopcommerce.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl,"Login failed");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
