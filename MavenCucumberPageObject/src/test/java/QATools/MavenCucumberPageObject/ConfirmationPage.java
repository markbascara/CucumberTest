package QATools.MavenCucumberPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends AbstractPage {

	public ConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	public ConfirmationPage verifySuccessOrder () {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='master-wrapper-main']")).getText().contains("Thank you"));
		return new ConfirmationPage (driver);
	}

}
