package QATools.MavenCucumberPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends AbstractPage{

	public LogOutPage(WebDriver driver) {
		super(driver);
	}

	public LogOutPage verifyLogInLink () {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='header-links']")).getText().contains("Log in"));
		return new LogOutPage (driver);
	}
}
