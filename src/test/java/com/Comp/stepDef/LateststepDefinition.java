package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.ClickLatest;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class LateststepDefinition extends Base {

	ClickLatest l = new ClickLatest(driver);

	public static Logger log;

	@Before("@JLatest")
	public void getL() {
		test = report.startTest("Latest section");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click latest product$")
	public void user_land_to_home_page_and_click_latest_product() throws Throwable {
		l.getClickla().click();
		test.log(LogStatus.PASS, "Select Latest of first product");
		log.info("Select Latest of first product");
	}

	@Then("^User click addtob$")
	public void user_click_addtob() throws Throwable {
		l.getclcika().click();
		test.log(LogStatus.PASS, "Click on add to bag");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Click on add to bag");
	}

	@After("@JLatest")
	public void getLl() {
		report.endTest(test);
		report.flush();
	}

}
