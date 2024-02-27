package com.zigwheels.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.zigwheels.Utilities.excelutils;

public class UpcomingBikes extends BasePage {
	public UpcomingBikes(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	Actions act = new Actions(driver);
	String File = System.getProperty("user.dir") + "/src/test/resources/Excel/Book1.xlsx";

	@FindBy(xpath = "//a[contains(text(), 'New Bikes')]")
	WebElement newbikes;

	@FindBy(xpath = "//span[contains(text(), 'Upcoming Bikes')]")
	WebElement upcomingbikes;

	@FindBy(id = "upcomingLaunchForm")
	WebElement Manufacturer;

	@FindBy(id = "makeId")
	WebElement Manufacturerclass;

	@FindBy(xpath = "//span[contains(text(),\"View More Bikes \")]")
	WebElement viewmore;

	@FindBy(xpath = "//*[@id=\"modelList\"]//div/div[3]/a")
	List<WebElement> bikename;

	@FindBy(xpath = "//*[@id=\"modelList\"]//div/div[3]/a/following-sibling::div[1]")
	List<WebElement> bikeprice;

	@FindBy(xpath = "//*[@id=\"modelList\"]//div/div[3]/a/following-sibling::div[2]")
	List<WebElement> launchdate;

	@FindBy(xpath = "//h1[@class='mt-0 pt-2 pull-left zm-cmn-colorBlack']")
	WebElement upcominghonda;

	@FindBy(xpath = "//span[@class='fnt-12 b rmec jr-m c-p']")
	WebElement readmore;

	@FindBy(xpath = "//h2[@class='ml-0 pt-20']")
	WebElement upcomingbikeslist;

	public void Newbikes() {
		act.moveToElement(newbikes).perform();
	}

	public void Upcomingbikes2() {
		wait.until(ExpectedConditions.elementToBeClickable(upcomingbikes));
		act.moveToElement(upcomingbikes).click().perform();
	}

	public void Honda() {
		Manufacturer.click();
		Select sc = new Select(Manufacturerclass);
		sc.selectByVisibleText("Honda");
	}

	public void navigatinghondaverification() {
		Boolean h = upcominghonda.isDisplayed();
		Assert.assertEquals(h, true);
		System.out.println("Successfully navigated to upcoming honda bikes");
	}

	public void readmore() {
		readmore.click();
	}

	public void upcominghondalist() {
		Boolean p = upcomingbikeslist.isDisplayed();
		Assert.assertEquals(p, true);
		System.out.println("Successfully displayed upcoming honda bikes");
	}

	public void ListofHondaBikes() throws IOException {
		js.executeScript("arguments [0].scrollIntoView();", viewmore);
		js.executeScript("arguments [0].click();", viewmore);
		int c = 0;
		excelutils.setCellData(File, "Sheet1", c, 0, "Bike Name");
		excelutils.fillOrangeColor(File, "Sheet1", c, 0);
		excelutils.setCellData(File, "Sheet1", c, 1, "Bike Price");
		excelutils.fillOrangeColor(File, "Sheet1", c, 1);// excel
		excelutils.setCellData(File, "Sheet1", c, 2, "Launch Date");
		excelutils.fillOrangeColor(File, "Sheet1", c, 2);// excel
		c += 1;
		System.out.println("******Upcoming Bikes for Honda Price Less than 4 Lakhs********");
		for (int i = 0; i < bikename.size(); i++) {
			String amount = bikeprice.get(i).getText();
			String price = amount.replaceAll("[^\\d.]", "").replaceFirst("\\.(?=.*\\.)", "");
			double number = (Double.parseDouble(price));
			if (number < 4) {
				System.out.println(bikename.get(i).getText());
				System.out.println(bikeprice.get(i).getText());
				System.out.println(launchdate.get(i).getText());
				String n = bikename.get(i).getText();
				String y = bikeprice.get(i).getText();
				String l = launchdate.get(i).getText();
				excelutils.setCellData(File, "Sheet1", c, 0, n);
				excelutils.setCellData(File, "Sheet1", c, 1, y);
				excelutils.setCellData(File, "Sheet1", c, 2, l);
				c += 1;
			}

		}

	}

}
