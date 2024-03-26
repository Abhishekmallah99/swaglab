package pageObjects;

import org.openqa.selenium.WebDriver;

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
