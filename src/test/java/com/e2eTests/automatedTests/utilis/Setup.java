package com.e2eTests.automatedTests.utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
           case "chrome":
            	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/win/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                PageDriver.getInstance().setDriver(driver);
                break;
           /* case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win/geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();
                PageDriver.getInstance().setDriver(driver);
                break;*/
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }

}
