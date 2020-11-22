package com.automatedtest.sample.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import com.automatedtest.sample.pageObject.HomePage;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to automationpractice site")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @And("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle = this.homePage.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                title.equals(displayedTitle));
    }
    @When("^User select the summer dress options$")
    	public void select_the_summer_dress_options() {
    	this.homePage.selectsummerDresses();
    
//    	this.homePage.cartSummaryCheckout();
//    	this.homePage.userIdTextDisplay();
    }
    
    

//    @When("^a user searches for \"([^\"]*)\"$")
//    public void aUserSearchesFor(String searchValue) {
//        this.homePage.searchFor(searchValue);
//    }
}
