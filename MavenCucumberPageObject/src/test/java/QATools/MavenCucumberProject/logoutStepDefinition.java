package QATools.MavenCucumberProject;

import QATools.MavenCucumberPageObject.HomePage;
import QATools.MavenCucumberPageObject.LogOutPage;
import QATools.MavenCucumberPageObject.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logoutStepDefinition extends setBrowserConfig {
	
	HomePage homePage; 
	LoginPage loginPage;
	LogOutPage logOutPage;
	
	@When("^User clicks on the logout link$")
	public void user_clicks_on_the_logout_link() throws Throwable {
		homePage = new HomePage(driver);
		loginPage = homePage.navigateToLogin();
		loginPage
			.setEmailField()
			.setPasswordField()
			.submitButton();
		//loginPage = new LoginPage(driver);
		logOutPage = loginPage.clickLogoutLink();
	}

	@Then("^User will be logged out$")
	public void user_will_be_logged_out() throws Throwable {
		//Assert User is logged out of the website
		logOutPage.verifyLogInLink();
	}
}
