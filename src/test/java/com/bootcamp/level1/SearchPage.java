package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
public WebDriver driver;



	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchBox;
	
	public void typeOnSearchBox(String productname) {
		searchBox.sendKeys(productname);
	}
	
   @FindBy(xpath="//button[text()='Search' and contains(@class,'button-1 search-box-button')]")
   private WebElement searchButton;
   
   public void clickOnsearchButton() {
	   searchButton.click();
   }
   
   @FindBy(className="product-title")
   private WebElement productTitle;
   
   public String getProductTitle() {
	   return productTitle.getText();
   }
   
   @FindBy(xpath="//h2[@class='product-title']")
   private WebElement product;
   
   public void clickOnProduct() {
	   product.click();
   }
   

}
