package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import utils.TestBase;

public class Hooks {

	WebDriver driver;
	 Properties p;
    
	@Before
   public void setup() throws IOException
   {
   	driver=TestBase.initilizeBrowser();
   	    	
   	p=TestBase.getProperties();
   	driver.get(p.getProperty("appURL"));
   	driver.manage().window().maximize();		
	}
	
}
