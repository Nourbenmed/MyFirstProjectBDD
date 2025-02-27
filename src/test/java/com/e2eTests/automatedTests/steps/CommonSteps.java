package com.e2eTests.automatedTests.steps;

import java.io.FileInputStream;
import java.util.Properties;

import com.e2eTests.automatedTests.utilis.Setup;

import cucumber.api.java.en.Given;

public class CommonSteps {

	public static Properties prop;

	@Given("^Je me connecte à l'application Arvea$")
	public void jeMeConnecteÀLApplicationArvea() throws Throwable {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/profiles/recette/profile.properties");
		prop.load(fis);
		Setup.driver.get(prop.getProperty("home.url"));
	}

}
