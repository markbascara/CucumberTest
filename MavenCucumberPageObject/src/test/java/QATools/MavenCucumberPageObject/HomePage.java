package QATools.MavenCucumberPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage navigateToLogin() {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
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
}
