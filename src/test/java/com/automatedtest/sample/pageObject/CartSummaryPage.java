package com.automatedtest.sample.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.sample.basepage.BasePage;

public class CartSummaryPage extends BasePage {
	
	  
    @FindBy(xpath = "//*[@id='center_column']//a[@title='Proceed to checkout']")
    private WebElement cartSummaryCheckoutbtn;
    
    
    public CartSummaryPage() {
        PageFactory.initElements(driver, this);
    }
    
    
    public void cartSummaryCheckout() {
    	wait.forElementToBeDisplayed(5, this.cartSummaryCheckoutbtn, "cartSummaryCheckoutbtn");
    	this.cartSummaryCheckoutbtn.click();
    	
    	
    }


}
