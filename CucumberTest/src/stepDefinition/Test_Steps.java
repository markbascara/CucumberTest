package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	public static String browser;
	public static WebDriver driver;
	
	public static void setBrowser() {
		browser = "Chrome";		
	}
	
	public static void setBrowserConfig() {
		
		if (browser.contains("Chrome")) {
		//Settings for Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "/Users/MarkBascara/eclipse-workspace/SeleniumTest/lib/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver(); 
		}
		
		if (browser.contains("Firefox")) {
		//Settings for Firefox Browser 
		System.setProperty("webdriver.gecko.driver", "/Users/MarkBascara/eclipse-workspace/SeleniumTest/lib/geckodriver/geckodriver.exe");			
		System.setProperty("webdriver.firefox.bin", "/Program Files/Mozilla Firefox/firefox.exe");			
		driver = new FirefoxDriver();
		}
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "/Users/MarkBascara/eclipse-workspace/SeleniumTest/lib/Chromedriver/chromedriver.exe"); 
		//driver = new ChromeDriver();
		setBrowser();
		setBrowserConfig();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Select login link 
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
	    // Enter Email, password and click login button
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Click the logout link 
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logout Successfully");
		driver.quit();
	}
	
}
