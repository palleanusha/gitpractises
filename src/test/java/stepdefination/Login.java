package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;


	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage(). timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Then("enter the url")
	public void enter_the_url() {

driver.get("http://localhost:8888");
	}
	
	@Then("enter the username")
	public void enter_the_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
	}
	@Then("enter the password")
	public void enter_the_password() {
		driver.findElement(By.name("user_password")).sendKeys("12345");
		
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();	
	}
	
	@When("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	@Then("enter the url {string}")
	public void enter_the_url(String URL) {
	    driver.get(URL);
	}

	@Then("enter the username {string}")
	public void enter_the_username(String UN) {
		driver.findElement(By.name("user_name")).sendKeys(UN);
	}

	@Then("enter the password {string}")
	public void enter_the_password(String PWD) {
		driver.findElement(By.name("user_password")).sendKeys(PWD);
	}

}
