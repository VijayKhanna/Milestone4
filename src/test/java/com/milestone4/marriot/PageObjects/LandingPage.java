package com.milestone4.marriot.PageObjects;

import org.openqa.selenium.WebDriver;

import com.milestone4.marriot.UIStore.LandingPageUI;

public class LandingPage {

	public WebDriver driver;
	public LandingPageUI lpuiObj=new LandingPageUI();
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Method to click our brands
	public void getOurBrands() {
		driver.findElement(lpuiObj.brands).click();
	}
	//Method to check 
	public void getValidation() {
		System.out.println(driver.findElement(lpuiObj.jwm).isDisplayed());
	}
}
