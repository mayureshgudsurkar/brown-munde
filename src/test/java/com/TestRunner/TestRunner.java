package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	            features = {"feature files/Orange.feature"},
	            glue = {"com.StepDefination"},
	            dryRun =false,
	            monochrome = true,
	           
	            tags = "@HomePage or @AdminPage"
		
		
		
		
		
		
		)
















public class TestRunner {

}
