package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.CartUI;
import com.Comp.reusableCompon.Base;

public class cart extends Base {
	
	public cart(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getCart() {
		return driver.findElement(CartUI.clickC);
	}
	

		

}
