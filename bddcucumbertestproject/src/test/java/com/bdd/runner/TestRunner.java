package com.bdd.runner;

import org.junit.runner.RunWith;
import org.testng.ITestNGListener;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Use JUnit to run the Cucumber tests
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",          // Path to feature files
    glue = {"stepdefinitions"},                          // Package name where step definitions are present
    tags = "@WMSY-T2",
    plugin = {
        "pretty",                                      // Pretty console output
        "json:target/cucumber.json"   ,
            "html:target/cucumber-reports/cucumber-pretty",
            "json:target/cucumber-reports/CucumberTestReport.json",
            "junit:target/cucumber-reports/CucumberTestReport.xml"
       
    },
    monochrome = true,                                 // Clean console output
    dryRun = true                                  // Validate steps without executing if true
		)
public class TestRunner {
   
}
