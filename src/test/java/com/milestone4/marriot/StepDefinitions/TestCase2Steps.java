package com.milestone4.marriot.StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.milestone4.marriot.PageObjects.TestCase2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class TestCase2Steps {

	public WebDriver driver;
	public TestCase2 tc2Obj=new TestCase2(driver);
	 @When("^User clicks FindHotels $")
	    public void user_clicks_findhotels() {
	       tc2Obj.getFindHotels();
	    }

	    @Then("^User should verify entered city name present in address of first hotel or not$")
	    public void user_should_verify_entered_city_name_present_in_address_of_first_hotel_or_not()  {
	        tc2Obj.getValidCityInAddress();
	    }

	    @And("^Enters \"([^\"]*)\" in Destination field$")
	    public void enters_something_in_destination_field(String strArg1)  {
	        tc2Obj.setCityName(strArg1);
	    }
}
