package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPositive {
	WebDriver driver;
	@Given("I Navigate to {string}")
	public void i_navigate_to(String url) {
		  driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("https://tutorialsninja.com/demo/");
	}

	@When("I Hit My Account link")
	public void i_hit_my_account_link() {
	   driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	 
	}

	@When("Hit Login link")
	public void hit_login_link() {
	    // 
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")).click();
	}

	@When("enter a valid email address and a valid password")
	public void enter_a_valid_email_address_and_a_valid_password() {
		driver.findElement(By.id("input-email")).sendKeys("eyobadinew@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("&1Tsebayesenay");
	}

	@When("hit login button")
	public void hit_login_button() {
	    driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']")).click();;
	}

	@Then("I will be redirected to my home page and the page title is {string}")
	public void i_will_be_redirected_to_my_home_page_and_the_page_title_is(String string) {
		WebElement title = driver.findElement(By.xpath("//h2[normalize-space()='My Account']"));
		title.isDisplayed();
	}

    @And ("close the browser")
    public void close_the_browser() { 
      driver.close();}
    
    @After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenShotName =  scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "img/png", screenShotName);   
		}   
    }
    }

