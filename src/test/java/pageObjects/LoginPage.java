package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(id="user-name")
	WebElement invalidUserName;
	
	@FindBy(xpath="//h3[@data-test=\"error\"]")
	WebElement errorMessage;
	
	@FindBy(id="password")
	WebElement invalidPassword;
	
//	By password = By.id("password");
//	By loginButton = By.id("login-button");

	public void getUserName() {
		//testbase.WebDriverManager();
		BasePage.highLighterMethod(driver, userName);
		userName.sendKeys("standard_user");
	}

	public void getPassword() {
		BasePage.highLighterMethod(driver, password);
		password.sendKeys("secret_sauce");
	}
	public void getInvalidUserName(){
		BasePage.highLighterMethod(driver, userName);
		//testbase.WebDriverManager();
		userName.sendKeys("abc");
	}

	public void getInvalidPassword() {
		BasePage.highLighterMethod(driver, password);
		password.sendKeys("abc");
	}
	
	public String getErrorMessage() {
		BasePage.highLighterMethod(driver, errorMessage);
		return errorMessage.getText();
	}

	public void loginButton() {
		BasePage.highLighterMethod(driver, loginButton);
		loginButton.click();
	}
}
