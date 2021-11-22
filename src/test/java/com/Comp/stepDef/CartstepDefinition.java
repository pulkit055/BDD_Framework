package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.cart;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class CartstepDefinition extends Base {

	cart c = new cart(driver);
	public static Logger log;

	@Before("@HCart")
	public void getC() {
		test = report.startTest("Cart");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click cart$")
	public void user_land_to_home_page_and_click_cart() throws Throwable {
		c.getCart().click();
		test.log(LogStatus.PASS, "Click on cart");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Click on Cart");
		
	}

	@After("@HCart")
	public void getCc() {
		report.endTest(test);
		report.flush();

	}
}
