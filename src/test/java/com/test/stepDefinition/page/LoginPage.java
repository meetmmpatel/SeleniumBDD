package com.test.stepDefinition.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginPage extends PageObject {

	@FindBy(id = "txtUsername")
	private WebElementFacade userName;

	@FindBy(id = "txtPassword")
	private WebElementFacade passWord;

	@FindBy(id = "btnLogin")
	private WebElementFacade loginButton;

	public void verifyUsername(String userinfo) {
		userName.shouldBeVisible();
		userName.sendKeys(userinfo);
	}

	public void verifyPassword(String password) {
		passWord.shouldBeVisible();
		passWord.sendKeys(password);

	}
	
	public void verifyLoginButton() {
		loginButton.shouldBeCurrentlyVisible();
		loginButton.shouldBeEnabled();
		loginButton.click();
	}
	
	

}
