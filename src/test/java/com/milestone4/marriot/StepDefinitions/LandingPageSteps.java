package com.milestone4.marriot.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.milestone4.marriot.PageObjects.LandingPage;
import com.milestone4.marriot.PageObjects.TestCase3;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class LandingPageSteps {

	
	public WebDriver driver;
	public LandingPage lp;
	public TestCase3 tc3Obj;
	 	@Given("^User open the chrome browser$")
	    public void user_open_the_chrome_browser()  {
	 		WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        lp=new LandingPage(driver);
	        tc3Obj=new TestCase3(driver);
	    }

	    @When("^User open URL \\\"([^\\\"]*)\\\"$")
	    public void user_open_url(String url) {
	    	driver.get(url);
	        
	    }

	    @And("^User clicks Our brands$")
	    public void user_clicks_our_brands()  {
	    	lp.getOurBrands();
	    }
	    
	    @Then("^User should verify whether there is jw marriot present or not$")
	    public void user_should_verify_whether_there_is_jw_marriot_present_or_not()  {
	    	lp.getValidation();  
	    }
}
