package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import PageObjects.Login;
import PageObjects.Upcomingbikes;
import PageObjects.Usedcars;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Endtoend {
	Upcomingbikes Zig;
	WebDriver driver;
	Usedcars used;
	Login login;

	@Given("user is on the zig wheels site")
	public void user_is_on_the_zig_wheels_site() {
		Zig = new Upcomingbikes(BaseClass.getDriver());
	}

	@When("user hover on New bikes")
	public void user_hover_on_new_bikes() {
		BaseClass.getLogger().info("Hover the mouse to New bikes... ");
		Zig.Newbikes();
	}

	@When("click on upcoming bikes")
	public void click_on_upcoming_bikes() {
		BaseClass.getLogger().info("Click on Upcoming bikes..... ");
		Zig.Upcomingbikes();
	}

	@When("filter upcoming bikes for Honda")
	public void filter_upcoming_bikes_for_honda() {
		BaseClass.getLogger().info("Click on manufacturer and select Honda.... ");
		Zig.Honda();
	}

	@Then("display the bike name, price, and expected launch date for each result with price less than four Lakhs")
	public void display_the_bike_name_price_and_expected_launch_date_for_each_result_with_price_less_than_four_lakhs()
			throws IOException {
		Zig.ListofHondaBikes();
	}

	@Given("user is on the zigwheels website")
	public void user_is_on_the_zigwheels_website() {
		used = new Usedcars(BaseClass.getDriver());
	}

	@When("user hovers over used cars")
	public void user_hovers_over_used_cars() {
		BaseClass.getLogger().info("Hover the mouse on used cars..... ");
		used.Usedcars1();
	}

	@When("click on chennai")
	public void click_on_chennai() {
		used.Chennai();
		BaseClass.getLogger().info("Clicked on Chennai..... ");
	}

	@Then("display all the popular models in a list")
	public void display_all_the_popular_models_in_a_list() throws IOException, InterruptedException {
		BaseClass.getLogger().info("Generating the all the popular models of used cars in chennai..... ");
		used.Popularmodels();
		// used.popularmodelslist();
	}

	@Given("the user is on the  zig wheels page")
	public void the_user_is_on_the_zig_wheels_page() {
		login = new Login(BaseClass.getDriver());
	}

	@When("user clicks on Signin\\/Register button")
	public void user_clicks_on_signin_register_button() throws InterruptedException {
		login.SigninRegister();
		BaseClass.getLogger().info("Clicked on Signin/Register Button..... ");
	}

	@When("login with invalid email account details")
	public void login_with_invalid_email_account_details() throws InterruptedException, IOException {
		login.invaliddetailsemail();
		BaseClass.getLogger().info("Given invalid email account id..... ");
	}

	@Then("display the error message for invalid username")
	public void display_the_error_message_for_invalid_username() throws InterruptedException {
		login.invalidusername();
	}

	@Then("Navigating back to homepage")
	public void navigating_back_to_homepage() {
		login.navigatingbacktohomepage();
	}
}
