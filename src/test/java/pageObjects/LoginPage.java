package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.TestBase;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
//	By password = By.id("password");
//	By loginButton = By.id("login-button");

	public void getUserName() throws IOException {
		//testbase.WebDriverManager();
		userName.sendKeys("standard_user");
	}

	public void getPassword() throws IOException {
		password.sendKeys("secret_sauce");
	}

	public void loginButton() throws IOException {
		loginButton.click();
	}
}
