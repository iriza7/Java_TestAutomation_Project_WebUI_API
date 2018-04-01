package testProject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testProject.driver.Base;

public class ItemsPage extends Base {

	public WebDriver driver;

	public By menuItem2 = By
			.cssSelector("#hc-container .product-tile:nth-child(2) img");

	public ItemsPage(WebDriver driver) {
		this.driver = driver;
	}

	public DetailsPage clickMenuItem() {
		driver.findElement(menuItem2).click();
		return new DetailsPage(driver);
	}

}
