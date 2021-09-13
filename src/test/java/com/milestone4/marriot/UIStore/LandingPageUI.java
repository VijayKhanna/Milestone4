package com.milestone4.marriot.UIStore;

import org.openqa.selenium.By;

public class LandingPageUI {

	public final By brands=By.xpath("//p[normalize-space()='Our Brands']");
	public final By jwm   =By.xpath("//a[@class='t-brand-logo-icon-JW t-alt-link t-no-hover-link']");
	public final By destinyField=By.xpath("//input[@id='C7DIC4YX_search-location']");
	public final By findHotels=By.xpath("//div[@class='l-xs-col-4 l-xl-col-4 l-xl-last-col l-hsearch-find l-find-top js-hform-fields l-hsearch-find-homepage']//button[@type='submit'][normalize-space()='Find Hotels']");
	public final By memberBenf=By.xpath("//a[normalize-space()='Member Benefits']");
	public final By textToVal=By.xpath("//h3[normalize-space()='Mobile Check-In and Mobile Key']");
			
}
