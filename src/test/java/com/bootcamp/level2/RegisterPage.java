package com.bootcamp.level2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;



	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath="/html/body/div[5]/div/header/div[1]/ul[1]/li[1]/span/span/a")
	@FindBy(xpath="//span[@id=\"gh-ug-flex\"]/a")
	private WebElement RegisterButton;
	
	public void clickOnRegisterButton(){
		RegisterButton.click();
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstnameField;
	
	public void enterFirstname(String FirstName) {
		firstnameField.sendKeys(FirstName);
		
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastnameField;
	
	public void enterLastname(String LastName) {
		lastnameField.sendKeys(LastName);
		
	}
	
	
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailField;
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
		
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordField;
	
	public void enterPassword(String Password) {
		passwordField.sendKeys(Password);
		
	}
	
	@FindBy(xpath="//button[@id='EMAIL_REG_FORM_SUBMIT']")
	private WebElement CreatePersonalAccountButton;
	
	public void clickOnCreatePersonalAccountButton() {
		CreatePersonalAccountButton.click();
	}
	
	
}
