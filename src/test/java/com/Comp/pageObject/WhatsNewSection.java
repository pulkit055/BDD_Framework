package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.HomeWhatsNewUI;
import com.Comp.reusableCompon.Base;

public class WhatsNewSection extends Base{
	
    public WhatsNewSection(WebDriver driver) {
		this.driver=driver;
		
	}
    
    public WebElement getWhatsNew() {
    	return driver.findElement(HomeWhatsNewUI.clickWhats);
    }
    
    public WebElement getFProduct() {
    	return driver.findElement(HomeWhatsNewUI.clickFpro);
    }
    
    public WebElement getSelectMonica() {
    	return driver.findElement(HomeWhatsNewUI.selectM);
    }
    public WebElement getClickAddtobag() {
    	return driver.findElement(HomeWhatsNewUI.clickAdd);
    }
}
