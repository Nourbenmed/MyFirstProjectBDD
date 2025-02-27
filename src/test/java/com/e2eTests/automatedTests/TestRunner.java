package com.e2eTests.automatedTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/specs/features"},
        strict = false, 
        plugin = {"pretty", "json:target/cucumber_json_reports/cucumber.json", "html:target/cucumber-report", "com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/ExtentReport.html"},
        snippets = SnippetType.CAMELCASE,
        tags = ("@connexion"),
        monochrome = true)

public class TestRunner {
		@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
}
