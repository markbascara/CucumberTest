package QATools.MavenCucumberPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends AbstractPage{

	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	
	public ShoppingCart getPageTitle() {
		Assert.assertTrue(driver.getTitle().contains("Demo Web Shop. Shopping Cart"));
		return new ShoppingCart (driver);
	}
	public ShoppingCart selectTermsAndCondition () {
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		return new ShoppingCart (driver);		
	}
	
	public CheckOutPage clickCheckOutButton () {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new CheckOutPage (driver);
	}
	

}
