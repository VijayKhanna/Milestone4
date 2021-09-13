package com.milestone4.marriot.ReusableComponents;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.milestone4.marriot.Utilities.BrowserInfo;

public class BaseClass {

	public  WebDriver driver;
	public  Properties prop;
	public  Logger logger;
	
	public WebDriver initializedriver() throws IOException {
		return driver =BrowserInfo.initialize(driver, "Chrome", "https://www.marriott.com/default.mi");
	}
	
}
