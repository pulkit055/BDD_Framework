package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIStored.LoginPageUI;
import com.Comp.reusableCompon.Base;

public class LoginPage extends Base{
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getClickSignin() {
		return driver.findElement(LoginPageUI.clickSign);
	}
	
	public WebElement getClickEm() {
		return driver.findElement(LoginPageUI.clickEmail);
	}
	
	public WebElement getClickPas() {
		return driver.findElement(LoginPageUI.clickPass);
	}
	
	public WebElement getClickButt() {
		return driver.findElement(LoginPageUI.clickButton);
	}

}
