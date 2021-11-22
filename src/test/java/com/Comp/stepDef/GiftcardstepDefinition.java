package com.Comp.stepDef;

import org.apache.log4j.Logger;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.GiftCard;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class GiftcardstepDefinition extends Base {

	GiftCard gc = new GiftCard(driver);
	public static Logger log;

	@Before("@EGiftcard")
	public void getGc() {
		test = report.startTest("Gift card");
		log = Logger.getLogger(Base.class.getName());
	}

	@Then("^User land to home page and click Gift card$")
	public void user_land_to_home_page_and_click_gift_card() throws Throwable {
		gc.getClickGift().click();
		test.log(LogStatus.PASS, "Click gift card");
		log.info("Click gift card");
	}

	@Then("^User add money in gift card$")
	public void user_add_money_in_gift_card() throws Throwable {
		gc.getClickMoney().click();
		test.log(LogStatus.PASS, "Add money");
		log.info("Add money");
	}

	@Then("^User click add to bag$")
	public void user_click_add_to_bag() throws Throwable {
		gc.getClickAddtoBag().click();
		test.log(LogStatus.PASS, "Click add to bag");
		ExtentLogReports.pass(driver, test, "Task Done", log);
		log.info("Click add to bag");
	}

	@After("@EGiftcard")
	public void getGcc() {
		report.endTest(test);
		report.flush();
	}

}
