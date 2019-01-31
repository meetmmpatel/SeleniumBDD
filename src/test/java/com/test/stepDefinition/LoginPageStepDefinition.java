package com.test.stepDefinition;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;

import com.ibm.icu.impl.Assert;
import com.test.stepDefinition.steps.LoginStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

public class LoginPageStepDefinition {

	@Steps
	LoginStep loginStep;

	@Given("^I can see website home page on internet browser$")
	public void i_can_see_website_home_page_on_internet_browser() {
		loginStep.openTheWebsite();

	}

	@When("^I enter user name \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_enter_user_name_and_Password(String arg1, String arg2) {

		loginStep.provideUsername(arg1);
		loginStep.providePassword(arg2);

	}

	@When("^click on loginpage$")
	public void click_on_loginpage() {
		loginStep.clickLogin();
	}

	@Then("^I should see admin page$")
	public void i_should_see_admin_page() {

	}

	@Then("^I should see an error statating it's wrong username password$")
	public void i_should_see_an_error_statating_it_s_wrong_username_password() {

		loginStep.readErrorMessage();

	}

}
