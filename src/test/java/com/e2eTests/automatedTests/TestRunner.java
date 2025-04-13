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
        plugin = {"pretty", "html:target/cucumber_html_report", "com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/OrangeHRM.html"},
        snippets = SnippetType.CAMELCASE,
        tags = ("@tag"),
        monochrome = true)

public class TestRunner {
		@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
}
