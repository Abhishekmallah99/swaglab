package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import utils.TestBase;
import utils.TestContext;

public class LoginPageSteps {

	public WebDriver driver;
	public LoginPage lp;
	public ProductsPage productsPage;
	String productTitle;
	public TestContext testContext;
	
//	public LoginPageSteps(TestContext testContext) {
//		this.testContext =testContext;
//	}
	
	@Given("user is on the Sauce Demo login page")
	public void user_is_on_the_sauce_demo_login_page() {
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {	 
		lp = new LoginPage(TestBase.getDriver());
		//testContext.getLoginPage().getUserName();
		lp.getUserName();
		lp.getPassword();
	}
	@When("clicks on the {string} button")
	public void clicks_on_the_button(String btn) {
		lp.loginButton();
	}
	@Then("user should be redirected to the dashboard or inventory page")
	public void user_should_be_redirected_to_the_dashboard_or_inventory_page() throws IOException{
		productsPage = new ProductsPage(TestBase.getDriver());
		String currentUrl = productsPage.getProductTitle();
		Assert.assertTrue(currentUrl.contains("inventory"));
	}

	@When("user enters invalid username and\\/or password")
	public void user_enters_invalid_username_and_or_password() {
		lp = new LoginPage(TestBase.getDriver());
		lp.getInvalidUserName();
		lp.getInvalidPassword();
	}
	@Then("an error message indicating invalid credentials should be displayed")
	public void an_error_message_indicating_invalid_credentials_should_be_displayed() {
		String errorMessage = lp.getErrorMessage();
		Assert.assertTrue(errorMessage.contains(errorMessage), "Error message not same");
	}
}
