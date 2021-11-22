package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.HomeLatestUI;
import com.Comp.reusableCompon.Base;

public class ClickLatest extends Base{

	public ClickLatest(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickla() {
		return driver.findElement(HomeLatestUI.clicklatest);
	}
	
	public WebElement getclcika() {
		return driver.findElement(HomeLatestUI.clickad);
	}
	
	
}
