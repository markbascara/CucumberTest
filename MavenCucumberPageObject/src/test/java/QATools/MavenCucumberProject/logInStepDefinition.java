package QATools.MavenCucumberProject;

import QATools.MavenCucumberPageObject.HomePage;
import QATools.MavenCucumberPageObject.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logInStepDefinition extends setBrowserConfig {

	HomePage homePage;
	LoginPage loginPage;
	
	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {	
		homePage = new HomePage(driver);
		loginPage = homePage.navigateToLogin();		
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {	
		loginPage
			.setEmailField()
			.setPasswordField()
			.submitButton();
	}

	@Then("^User must be logged in and display username on the web site$")
	public void user_must_be_logged_in_and_display_username_on_the_web_site() throws Throwable {
		loginPage.verifyLoggedInUser();
	}
}
