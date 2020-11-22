package com.automatedtest.sample.pageObject;

import com.automatedtest.sample.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement categoryWomen;
    
    @FindBy(xpath = "//a[@title='Summer Dresses']")
    private WebElement summerDresses;
    
   
    
    
    @FindBy(xpath = "//*[@id='center_column']//a[@title='Proceed to checkout']")
    private WebElement cartSummaryCheckoutbtn;
    
    @FindBy(xpath = "//input[@id='email1']")
    private WebElement userIdText ;
    
   

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    
    public void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }
    
    public void selectsummerDresses() 
    {
    	Actions actions = new Actions(driver);
    	actions.moveToElement(categoryWomen).perform();
    	System.out.println("Done Mouse hover on 'Music' from Menu");
    	wait.forElementToBeDisplayed(5, this.summerDresses, "summerDresses");
    	this.summerDresses.click();

    	
    }
    
    public String getTitle() {
        return driver.getTitle();
    }

   

   
}
