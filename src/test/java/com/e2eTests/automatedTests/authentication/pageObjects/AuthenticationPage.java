package com.e2eTests.automatedTests.authentication.pageObjects;

import com.e2eTests.automatedTests.utilis.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.utilis.BasePage;

public class AuthenticationPage extends BasePage {


	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}

	/*Locators*/
	public final static String USER_NAME = "username";
	final static String USER_PASSWORD = "password";
	final static String BUTTON_LOGIN_ID = "//button[@type='submit']";
	public final static String USER_ADMIN ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p";


	@FindBy(how = How.NAME, using = USER_NAME)
	public static WebElement userName;

	@FindBy(how = How.NAME, using = USER_PASSWORD)
	public static WebElement userPassword;
	@FindBy(how = How.XPATH, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = USER_ADMIN)
	public static WebElement userAdmin;

	/*Methods*/
	public void FillUserName(String name) {
		userName.clear();
		userName.sendKeys(name);
	}

	public void FillPassword(String password) {
		userPassword.clear();
		userPassword.sendKeys(password);
	}

	public void ClickBtnLogin() {
		btnLogin.click();
	}
}
