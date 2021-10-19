package com.stepDefinition;

import com.base.Base;
import com.pages.BookFlight;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookFlightTicketSD extends Base{
	BookFlight BFPage = new BookFlight();
	@Given("User is on homepage of ST")
	public void user_is_on_homepage_of_st() {
	    initialization();
	}

	@When("User selects flight")
	public void user_selects_flight() {
	   try {
		BFPage.selectFlight();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("User enters ContactInfo")
	public void user_enters_contact_info() {
	    try {
			BFPage.enterContactInfo(prop.getProperty("Phone"), prop.getProperty("Email"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User click on Finish payment and successfully book a ticket")
	public void user_click_on_finish_payment_and_successfully_book_a_ticket() {
	    try {
			BFPage.clickFinishPayment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
