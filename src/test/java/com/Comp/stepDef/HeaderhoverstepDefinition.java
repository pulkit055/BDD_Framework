package com.Comp.stepDef;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.HeaderhoverSection;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class HeaderhoverstepDefinition extends Base {

	HeaderhoverSection hh = new HeaderhoverSection(driver);
	public static Logger log;

	@Before("@BHeaderhover")
	public void getHh() {
		test = report.startTest("Header hover link");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click the gifts section$")
	public void user_land_to_home_page_and_click_the_gifts_section() throws Throwable {
		Actions s = new Actions(driver);
		WebElement ele = hh.getHovergifts();
		s.moveToElement(ele).perform();
		test.log(LogStatus.PASS, "Move mouse to hover dropdown");
        log.info("Move mouse to hover dropdown");
	}

	@Then("^User select after hover third product$")
	public void user_select_after_hover_third_product() throws Throwable {
		hh.getFirstHoverPr().click();
		test.log(LogStatus.PASS, "Click on hover third option");
		log.info("Click on hover third option");
	}

	@Then("^User select first product$")
	public void user_select_first_product() throws Throwable {
		hh.getFirstProduct().click();
		test.log(LogStatus.PASS, "Click first product");
		log.info("Click first product");
	}

	@Then("^User click Add to Bag$")
	public void user_click_add_to_bag() throws Throwable {
		hh.getAddtoBag().click();
		test.log(LogStatus.PASS, "Click add to bag");
		ExtentLogReports.pass(driver, test, "Task Done", log);
        log.info("Click add to bag");
	}

	@After("@BHeaderhover")
	public void getHhh() {
		report.endTest(test);
		report.flush();
	}

}
