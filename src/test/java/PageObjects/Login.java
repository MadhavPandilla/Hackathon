package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Factory.BaseClass;

public class Login extends Basepage {
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@FindBy(id = "forum_login_wrap_lg")
	WebElement signin;

	@FindBy(xpath = "(//div[@class='newgf-login'])[2]")
	WebElement google;

	@FindBy(id = "identifierId")
	WebElement gmail;

	@FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[3]")
	WebElement click;

	@FindBy(xpath = "//div[@class='o6cuMc Jj6Lae']")
	WebElement error;

	@FindBy(xpath = "//*[@id=\"Header\"]/div/div[1]/div[1]/a/img")
	WebElement Homepage;

	@FindBy(id = "report_submit_close_login")
	WebElement closelogin;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void SigninRegister() throws InterruptedException {
		Homepage.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		signin.click();
	}

	public void invaliddetailsemail() throws InterruptedException, IOException {
		google.click();
		Set<String> y = new HashSet<String>();
		y = driver.getWindowHandles();
		List<String> m = new ArrayList<String>(y);
		String d = m.get(1);
		driver.switchTo().window(d);
		System.out.println(m.size());
		gmail.sendKeys(BaseClass.getProperties().getProperty("username"));
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].click();", click);
	}

	public void invalidusername() throws InterruptedException {
		Thread.sleep(5000);
		String error1 = error.getText();
		System.out.println(error1);
		driver.close();
	}

	public void close() {
		Set<String> y = new HashSet<String>();
		y = driver.getWindowHandles();
		List<String> m = new ArrayList<String>(y);
		String q = m.get(0);
		driver.switchTo().window(q);
		closelogin.click();
	}

	public void navigatingbacktohomepage() {
		Homepage.click();
	}
}
