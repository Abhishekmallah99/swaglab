package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	//WebDriver driver;
	//Test base;
//	public ProductsPage(WebDriver driver) {
//		this.driver=driver;
//	}
	
	public ProductsPage(WebDriver driver) {
		super(driver);
		
	}

//	@FindBy(id="product_label")
//	WebElement productsTitle;
//	
	@FindBy(className="bm-burger-button")
	WebElement hamBurgerMenu;
	
	@FindBy(className="app_logo")
	WebElement swagLabLogo;
	
	@FindBy(css="#shopping_cart_container a svg")
	WebElement shoppingCart;
	
	
	public String getProductTitle() {
		
		return driver.getCurrentUrl();
	}
	
	public boolean gethamBurgerMenu() {
		BasePage.highLighterMethod(driver, hamBurgerMenu);
		return hamBurgerMenu.isDisplayed();
	}
	
	public boolean getswagLabLogo() {
		BasePage.highLighterMethod(driver, swagLabLogo);
		return swagLabLogo.isDisplayed();
	}
	
	public boolean getshoppingCart() {
		BasePage.highLighterMethod(driver, shoppingCart);
		return shoppingCart.isDisplayed();
	}
}
