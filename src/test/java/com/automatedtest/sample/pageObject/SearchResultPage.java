package com.automatedtest.sample.pageObject;

import com.automatedtest.sample.basepage.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchResultPage extends BasePage {

	
	 	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]")
	    private WebElement selectSummerDressItem;
	    
	    @FindBy(xpath = "//a[@title='Add to cart']")
	    private WebElement addToCartSelectedItem;
	    

	    @FindBy(xpath = "//a[@title='Proceed to checkout']")
	    private WebElement proceedToCheckoutbtn;
	
	

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }
    
    
 public void addToItemIncart()
    
    {
    	Actions actions = new Actions(driver);
    	wait.forElementToBeDisplayed(5, this.selectSummerDressItem, "selectSummerDressItem");
    	actions.moveToElement(selectSummerDressItem).perform();
    	System.out.println("Done Mouse hover on 'Music' from Menu");
    	wait.forElementToBeDisplayed(5, this.addToCartSelectedItem, "addToCartSelectedItem");
    	this.addToCartSelectedItem.click();
  
    	
    }
    
 
    public void proceedToCheckout() {
    	wait.forElementToBeDisplayed(5, this.proceedToCheckoutbtn, "proceedToCheckoutbtn");
    	this.proceedToCheckoutbtn.click();
    	
    	
    }
    
//
//    boolean isInResults(String expectedTitle, int nbOfResultsToSearch) {
//        wait.forPresenceOfElements(5, By.cssSelector(RESULTS_TITLE_SELECTOR), "Result title");
//        return IntStream.range(0, Math.min(this.results.size(), nbOfResultsToSearch))
//                .anyMatch(index -> this.results.get(index).getText().contains(expectedTitle));
//    }
    
    
}

