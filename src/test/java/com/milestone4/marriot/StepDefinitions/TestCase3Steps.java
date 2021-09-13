package com.milestone4.marriot.StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.milestone4.marriot.PageObjects.LandingPage;
import com.milestone4.marriot.PageObjects.TestCase3;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class TestCase3Steps {

	public WebDriver driver;
	public TestCase3 tc3Obj=new TestCase3(driver);
	 	@When("^User clicks Member Benefits under Marriot Bonvoy module$")
	    public void user_clicks_member_benefits_under_marriot_bonvoy_module()  {
	        tc3Obj.getMemberBenefits();
	    }

	    @Then("^User should verify whethere thers is Mobile Check-in and Mobile key present or not$")
	    public void user_should_verify_whethere_thers_is_mobile_checkin_and_mobile_key_present_or_not()  {
	        tc3Obj.getValidTextInPage();
	    }
}
