package com.bootcamp.level2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
public WebDriver driver;



	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='gh-hide-if-nocss'])[1]")
	private WebElement  titileInPage;
	
	public String getPageTitle() {
		return titileInPage.getText();
		 
	}
	
	@FindBy(xpath="(//a[@class='gh-p'])[1]")
	private WebElement   DailyDeals;
	
	public String  DailyDealsTitle() {
		return  DailyDeals.getText();
		 
	}
	
	
	@FindBy(xpath="(//a[@class='gh-p'])[2]")
	private WebElement    BrandOutlet;
	
	public String   BrandOutletTitle() {
		return   BrandOutlet.getText();
		 
	}
	
	
	
	
	@FindBy(linkText="Motors")
	private WebElement motors;
	
	public void clickOnMotorsPage() {
		motors.click();
	}
	
	@FindBy(id="gh-cat")
	private WebElement categoryDropdown;
	
    public void clickOnArt() {
	
    Select select = new Select(categoryDropdown);
    select.selectByVisibleText("Art");
}

      @FindBy(id="gh-btn")
      private WebElement searchButton;

        public void clickOnSearchButton() {
        searchButton.click();
       }
        
      @FindBy(xpath="(//a[@class='gh-p'])[3]")
      private WebElement  HelpAndContactPage;
      public void clickOnHelpAndContactPage() {
    	  HelpAndContactPage.click();
      }

}
