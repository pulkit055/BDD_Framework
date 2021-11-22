package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.GiftCardUI;
import com.Comp.reusableCompon.Base;

public class GiftCard extends Base{

	
	public GiftCard(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickGift() {
		return driver.findElement(GiftCardUI.clickGift);
	}
	
	public WebElement getClickMoney() {
		return driver.findElement(GiftCardUI.clickM);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(GiftCardUI.clickAdd);
	}

}
