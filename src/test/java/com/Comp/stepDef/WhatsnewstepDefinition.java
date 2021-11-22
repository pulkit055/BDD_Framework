package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.WhatsNewSection;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class WhatsnewstepDefinition extends Base {

	WhatsNewSection wn = new WhatsNewSection(driver);
	public static Logger log;

	@Before("@Iwhatsnew")
	public void getWn() {
		test = report.startTest("Whats New Section");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click whats new section$")
	public void user_land_to_home_page_and_click_whats_new_section() throws Throwable {
		wn.getWhatsNew().click();
		test.log(LogStatus.PASS, "Click on whats new section");
		log.info("Click on whats new section");
	}

	@Then("^User select f product$")
	public void user_select_f_product() throws Throwable {
		wn.getFProduct().click();
		test.log(LogStatus.PASS, "Click on first product");
		log.info("Click on first product");
	}

	@Then("^User select Monica$")
	public void user_select_monica() throws Throwable {
		wn.getSelectMonica().click();
		test.log(LogStatus.PASS, "Click on amonica model");
	}

	@Then("^User click Ad bag$")
	public void user_click_ad_bag() throws Throwable {
		wn.getClickAddtobag().click();
		test.log(LogStatus.PASS, "Click on add to bag");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Click on add to bag");
	}

	@After("@Iwhatsnew")
	public void getWnn() {
		report.endTest(test);
		report.flush();
	}

}
