package com.stepDefinition;

import com.base.Base;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD extends Base {
	LoginPage LPage = new LoginPage();

	@Given("User is on Home page of SimplyTravel")
	public void user_is_on_home_page_of_simply_travel() {
		initialization();
	}

	@When("User click on profile icon")
	public void user_click_on_profile_icon() {
		LPage.clickProfileIcon();
	}

	@When("User click on login")
	public void user_click_on_login() {
		LPage.SelectLogin();
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		try {
			LPage.enterUser(prop.getProperty("User"), prop.getProperty("Pass"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User clicks on Login button and successfully logs in")
	public void user_clicks_on_login_button_and_successfully_logs_in() {
		try {
			LPage.clickLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
