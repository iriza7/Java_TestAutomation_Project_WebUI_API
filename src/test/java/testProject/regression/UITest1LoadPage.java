package testProject.regression;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testProject.driver.Base;
import testProject.page.HomePage;

public class UITest1LoadPage {
	Base base = new Base();
	WebDriver driver = base.getDriver();

	// UI Test1 - A user can load https://www.adidas.fi
	@Test
	public void testUI01LoadPage() {
		driver.get("https://www.adidas.fi/");
		HomePage homepage = new HomePage(driver);

		assertTrue(homepage.getMenu().contains("WOMEN"), "Page is not loaded");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
