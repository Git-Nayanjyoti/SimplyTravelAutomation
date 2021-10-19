package com.stepDefinition;

import com.base.Base;
import com.pages.SearchFlights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlightSD extends Base{
	SearchFlights SFPage = new SearchFlights();

	@Given("User is on home page of Simply Travel")
	public void user_is_on_home_page_of_simply_travel() {
	   initialization();
	}


	@When("User enters departure location")
	public void user_enters_departure_location() {
	   try {
		SFPage.selectDepartureCity(prop.getProperty("Departure"));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("User enter arival location")
	public void user_enter_arival_location() {
	    try {
			SFPage.selectArivialCity(prop.getProperty("Arivial"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User selects date")
	public void user_selects_date() {
	   try {
		SFPage.DepartDate(prop.getProperty("Day"));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("User selects no. of passengers and class")
	public void user_selects_no_of_passengers_and_class() {
	   try {
		SFPage.PassengerNo(prop.getProperty("Adults"), prop.getProperty("Childs"), prop.getProperty("Infants"), prop.getProperty("Class"));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("User clicks on search button and successfully searches the flight")
	public void user_clicks_on_search_button_and_successfully_searches_the_flight() {
	    try {
			SFPage.clickSearch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
