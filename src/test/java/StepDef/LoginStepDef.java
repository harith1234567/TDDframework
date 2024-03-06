package StepDef;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters\"validusername\" username")
	public void user_enters_validusername_username() {
		driver.findElement(By.name("email")).sendKeys("haritha");

	}
	@When("user enters \"correctpassword\"password")
	public void user_enters_correctpassword_password() {
		driver.findElement(By.name("pass")).sendKeys("haritha123");

	}

	@When("users clicks on login button")
	public void users_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("I validate the outcomes user should be logged in successfully")
	public void i_validate_the_outcomes_user_should_be_logged_in_successfully() {
		System.out.println("login sucessful");
		driver.close();
	}
	@When("user enters {string} username")
	public void user_enters_invalid_username(String username) {
		driver.findElement(By.name("email")).sendKeys("invalidusername");
	}

	@When("user enters \"wrongpassword\"invalid password")
	public void user_enters_wrongpassword_invalid_password() {
		driver.findElement(By.name("pass")).sendKeys("wrongpassword");

	}

	@Then("I validate the outcomes user should not be logged in successfully")
	public void i_validate_the_outcomes_user_should_not_be_logged_in_successfully() {
		driver.close();
	}
	@When("^user enters(.+) and (.+)$")
	public void enterCreds(String username, String password){
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);


	}

}



