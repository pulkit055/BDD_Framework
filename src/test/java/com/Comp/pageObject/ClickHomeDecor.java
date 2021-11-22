package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.HomeDecorUI;
import com.Comp.reusableCompon.Base;

public class ClickHomeDecor extends Base{
	
	public ClickHomeDecor(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getHomeDecor() {
		return driver.findElement(HomeDecorUI.clickHomeD);
	}
	
	public WebElement getProd() {
		return driver.findElement(HomeDecorUI.clickFpro);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(HomeDecorUI.clickAdd);
	}
	
	

}
