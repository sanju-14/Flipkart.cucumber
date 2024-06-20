package TestRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features = { "src/test/java/Features" }, 
		glue = { "stepDefinitions" }, 
		monochrome = true, 
		tags = {"@tag1"},
		plugin = { "pretty", "json:reports/cucumber/json/json-report.json","html:reports/cucumber/html/html-report.html" })
public class testRunner {

}
