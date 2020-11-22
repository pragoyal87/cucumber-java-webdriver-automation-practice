package com.automatedtest.sample.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class LoginPage extends BasePage {
	
	
	 
	@FindBy(xpath = "//input[@id='email']")
	    private WebElement userIdText ;
	
	  public LoginPage() {
	        PageFactory.initElements(driver, this);
	    }
	
	 public void  userIdTextDisplay() {
	    	wait.forElementToBeDisplayed(5, this.userIdText, "userIdText");
	    	
	    }
	    

}
