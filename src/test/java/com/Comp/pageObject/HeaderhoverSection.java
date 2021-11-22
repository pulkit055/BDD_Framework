package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.HeaderhoverUI;
import com.Comp.reusableCompon.Base;

public class HeaderhoverSection extends Base {
	
	public HeaderhoverSection(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHovergifts() {
		return driver.findElement(HeaderhoverUI.hover);
	}
	
	public WebElement getFirstHoverPr() {
		return driver.findElement(HeaderhoverUI.clickfhoverPr);
	}
	
	public WebElement getFirstProduct() {
		return driver.findElement(HeaderhoverUI.clickFpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(HeaderhoverUI.clickAdd);
	}
	

}
