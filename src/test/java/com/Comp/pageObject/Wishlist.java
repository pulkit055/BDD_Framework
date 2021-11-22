package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.WishListUI;
import com.Comp.reusableCompon.Base;

public class Wishlist extends Base{
	
	public Wishlist(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickwishlist() {
		return driver.findElement(WishListUI.clickwish);
	}
	
	public WebElement getWordA() {
		return driver.findElement(WishListUI.word);
	}
	

}
