package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",
glue="stepDefinitions",
monochrome=true,
tags="@inventory"
		)
public class testRunner_testNG extends AbstractTestNGCucumberTests {


}
