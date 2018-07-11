package QATools.MavenCucumberProject;

import QATools.MavenCucumberPageObject.HomePage;
import QATools.MavenCucumberPageObject.ShoppingCart;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class goToCartStepDefinition extends setBrowserConfig {
	
	HomePage homePage;
	ShoppingCart shoppingCart;	
	
	@When("^User clicks Shopping Cart$")
	public void user_clicks_Shopping_Cart() throws Throwable {
		// user is not logged in
		homePage = new HomePage(driver);
		shoppingCart = homePage.selectShoppingCartLink();
		// user is logged in
		//loginPage = new LoginPage (driver);
		//shoppingCart = loginPage.selectShoppingCartLink();
	}

	@Then("^User will be redirected to Shopping Cart page$")
	public void user_will_be_redirected_to_Shopping_Cart_page() throws Throwable {
		// Assert page title. Should be Shopping Cart page
		shoppingCart.getPageTitle();
	}
}
