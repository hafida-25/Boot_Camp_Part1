package com.bootcamp.level1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
public WebDriver driver;



	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailField;
	
	public void enterEmailField( String email) {
		emailField.sendKeys(email);
		
	}
	
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordField;
	
	public void enterPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	private WebElement loginButton;
	
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	@FindBy(className="topic-block-title")
	private WebElement welcomeMessage;
	
	
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
		
		
	}
}
