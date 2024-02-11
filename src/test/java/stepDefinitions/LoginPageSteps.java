package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import utils.TestBase;

public class LoginPageSteps {

	public WebDriver driver;
	public LoginPage lp;
	public ProductsPage productsPage;
	String productTitle;

	@Given("user is on the Sauce Demo login page")
	public void user_is_on_the_sauce_demo_login_page() {
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {	 
    	
		lp = new LoginPage(TestBase.getDriver());
		try {
			lp.getUserName();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lp.getPassword();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("clicks on the {string} button")
	public void clicks_on_the_button(String btn) {
		try {
			lp.loginButton();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user should be redirected to the dashboard or inventory page")
	public void user_should_be_redirected_to_the_dashboard_or_inventory_page() throws IOException{
		productsPage = new ProductsPage(TestBase.getDriver());
		String currentUrl = productsPage.getProductTitle();
	    Assert.assertTrue(currentUrl.contains("inventory"));
	    
	    //Assert.assertEquals(false, null);
	}
}
