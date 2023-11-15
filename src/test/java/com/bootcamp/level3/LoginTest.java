package com.bootcamp.level3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void Logintest() {
		//click on sign in button 
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//enter valid email
		driver.findElement(By.id("ap_email")).sendKeys("elhadjenhafi@gmail.com");
		//click on continue  button
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		//enter valid password
		driver.findElement(By.id("ap_password")).sendKeys("Ilyan1107");
		//click on sign in button
		driver.findElement(By.id("signInSubmit")).click();
		
		//verify the presence of welcome message <==> verify successful login with valid credentials
	
		WebElement welcomemessage=  driver.findElement(By.xpath("//span[text()='Hello, Hafedha' and  contains(@class,'nav-line-1 nav-progressive-content')]"));
	    Assert.assertTrue(welcomemessage.isDisplayed(),"Login was not Successful");
	

}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}

