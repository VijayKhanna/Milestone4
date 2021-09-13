package com.milestone4.marriot.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.milestone4.marriot.UIStore.LandingPageUI;

public class TestCase2 {

	public WebDriver driver;
	public LandingPageUI lpuiObj;
	public TestCase2(WebDriver driver) {
		this.driver=driver;
	}
	//Metod to enter city name
	public void setCityName(String strArg1) {
		driver.findElement(lpuiObj.destinyField).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	//Method to click findhotels
	public void getFindHotels() {
		driver.findElement(lpuiObj.findHotels).click();
	}
	//Method to validate city 
	public void getValidCityInAddress() {
		System.out.println();
	}
}
