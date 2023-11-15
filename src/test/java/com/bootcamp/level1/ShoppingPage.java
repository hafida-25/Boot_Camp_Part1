package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
public WebDriver driver;



	
	public ShoppingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//a[text()='Books '])[1]")
	private WebElement booksButton;
	
	public void clickOnBooksButton() {
		booksButton.click();
	}
	
	@FindBy(xpath="(//button[@class='button-2 product-box-add-to-cart-button'])[1]")
	private WebElement addToCartButton;
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
		
	}
	
	@FindBy(xpath="//span[text()='Shopping cart' and contains(@class,'cart-label')]")
	private WebElement shoppingCartButton;
	
	public void clickOnShoppingCartButton() {
		shoppingCartButton.click();
	}
	
	@FindBy(xpath="//a[text()='Fahrenheit 451 by Ray Bradbury' and contains(@class,'product-name')]")
	private WebElement productName;
	
	public String verifyProductNameInCart() {
		return productName.getText();
	}
	
}
