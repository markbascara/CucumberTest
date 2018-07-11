package QATools.MavenCucumberPageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage navigateToWeb() {
		driver.get("http://demowebshop.tricentis.com/");
		return new HomePage (driver);
	}
	
	public void closeDriver () {
		driver.quit(); 
	}

}
