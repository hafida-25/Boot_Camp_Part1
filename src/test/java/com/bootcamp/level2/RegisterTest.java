package com.bootcamp.level2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
public WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
}
	
	@Test
	public void registrationTest() {
		RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.clickOnRegisterButton();
		registerpage.enterFirstname("Hafida");
		registerpage.enterLastname("elhadjen");
		registerpage.enterEmail("ganihaddad@gmail.com");
		registerpage.enterPassword("hafI123fr#");
		registerpage.clickOnCreatePersonalAccountButton();
		
		//verify successful registration with valid credentials
		
		// WebElement hihafida =driver.findElement(By.xpath("//li[@class='gh-t']"));
		//	Assert.assertTrue(hihafida.isDisplayed(), "element is not displyed in new page");
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
