package com.milestone4.marriot.PageObjects;

import org.openqa.selenium.WebDriver;
import com.milestone4.marriot.UIStore.LandingPageUI;

public class TestCase3 {

	public WebDriver driver;
	public LandingPageUI lpuiObj=new LandingPageUI();
	public TestCase3(WebDriver driver) {
		this.driver=driver;
	}
	
	//Method to click Member benefits from Marriot bonvoy page
	public void getMemberBenefits() {
		driver.findElement(lpuiObj.memberBenf).click();
	}
	//Method to validate text is present ot not
	public void getValidTextInPage() {
		System.out.println(driver.findElement(lpuiObj.textToVal).isDisplayed());
	}
}
