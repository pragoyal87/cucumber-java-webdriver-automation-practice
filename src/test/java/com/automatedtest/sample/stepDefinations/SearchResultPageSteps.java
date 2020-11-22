package com.automatedtest.sample.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import com.automatedtest.sample.pageObject.SearchResultPage;

public class SearchResultPageSteps {

    private SearchResultPage searchResultPage;

    public SearchResultPageSteps() {
        this.searchResultPage = new SearchResultPage();
    }

//    @Then("^\"([^\"]*)\" is displayed in the first \"([^\"]*)\" results$")
//    public void isDisplayedInTheFirstResults(String expectedResult, int nbOfResultsToSearch) {
//        Assert.assertTrue(expectedResult + " wasn't found in the first " + nbOfResultsToSearch + " results.",
//                this.searchResultPage.isInResults(expectedResult, nbOfResultsToSearch));
//    }
    
    
    @When("^User add the item into the cart$")
	public void select_the_summer_dress_options() {
	
	this.searchResultPage.addToItemIncart();
	this.searchResultPage.proceedToCheckout();
	
}
}
