package com.ebay.stepdef;

import com.ebay.common.ebayBase;
import com.ebay.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ebayuserlogin extends ebayBase {
	Homepage hp;
	
	@Given("^I am on ebay homepage$")
	public void i_am_on_ebay_homepage() {
		LaunchBrowser();
	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() {
		hp=new Homepage(driver);
		hp.clicksignin();
	}

	@When("^I entered my username and password$")
	public void i_entered_my_username_and_password(){
	}

	@When("^I click on continue button$")
	public void i_click_on_continue_button(){
	}

	@Then("^I login to the ebay page$")
	public void i_login_to_the_ebay_page(){
	}


}
