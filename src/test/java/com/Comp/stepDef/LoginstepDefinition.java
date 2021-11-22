package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.LoginPage;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefinition extends Base {
	LoginPage lp = new LoginPage(driver);
	public static Logger log;

	@Before("@ALogin")
	public void getl() {
		test = report.startTest("Login page");
		log = Logger.getLogger(Base.class.getName());
	}

	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver = BaseSettings();
		driver.get(prop.getProperty("url"));
		log.info("driver initilaize");
	}

	@And("^User will land to Home page and click on sign in$")
	public void user_will_land_to_home_page_something_and_click_on_sign_in() throws Throwable {
		lp.getClickSignin().click();
		test.log(LogStatus.PASS, "Click on sign in");
		log.info("Click on sign in");
	}

	@When("^User enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {
		lp.getClickEm().sendKeys(username);
		lp.getClickPas().sendKeys(password);
		test.log(LogStatus.PASS, "Credential enter");
	}

	@Then("^Click to login button$")
	public void click_to_login_button() throws Throwable {
		lp.getClickButt().click();
		test.log(LogStatus.PASS, "Login succssfully");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Login succssfully");
	}

	@After("@ALogin")
	public void getll() {
		report.endTest(test);
		report.flush();
	}

	@Then("^browser close$")
	public void browser_close() throws Throwable {
		driver.close();
	}

}
