package QATools.MavenCucumberProject;

import QATools.MavenCucumberPageObject.AddToCart;
import QATools.MavenCucumberPageObject.CheckOutPage;
import QATools.MavenCucumberPageObject.ConfirmationPage;
import QATools.MavenCucumberPageObject.HomePage;
import QATools.MavenCucumberPageObject.LoginPage;
import QATools.MavenCucumberPageObject.ShoppingCart;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkoutStepDefinition extends setBrowserConfig {
	
	HomePage homePage;
	LoginPage loginPage;
	AddToCart addToCart;
	ShoppingCart shoppingCart;
	CheckOutPage checkOutPage;
	ConfirmationPage confirmationPage;

	@When("^Logged in User add an item to cart$")
	public void logged_in_User_add_an_item_to_cart() throws Throwable {
		homePage = new HomePage(driver);
		loginPage = homePage.navigateToLogin();
		loginPage
			.setEmailField()
			.setPasswordField()
			.submitButton();
		addToCart = loginPage.clickCategory();
		addToCart
			.addSmartPhone()
			.clickAddToCartButton();
	}
	
	@When("^User complete the Checkout Information page$")
	public void user_complete_the_Checkout_Information_page() throws Throwable {		
		shoppingCart = loginPage.selectShoppingCartLink(); 
		shoppingCart.selectTermsAndCondition();
		checkOutPage = shoppingCart.clickCheckOutButton();		

		// Populate Billing Information section		
		checkOutPage
			.selectNewAddressBilling()
			.populateFirstNameBilling()
			.populateLastNameBilling()
			.populateEmailBilling()
			.populateCountryIdBilling()
			.populateCityBilling()
			.populateAddress1Billing()
			.populateZipPostalCodeBilling()
			.populatePhoneNumberBilling()
			.clickContinueBillingBilling();
		Thread.sleep(1000);

		// Populate Shipping Information section
		checkOutPage
			.selectNewAddressShipping()
			.populateFirstNameShipping()
			.populateLastNameShipping()
			.populateEmailShipping()
			.populateCountryIdShipping()
			.populateCityShipping()
			.populateAddress1Shipping()
			.populateZipPostalCodeShipping()
			.populatePhoneNumberShipping()
			.clickContinueShipping();
		Thread.sleep(1000);

		// Select Shipping method section				
		checkOutPage
			.selectShippingMethod()
			.clickContinueShippingMethod();
		Thread.sleep(1000);

		// Select payment method section
		checkOutPage
			.selectPaymentMethod()
			.clickContinuePaymentMethod();
		Thread.sleep(1000);

		// Continue payment Information section		
		checkOutPage.continuePaymentInformation();
		Thread.sleep(1000);

		// Click Confirm button
		confirmationPage = checkOutPage.confrimOrder();
		Thread.sleep(2000);
	}

	@Then("^will see a message on the screen that the order is completed$")
	public void will_see_a_message_on_the_screen_that_the_order_is_completed() throws Throwable {
		//verify Order is complete
		confirmationPage.verifySuccessOrder(); 		
	}
}
