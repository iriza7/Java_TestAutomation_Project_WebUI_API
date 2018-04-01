package testProject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {

	public WebDriver driver;

	public By productCategory = By
			.cssSelector(".product_category___2txJk.light div");

	public By productTitle = By.cssSelector("[data-auto-id='product-title']");

	public DetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getProductCategory() {
		return driver.findElement(productCategory).getText();
	}

	public String getProductTitle() {
		return driver.findElement(productTitle).getText();
	}

}
