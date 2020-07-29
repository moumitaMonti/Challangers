package com.ebay.stepdef;

import com.ebay.common.ebayBase;
import com.ebay.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ebayuserregister extends ebayBase{
	Homepage hp;
	
	@Given("^I am on ebay website$")
	public void i_am_on_ebay_website() {
		hp=new Homepage(driver);
		hp.clicksignin();
	}

	@When("^i click on register option$")
	public void i_click_on_register_option() {
	}

	@When("^i enter my \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_my_and(String arg1, String arg2, String arg3, String arg4){
	}

	@When("^i clicked on create account$")
	public void i_clicked_on_create_account(){
	}

	@Then("^i see the welcome message$")
	public void i_see_the_welcome_message() {
	}


	
}
