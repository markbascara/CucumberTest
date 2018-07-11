package QATools.MavenCucumberPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage setEmailField() {
		driver.findElement(By.id("Email")).sendKeys("mark1@enhance.com");
		return new LoginPage (driver);
	}
	
	public LoginPage setPasswordField() {
		driver.findElement(By.id("Password")).sendKeys("123456");
		return new LoginPage (driver);
	}
	
	public LoginPage submitButton () {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		return new LoginPage (driver);
		
	}
	 
	public LoginPage verifyLoggedInUser() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='header-links']")).getText().contains("mark1@enhance.com"));
		return new LoginPage (driver);
	}
	
	public AddToCart clickCategory() {
		driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a[contains(text(),'Electronics')]")).click();
		return new AddToCart (driver);
	}
	
	public ShoppingCart selectShoppingCartLink() {
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		return new ShoppingCart (driver);
	}
	
	public LogOutPage clickLogoutLink() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		return new LogOutPage(driver);
	}
}
