package com.zigwheels.StepDefinition;

import com.zigwheels.Factory.BaseClass;
import com.zigwheels.PageObjects.HomePage;
import com.zigwheels.PageObjects.Login;
import com.zigwheels.PageObjects.UpcomingBikes;
import com.zigwheels.PageObjects.UsedCars;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegressionTesting {

	UpcomingBikes ub;
	Login l;
	HomePage home;
	UsedCars u;

	@Given("user is on the zig wheels website")
	public void user_is_on_the_zig_wheels_website() {
		BaseClass.getLogger().info("User is on the zigwheels website..... ");
		ub = new UpcomingBikes(BaseClass.getDriver());
	}

	@When("the user filters upcoming bikes for Honda")
	public void the_user_filters_upcoming_bikes_for_honda() {
		ub.Newbikes();
		ub.Upcomingbikes2();
		ub.Honda();
	}

	@Then("user should be navigated to Upcoming Honda Bike Tab")
	public void user_should_be_navigated_to_upcoming_honda_bike_tab() {
		ub.navigatinghondaverification();
	}

	@Given("User navigates to the Upcoming honda bikes tab")
	public void user_navigates_to_the_upcoming_honda_bikes_tab() {
		ub = new UpcomingBikes(BaseClass.getDriver());
	}

	@When("User clicks on the read more option")
	public void user_clicks_on_the_read_more_option() {
		ub.readmore();
	}

	@When("user stores the information of all upcoming Honda bikes")
	public void user_stores_the_information_of_all_upcoming_honda_bikes() {
		ub.upcominghondalist();
	}

	@Then("User should be redirected to the Home page")
	public void user_should_be_redirected_to_the_home_page() {
		l = new Login(BaseClass.getDriver());
		l.navigatingbacktohomepage();
	}

	@Given("User navigates to the zigwheels website")
	public void user_navigates_to_the_zigwheels_website() {
		home = new HomePage(BaseClass.getDriver());
	}

	@When("User clicks on the {string} button in Used Cars tab")
	public void user_clicks_on_the_button_in_used_cars_tab(String string) {
		home.city(string);
	}

	@Then("User should be navigated to the Used Cars with that {string}")
	public void user_should_be_navigated_to_the_used_cars_with_that(String string) {
		home.check(string);
	}

	@When("user search for Honda bikes")
	public void user_search_for_honda_bikes() {
		home = new HomePage(BaseClass.getDriver());
		home.searchbutton();
	}

	@Then("user should see relevant search results for Honda bikes")
	public void user_should_see_relevant_search_results_for_honda_bikes() {
		home.checkingforhondabikes();
	}

	@Given("the user navigates to the used cars tab")
	public void the_user_navigates_to_the_used_cars_tab() {
		home = new HomePage(BaseClass.getDriver());
		home.Usedcars1();
		home.Chennai();
	}

	@When("user select the checkbox of popular models in filter section")
	public void user_select_the_checkbox_of_popular_models_in_filter_section() throws InterruptedException {
		u = new UsedCars(BaseClass.getDriver());
		u.clickingfilter();
	}

	@Then("user gets the car information of respective clicked checkbox")
	public void user_gets_the_car_information_of_respective_clicked_checkbox() {
		u.carinformation();

	}

}
