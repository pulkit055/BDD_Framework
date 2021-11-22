package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.SearchBar;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class SearchstepDefinition extends Base {

	SearchBar sb = new SearchBar(driver);
	public static Logger log;

	@Before("@DSearchbar")
	public void getS() {
		test = report.startTest("Search page");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click the search bar Enter the Items$")
	public void user_land_to_home_page_and_click_the_search_bar_enter_the_items() throws Throwable {
		sb.getSearchBar().sendKeys("Gifts for kids");
		test.log(LogStatus.PASS, "Click on search bar");
		log.info("Click on search bar");
	}

	@Then("^User select frist product$")
	public void user_select_frist_product() throws Throwable {
		sb.getProduct().click();
		test.log(LogStatus.PASS, "Select first product");
		log.info("Select first product");
	}

	@Then("^User click add to cart$")
	public void user_click_add_to_cart() throws Throwable {
		sb.getAddtoBag().click();
		test.log(LogStatus.PASS, "Click on Add to Cart");
		log.info("Click on Add to Cart");
	}

	@Then("^User click checkout$")
	public void user_click_checkout() throws Throwable {
		sb.getCheckout().click();
		test.log(LogStatus.PASS, "Click on checkout");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Click on checkou");
	}

	@After("@DSearchbar")
	public void getSS() {
		report.endTest(test);
		report.flush();
	}

}
