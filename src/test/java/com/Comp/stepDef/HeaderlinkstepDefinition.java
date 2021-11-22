package com.Comp.stepDef;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.Comp.Utilities.ExtentLogReports;
import com.Comp.pageObject.HeaderLinkSection;
import com.Comp.reusableCompon.Base;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class HeaderlinkstepDefinition extends Base{
   HeaderLinkSection hl = new HeaderLinkSection(driver);
   public static Logger log;

	@Before("@CHeaderlink")
	public void getHe() {
		test=report.startTest("Header link");
		log=Logger.getLogger(Base.class.getName());
	}
	
    @Then("^User land to home page and click the personalize gifts$")
    public void user_land_to_home_page_and_click_the_personalize_gifts() throws Throwable {
        hl.getHeaderlink().click();
        test.log(LogStatus.PASS, "Click on personalize gift");
        log.info("Click on personalize gift");
    }

    @Then("^User select the first product$")
    public void user_select_the_first_product() throws Throwable {
        hl.getFproduct().click();
        test.log(LogStatus.PASS, "Click on first product");
        log.info("Click on first product");
    }
    
    @Then("^User verify text$")
    public void user_verify_text() throws Throwable {
       Assert.assertTrue(hl.getText().isDisplayed());
       test.log(LogStatus.PASS, "Verify the text");
       ExtentLogReports.pass(driver, test, "Task Done", log);
       log.info("Verify the text");
    }
    
    @After("@CHeaderlink")
    public void getHea() {
    	report.endTest(test);
    	report.flush();
    }


}
