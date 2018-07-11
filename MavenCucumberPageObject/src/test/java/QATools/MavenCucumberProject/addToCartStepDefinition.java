package QATools.MavenCucumberProject;

import QATools.MavenCucumberPageObject.AddToCart;
import QATools.MavenCucumberPageObject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addToCartStepDefinition extends setBrowserConfig {
	
	HomePage homePage;
	AddToCart addToCart;

	@When("^User clicks Electronics$")
	public void user_clicks_Electronics() throws Throwable {
		// user is not logged in
		homePage = new HomePage (driver);
		addToCart = homePage.clickCategory();
		// logged in user 
		//loginPage = new LoginPage(driver);  
		//addToCart = loginPage.clickCategory();
	}

	@And("^Selects Smartphone$")
	public void selects_Smartphone() throws Throwable {	
		addToCart.addSmartPhone();
	}

	@And("^Selects Add to Cart button$")
	public void selects_Add_to_Cart_button() throws Throwable {
		addToCart.clickAddToCartButton();
	}

	@Then("^Item should be added to cart$")
	public void item_should_be_added_to_cart() throws Throwable {
		addToCart.verifyItemInCart();
	}
}
