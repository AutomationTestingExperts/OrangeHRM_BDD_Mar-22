package com.orangehrm.config;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="com.orangehrm.stepdef",
		dryRun=false,
		monochrome=true,
		tags= "smoke",
		plugin = { "pretty", "html:Reports/CucumberReport.html" }
		)
public class Runner {
	
}
