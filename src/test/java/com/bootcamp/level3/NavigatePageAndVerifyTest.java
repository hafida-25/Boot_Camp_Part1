package com.bootcamp.level3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigatePageAndVerifyTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void  LaunchUrl() {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority=1)
	public void NavigateToDifferentPage() throws InterruptedException {
		//navigate to holiday deals page
		driver.findElement(By.xpath("//a[text()='Holiday Deals' and contains(@class,'nav-a')]")).click();
	    Thread.sleep(25);
		
		//navigate to best sellers page
		driver.findElement(By.xpath("//a[text()='Best Sellers' and contains(@class,'nav-a  ')]")).click();
		Thread.sleep(25);
		
		// navigate to  amazon basics page
		driver.findElement(By.xpath("//a[text()='Amazon Basics' and contains(@class,'nav-a  ')]")).click();
		Thread.sleep(25);
		
		// navigate to customer service page
		//driver.findElement(By.xpath("//a[text()='Customer Service' and contains(@class,'nav-a  ')]")).click();
		//Thread.sleep(25);
	}
	
	@Test(priority=2)
	public void VerifyElement() throws Exception {
		//navigate to holiday deals
		driver.findElement(By.xpath("//a[text()='Holiday Deals' and contains(@class,'nav-a')]")).click();
	   // verify presence of your list in new page 
		WebElement YourLists =driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		Assert.assertTrue(YourLists.isDisplayed(), "element is not displyed in new page");
		Thread.sleep(30);
	
		// verify presence of baby registry in new page 
		WebElement BabyRegistry=driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3]"));
		Assert.assertTrue(BabyRegistry.isDisplayed(), "element is not displyed in new page");
		
		// verify presence of wedding register  in new page 
	    WebElement WeddingRegistry =driver.findElement(By.xpath("(//span[@class='nav-a-content'])[4]"));
	    Assert.assertTrue(WeddingRegistry.isDisplayed(), "element is not displyed in new page");
	
	 // verify presence of amazon gift cards in new page 
	    WebElement AmazonGiftCard =driver.findElement(By.xpath("(//span[@class='nav-a-content'])[5]"));
		Assert.assertTrue(AmazonGiftCard.isDisplayed(), "element is not displyed in new page");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
