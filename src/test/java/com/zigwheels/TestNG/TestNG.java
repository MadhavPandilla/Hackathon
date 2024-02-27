package com.zigwheels.TestNG;

import java.io.IOException;

import org.testng.annotations.Test;

import com.zigwheels.Factory.BaseClass;
import com.zigwheels.PageObjects.HomePage;
import com.zigwheels.PageObjects.Login;
import com.zigwheels.PageObjects.UpcomingBikes;
import com.zigwheels.PageObjects.UsedCars;
import com.zigwheels.StepDefinition.Hooks;

public class TestNG extends Hooks {

	UpcomingBikes Zig;
	// WebDriver driver;
	UsedCars used;
	Login login;
	HomePage hp;

	@Test(priority = 1)
	public void clicking_upcoming_bikes() {
		System.out.println("This is TESTNG");
		Zig = new UpcomingBikes(BaseClass.getDriver());
		Zig.Newbikes();
		Zig.Upcomingbikes2();

	}

	@Test(priority = 2)
	public void selecting_manufacture_honda() {
		Zig.Honda();
	}

	@Test(priority = 3)
	public void displaying_bikes_price_less_than_4lakhs() throws InterruptedException, IOException {
		Zig.ListofHondaBikes();
	}

	@Test(priority = 4)
	public void hovering_over_used_cars() {
		hp = new HomePage(BaseClass.getDriver());
		hp.Usedcars1();
	}

	@Test(priority = 5)
	public void clicking_chennai() {
		hp.Chennai();
	}

	@Test(priority = 6)
	public void displaying_all_popular_models() throws IOException, InterruptedException {
		used = new UsedCars(BaseClass.getDriver());
		used.Popularmodels();
		used.popularmodelslist();
	}

	@Test(priority = 7)
	public void clicking_signin() throws InterruptedException {
		login = new Login(BaseClass.getDriver());
		login.SigninRegister();
	}

	@Test(priority = 8)
	public void entering_invalid_email_account() throws InterruptedException, IOException {
		login.invaliddetailsemail();
	}

	@Test(priority = 9)
	public void displaying_error_message() throws InterruptedException {
		login.invalidusername();
	}

	@Test(priority = 10)
	public void navigating_back_to_homepage() {
		login.close();
		login.navigatingbacktohomepage();
	}

}
