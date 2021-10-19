package com.stepDefinition;

import com.base.Base;
import com.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSD extends Base {
	SignUpPage SUPage = new SignUpPage();

	@Given("User is on home page")
	public void user_is_on_home_page() {
		initialization();
	}

	@When("User clicks on sign up")
	public void user_clicks_on_sign_up() {
		try {
			SUPage.clicksignup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User enters full name")
	public void user_enters_full_name() {
		SUPage.enterName(prop.getProperty("Name"));
	}

	@When("User enters Email")
	public void user_enters_email() {
		SUPage.enterEmail(prop.getProperty("Email"));
	}

	@When("User enters Phone number")
	public void user_enters_phone_number() {
		SUPage.enterPhoneNo(prop.getProperty("Phone"));
	}

	@When("Uer enter address")
	public void uer_enter_address() {
		SUPage.Address(prop.getProperty("Address"));
	}

	@When("User selects age group")
	public void user_selects_age_group() {
		try {
			SUPage.AgeGroup(prop.getProperty("Age"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User selects gender")
	public void user_selects_gender() {
		try {
			SUPage.SelectGender(prop.getProperty("Gender"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User selects hobbies")
	public void user_selects_hobbies() {
		try {
			SUPage.Hobbies(prop.getProperty("Hobbies"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User selects Interests")
	public void user_selects_interests() {
		try {
			SUPage.Interests(prop.getProperty("Interest"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User enters password")
	public void user_enters_password() {
		SUPage.EnterPassword(prop.getProperty("Password"));
	}

	@When("User re-enters password")
	public void user_re_enters_password() {
		SUPage.ReEnterPassword(prop.getProperty("Password"));
	}

	@Then("User clicks on register and successfully signs up")
	public void user_clicks_on_register_and_successfully_signs_up() {
		try {
			SUPage.clickRegister();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
