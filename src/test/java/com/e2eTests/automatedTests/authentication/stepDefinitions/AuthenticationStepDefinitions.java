package com.e2eTests.automatedTests.authentication.stepDefinitions;

import com.e2eTests.automatedTests.utilis.CommonMethods;
import com.e2eTests.automatedTests.utilis.Setup;
import cucumber.api.java.en.Given;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AuthenticationStepDefinitions {
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	CommonMethods commonMethods = new CommonMethods();
	Setup setup = new Setup();
	public void AuthenticationStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws IOException, InterruptedException {
		commonMethods.openUrlWithConfigFile("url");
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws InterruptedException {
		commonMethods.waitForVisibility(By.name(authenticationPage.USER_NAME));
		authenticationPage.FillUserName(name);
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) {
		authenticationPage.FillPassword(password);
	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws InterruptedException {
			authenticationPage.ClickBtnLogin();
	}

	@Then("^Je me redirige vers le compte admin$")
	public void jeMeRedirigeVersLeCompteAdmin() throws InterruptedException {
		commonMethods.waitForVisibility(By.xpath(authenticationPage.USER_ADMIN));
			String textMessage = AuthenticationPage.userAdmin.getText();
			Assert.assertTrue(textMessage.contains("Time at Work"));
		}
}
