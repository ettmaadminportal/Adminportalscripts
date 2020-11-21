package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdef.JVMReport;

@RunWith(Cucumber.class)  	
@CucumberOptions(features="src/test/resources/Viewaudit.feature", glue= {"stepdef"},
plugin= {"pretty","json: target/Repo/report.json"}, dryRun=true, monochrome=true)
	

public class Testrunner {
	
	@AfterClass
	public static void ReportGeneration() {
		JVMReport.GenerateJVMReport("C:\\Users\\sprit\\Adminportal Git download\\Adminportalscripts\\ target\\Repo\\report.json");

	} 

}
