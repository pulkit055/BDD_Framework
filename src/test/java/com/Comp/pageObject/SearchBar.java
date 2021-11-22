package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.SearchbarUI;
import com.Comp.reusableCompon.Base;

public class SearchBar extends Base{
		
	public SearchBar(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(SearchbarUI.clickSearch);
	}
	
	public WebElement getProduct() {
		return driver.findElement(SearchbarUI.clickPro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(SearchbarUI.clickAdd);
	}
	
	public WebElement getCheckout() {
		return driver.findElement(SearchbarUI.clickCheck);
	}
}
