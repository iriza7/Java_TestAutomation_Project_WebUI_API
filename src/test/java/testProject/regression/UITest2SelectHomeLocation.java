package testProject.regression;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testProject.driver.Base;
import testProject.page.HomePage;

public class UITest2SelectHomeLocation {
	Base base = new Base();
	WebDriver driver = base.getDriver();

	// Test2 - The user can select ADIDAS.FI as a location
	// if prompted to select her location
	@Test
	public void test02SelectHomeLocation() {
		driver.get("https://www.adidas.fi/order-tracker");
		HomePage homepage = new HomePage(driver);
		homepage.clickLogo();

		assertTrue(homepage.getMenu().contains("WOMEN"), "Page is not loaded");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
