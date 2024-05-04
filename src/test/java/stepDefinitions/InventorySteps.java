package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.BasePage;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import utils.TestBase;
import utils.TestContext;

public class InventorySteps{
	
	public WebDriver driver;
	public ProductsPage productsPage;
	
//	public LoginPageSteps(TestContext testContext) {
//		this.testContext =testContext;
//	}
	
	
	@When("user verify header section on inventory page")
	public void user_verify_header_section_on_inventory_page() {
		//BasePage.highLighterMethod(driver,productsPage. );
		productsPage = new ProductsPage(TestBase.getDriver());
	}
	@Then("user should see hambuger menu, Swaglabs logo and Shopping cart")
	public void user_should_see_hambuger_menu_swaglabs_logo_and_shopping_cart() throws InterruptedException {
	  	
		Assert.assertTrue(productsPage.gethamBurgerMenu(), "Not found");
		
		Assert.assertTrue(productsPage.getswagLabLogo(), "Not found");

		Assert.assertTrue(productsPage.getshoppingCart(), "Not found");
	}
	
	
	
	
}
