package com.milestone4.marriot.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//Features/Testcase2.feature",
		glue="com.milestone4.marriot.StepDefinitions",
		plugin= {"pretty","html:test-output"}
		)
public class TestCase2Runner {

}
