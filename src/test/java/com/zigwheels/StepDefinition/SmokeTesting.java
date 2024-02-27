package com.zigwheels.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.zigwheels.Factory.BaseClass;
import com.zigwheels.PageObjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTesting {
	HomePage home;
	WebDriver driver;

	@Given("user navigate to the Zigwheels homepage")
	public void user_navigate_to_the_zigwheels_homepage() {
		home = new HomePage(BaseClass.getDriver());
	}

	@Then("user should see a well-rendered homepage without any errors")
	public void user_should_see_a_well_rendered_homepage_without_any_errors() {
		home.zigwheelspage();
	}

	@Given("is on the Zigwheels login page")
	public void is_on_the_zigwheels_login_page() {
		home = new HomePage(BaseClass.getDriver());
	}

	@Then("checks whether login\\/signup is present in the zigwheels tab")
	public void checks_whether_login_signup_is_present_in_the_zigwheels_tab() {
		home.signinbuttonverification();
	}

	@Given("user is on the Zigwheels homepage")
	public void user_is_on_the_zigwheels_homepage() {
		home = new HomePage(BaseClass.getDriver());
	}

	@When("user click the login\\/signup button in homepage")
	public void user_click_the_login_signup_button_in_homepage() {
		home.clickingonsignin();
	}

	@Then("user should be directed to the login\\/register tab")
	public void user_should_be_directed_to_the_login_register_tab() {
		home.verifyingsiginpage();
	}

	@Then("check whether New Bikes is present in the header section")
	public void check_whether_new_bikes_is_present_in_the_header_section() {
		home = new HomePage(BaseClass.getDriver());
		home.newbikeschecking();
	}

	@When("user hovers the mouse over the New Bikes")
	public void user_hovers_the_mouse_over_the_new_bikes() {
		home = new HomePage(BaseClass.getDriver());
		home.Newbikes();
	}

	@Then("check whether upcoming bikes is present in the New Bikes dropdown")
	public void check_whether_upcoming_bikes_is_present_in_the_new_bikes_dropdown() {
		home.upcomingbikes();
	}

	@Given("user is on any page of the Zigwheels website")
	public void user_is_on_any_page_of_the_zigwheels_website() {
		home = new HomePage(BaseClass.getDriver());
	}

	@When("user clicks on the used cars")
	public void user_clicks_on_the_used_cars() {
		home.Usedcars2();
	}

	@Then("user should navigate to used cars page")
	public void user_should_navigate_to_used_cars_page() {
		home.usedcarschecking();
	}

}
