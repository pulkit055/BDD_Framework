package com.Comp.reusableCompon;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	public static ExtentTest test;
	public static ExtentReports report;
	
	public static void initializeReport()
	{
		if(report==null)
		report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"
				+ System.currentTimeMillis() + "-.html");
	}
	public static WebDriver driver;
	public static Properties prop;
	
	
	public WebDriver BaseSettings() {
		try {

			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					".//src//resources//prop.properties");

			prop.load(fis);

			String browserName = prop.getProperty("Browser");

			
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulki\\OneDrive\\Documents\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("Edge")) {
				// initialize here edge browser
			}

			else {
				// initialize browser of your choice
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

}




