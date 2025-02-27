package com.e2eTests.automatedTests.authentication.stepDefinitions;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.utilis.Setup;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutheticationOutlineStepDefinitions {
    public WebDriver driver;
    private AuthenticationPage authenticationPage = new AuthenticationPage();
   public void AuthenticationOutlineStepDefinitions() {
       driver = Setup.driver;
       PageFactory.initElements(driver, AuthenticationPage.class);
   }

    @When("^Je saisie login \"([^\"]*)\"$")
    public void jeSaisieLogin(String name) throws Throwable {
        authenticationPage.FillUserName(name);
    }

    @When("^Je saisie mot de passe  \"([^\"]*)\"$")
    public void jeSaisieMotDePasse(String password) throws Throwable {
        authenticationPage.FillPassword(password);
    }
}
