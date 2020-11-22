package com.automatedtest.sample.stepDefinations;

import com.automatedtest.sample.pageObject.LoginPage;

import io.cucumber.java.en.When;

public class LoginPageSteps {

	
	private LoginPage loginPage;
	
	public LoginPageSteps() {
		this.loginPage = new LoginPage();
	}
	
	
	@When("^User should be naviage to login page$")
	public void select_the_summer_dress_options() {

	this.loginPage.userIdTextDisplay();
}
}
