package testProject.regression;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testProject.driver.Base;
import testProject.page.DetailsPage;
import testProject.page.HomePage;
import testProject.page.ItemsPage;

public class UITest3Navigation {
	Base base = new Base();
	WebDriver driver = base.getDriver();
	HomePage homepage;

	// Test3 - The user can navigate through the menus
	// (hover on Women, click on Shoes / Football)
	@Test
	public void test03MenuNavigation() {
		driver.get("https://www.adidas.fi/");
		homepage = new HomePage(driver);
		homepage.goMenuWomen();		
		
		assertEquals(driver.getCurrentUrl(),
				"https://www.adidas.fi/women-football-shoes");
	}

	// Test4 - Then user can select the second shown model and navigate to the
	// details page
	@Test(dependsOnMethods = { "test03MenuNavigation" })
	public void test04DetailsPage() {
		ItemsPage itemsPage = new ItemsPage(driver);
		DetailsPage detailsPage = itemsPage.clickMenuItem();

		assertEquals(detailsPage.getProductCategory(), "FOOTBALL");
		assertEquals(detailsPage.getProductTitle(), "MUNDIAL TEAM BOOTS");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
