package com.milestone4.marriot.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInfo {

		public static WebDriver initialize(WebDriver driver,String browserName, String baseURL) {
			
			if(browserName.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browserName.equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browserName.equals("ie")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else {
				System.out.println("We don't support this browser "+browserName);
			}
			
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			return driver;
		}
}
