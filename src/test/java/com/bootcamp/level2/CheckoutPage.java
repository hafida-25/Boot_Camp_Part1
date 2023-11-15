package com.bootcamp.level2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
public WebDriver driver;



	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=("//input[@id='gh-ac']"))
	private WebElement SearchBox;
	
	public void typeOnSearchBox(String javabooks) {
		SearchBox.sendKeys(javabooks);
	}
	
	@FindBy(id=("gh-btn"))
	private WebElement SearchButton;
	
        public void clickOnSearchButton() {
		SearchButton.click();
	}
        
        
        @FindBy(xpath=("(//span[@role='heading'])[2]"))
    	private WebElement javabook;
    	
            public void clickOnJavaBooks() {
    		javabook.click();
    	}
            
            @FindBy(xpath=("//div[@class='vim x-atc-action overlay-placeholder']"))
            private WebElement addCartButton;
            
            public void clickOnAddCartButton() {
            	addCartButton.click();;
            }
            
          
            
            
            
            @FindBy(xpath="//span[text()='Checkout 1 item']")
            private WebElement checkoutButton;
            
            public void clickOnCheckoutButton() {
            	checkoutButton.click();
            }
            
           
}
