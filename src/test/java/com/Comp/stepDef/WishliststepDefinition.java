package com.Comp.stepDef;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.Wishlist;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class WishliststepDefinition extends Base {

	Wishlist wl = new Wishlist(driver);
	public static Logger log;

	@Before("@FWishlist")
	public void getw() {
		test = report.startTest("Wishlist");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click Wishlist$")
	public void user_land_to_home_page_and_click_wishlist() throws Throwable {
		wl.getClickwishlist().click();
		test.log(LogStatus.PASS, "Click wishlist");
		log.info("Click wishlist");
	}

	@Then("^user verify word$")
	public void user_verify_word() throws Throwable {
		Assert.assertFalse(wl.getWordA().isDisplayed());
		test.log(LogStatus.PASS, "Verify word");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Verify word");
	}

	@After("@FWishlist")
	public void getwl() {
		report.endTest(test);
		report.flush();
	}

}
