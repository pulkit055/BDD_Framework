package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.HeaderlinkUI;
import com.Comp.reusableCompon.Base;

public class HeaderLinkSection extends Base{
	
	
	public HeaderLinkSection(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHeaderlink() {
		return driver.findElement(HeaderlinkUI.clickHeaderl);
	}
	
	public WebElement getFproduct() {
		return driver.findElement(HeaderlinkUI.clickFpro);
	}
	
	public WebElement getText() {
		return driver.findElement(HeaderlinkUI.clickTex);
	}								
	
}
