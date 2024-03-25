package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class TestContext {

	public LoginPage lp;
	private TestContext testContext;
	WebDriver driver;
	public TestContext (TestContext testContext) {
		this.testContext=testContext;
	}
	
	public LoginPage getLoginPage() {
		lp= new LoginPage(TestBase.getDriver());
		return lp;		
	}
}
