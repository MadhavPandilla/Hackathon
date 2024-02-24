package StepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import PageObjects.Upcomingbikes;
import PageObjects.Usedcars;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegressionTesting {
	Upcomingbikes z;
	Usedcars u;

	@Given("user is on the zig wheels website")
	public void user_is_on_the_zig_wheels_website() {
		z = new Upcomingbikes(BaseClass.getDriver());

	}

	@When("the user filters upcoming bikes for Honda with price less than four lakhs")
	public void the_user_filters_upcoming_bikes_for_with_price_less_than_four_lakhs() {
		z.Newbikes();
		z.Upcomingbikes();
		z.Honda();

	}

	@Then("the system should display the bike name, price, and expected launch date for each result")
	public void the_system_should_display_the_bike_name_price_and_expected_launch_date_for_each_result()
			throws IOException {
		z.ListofHondaBikes();

	}

	@Given("user is on the Zigwheels website")
	public void user_is_on_the_zigwheels_website() {
		u = new Usedcars(BaseClass.getDriver());

	}

	@When("user explore filtering options for used cars in chennai")
	public void user_explore_filtering_options_for_used_cars_in_chennai() {
		u.Usedcars1();
		u.Chennai();

	}

	@Given("the user navigates to the used cars tab")
	public void the_user_navigates_to_the_used_cars_tab() {
		u = new Usedcars(BaseClass.getDriver());
	}

	@When("user select the checkbox of popular models in filter section")
	public void user_select_the_checkbox_of_popular_models_in_filter_section()
			throws IOException, InterruptedException {
		u.Popularmodels();

	}

	@Then("user gets the car information of respective clicked checkbox")
	public void user_gets_the_car_information_of_respective_clicked_checkbox()
			throws InterruptedException, IOException {
		u.regression();

	}
}
