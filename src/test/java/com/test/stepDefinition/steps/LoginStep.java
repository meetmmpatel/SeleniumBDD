package com.test.stepDefinition.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.test.stepDefinition.page.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {

	LoginPage loginPage;

	@Step
	public void openTheWebsite() {
		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
		loginPage.setDriver(chromeDriver);
		loginPage.getDriver().manage().deleteAllCookies();
		loginPage.open();

	}

	@Step
	public void provideUsername(String user) {
		loginPage.verifyUsername(user);
	}

	@Step
	public void providePassword(String pass) {
		loginPage.verifyPassword(pass);
	}

	@Step
	public void clickLogin() {
		loginPage.verifyLoginButton();
	}

}
