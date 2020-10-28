package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdef.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/createsubscriber.feature", glue= {"stepdef"},
plugin= {"pretty","json: target/Repo/Createsubscriber.json"}, dryRun=false, monochrome=true)


public class Testrunner {
	
	@AfterClass
	public static void ReportGeneration() {
		JVMReport.GenerateJVMReport("C:\\Users\\sprit\\git\\Adminportal\\ target\\Repo\\Createsubscriber.json");
	} 

}
