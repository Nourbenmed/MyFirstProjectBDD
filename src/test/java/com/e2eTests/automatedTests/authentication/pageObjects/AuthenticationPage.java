package com.e2eTests.automatedTests.authentication.pageObjects;

import com.e2eTests.automatedTests.utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.utilis.BasePage;

public class AuthenticationPage extends BasePage {

	CommonMethods commonMethods = new CommonMethods();
	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}

	/*Locators*/
	public final static String USER_NAME = "username";
	final static String USER_PASSWORD = "password";
	public final static String BUTTON_LOGIN_ID = "//button[@type='submit']";
	public final static String SUCCESS ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p";

	public final static String FAILED ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]";

	public final static String ERROR_USERNAME_EMPTY ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span";

	@FindBy(how = How.NAME, using = USER_NAME)
	public static WebElement userName;

	@FindBy(how = How.NAME, using = USER_PASSWORD)
	public static WebElement userPassword;
	@FindBy(how = How.XPATH, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = SUCCESS)
	public static WebElement success;

	@FindBy(how = How.XPATH, using = FAILED)
	public static WebElement failed;

	@FindBy(how = How.XPATH, using = ERROR_USERNAME_EMPTY)
	public static WebElement errorUsernameEmpty;
	/*Methods*/
	public void FillUserName(String name) {
		commonMethods.waitForVisibility(By.name(USER_NAME));
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
