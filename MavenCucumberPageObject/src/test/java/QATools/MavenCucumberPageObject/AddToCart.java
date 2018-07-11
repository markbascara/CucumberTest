package QATools.MavenCucumberPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart extends AbstractPage{

	public AddToCart(WebDriver driver) {
		super(driver);
	}
	
	public AddToCart addSmartPhone() {
		driver.findElement(By.xpath("//div[@class='item-box']/div/h2/a[contains(text(),'Cell phones')]")).click();
		return new AddToCart (driver);
	}
	
	public AddToCart clickAddToCartButton () {
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		return new AddToCart (driver);
	}
	
	public AddToCart verifyItemInCart () {
		Assert.assertFalse(driver.findElement(By.xpath("//div[@class='page-body']")).getText().contains("Your Shopping Cart is empty!"));
		return new AddToCart (driver);
	}
}

