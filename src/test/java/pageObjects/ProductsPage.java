package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.TestBase;

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
			
	public String getProductTitle() {
		return driver.getCurrentUrl();
	}
}
