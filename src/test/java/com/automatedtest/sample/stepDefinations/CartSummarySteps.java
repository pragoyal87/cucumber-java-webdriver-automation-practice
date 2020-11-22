package com.automatedtest.sample.stepDefinations;

import com.automatedtest.sample.pageObject.CartSummaryPage;

import io.cucumber.java.en.When;

public class CartSummarySteps {

	private CartSummaryPage cartSummaryPage;
	
	public CartSummarySteps() {
		this.cartSummaryPage = new CartSummaryPage();
	
	}
	
	@When("^User select checkout from cart summary page$")
	public void select_the_summer_dress_options() {
	
	  this.cartSummaryPage.cartSummaryCheckout();
	}
}
