package QATools.MavenCucumberPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends AbstractPage {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	// Populate Billing Address
	public CheckOutPage selectNewAddressBilling() {
		driver.findElement(By.id("billing-address-select")).sendKeys("New Address");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateFirstNameBilling() {
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Mark");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateLastNameBilling() {
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Tester");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateEmailBilling() {
		driver.findElement(By.id("BillingNewAddress_Email")).clear();
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("mark1@enhance.com");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateCountryIdBilling() {
		driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("New Zealand");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateCityBilling() {
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Auckland");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateAddress1Billing() {
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("53 Cook St.");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateZipPostalCodeBilling() {
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("1010");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populatePhoneNumberBilling() {
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0272135846");
		return new CheckOutPage(driver);
	}

	public CheckOutPage clickContinueBillingBilling() {
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		return new CheckOutPage(driver);
	}

	// Populate Shipping Address
	public CheckOutPage selectNewAddressShipping() {
		driver.findElement(By.id("shipping-address-select")).sendKeys("New Address");
		;
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateFirstNameShipping() {
		driver.findElement(By.id("ShippingNewAddress_FirstName")).sendKeys("Mark");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateLastNameShipping() {
		driver.findElement(By.id("ShippingNewAddress_LastName")).sendKeys("Tester");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateEmailShipping() {
		driver.findElement(By.id("ShippingNewAddress_Email")).clear();
		driver.findElement(By.id("ShippingNewAddress_Email")).sendKeys("mark1@enhance.com");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateCountryIdShipping() {
		driver.findElement(By.id("ShippingNewAddress_CountryId")).sendKeys("New Zealand");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateCityShipping() {
		driver.findElement(By.id("ShippingNewAddress_City")).sendKeys("Auckland");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateAddress1Shipping() {
		driver.findElement(By.id("ShippingNewAddress_Address1")).sendKeys("53 Cook St.");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populateZipPostalCodeShipping() {
		driver.findElement(By.id("ShippingNewAddress_ZipPostalCode")).sendKeys("1010");
		return new CheckOutPage(driver);
	}

	public CheckOutPage populatePhoneNumberShipping() {
		driver.findElement(By.id("ShippingNewAddress_PhoneNumber")).sendKeys("0272135846");
		return new CheckOutPage(driver);
	}

	public CheckOutPage clickContinueShipping() {
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input[@type='button']")).click();
		return new CheckOutPage(driver);
	}

	// Shipping method section
	public CheckOutPage selectShippingMethod() {
		driver.findElement(By.xpath("//div[@id='checkout-shipping-method-load']//input[@id='shippingoption_1']")).click();
		return new CheckOutPage(driver);
	}

	public CheckOutPage clickContinueShippingMethod() {
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input[@type='button']")).click();
		return new CheckOutPage(driver);
	}

	// Payment method section
	public CheckOutPage selectPaymentMethod() {
		driver.findElement(By.id("paymentmethod_1")).click();
		return new CheckOutPage(driver);
	}

	public CheckOutPage clickContinuePaymentMethod() {
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input[@type='button']")).click();
		return new CheckOutPage(driver);
	}

	// payment Information section
	public CheckOutPage continuePaymentInformation() {
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input[@type='button']")).click();
		return new CheckOutPage(driver);
	}

	// Click Confirm button	
	public ConfirmationPage confrimOrder() {
		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input[@type='button']")).click();
		return new ConfirmationPage(driver);
	}
}
