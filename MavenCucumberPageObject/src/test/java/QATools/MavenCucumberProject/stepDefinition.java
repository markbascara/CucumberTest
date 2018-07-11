package QATools.MavenCucumberProject;

import org.openqa.selenium.WebDriver;
import QATools.MavenCucumberPageObject.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class stepDefinition extends setBrowserConfig {

	WebDriver driver = getDriver();
	HomePage homePage;
	
	 @After public void afterScenarioFinish() {
	 System.out.println("-----------------End of Background Scenario-----------------");
	 driver.quit(); 
	 }
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		
		homePage = new HomePage (driver);
		homePage.navigateToWeb();
	}
}
