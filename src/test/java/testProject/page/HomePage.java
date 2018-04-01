package testProject.page;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testProject.driver.Base;

public class HomePage extends Base {

	public WebDriver driver;

	public By menu = By.className("glass-header-bottom-desktop___3DFRT");
	public By menuWomen = By.cssSelector("[manual_cm_sp='header-_-Women']");
	public By logo = By.cssSelector(".column.column-logo a");
	public By menuWomenFootball = By
			.xpath("//*[@id='app']/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[9]/a");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLogo() {
		driver.findElement(logo).click();
	}

	public String getMenu() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(elementToBeClickable(menuWomen));

		return driver.findElement(menuWomen).getText();
	}

	public ItemsPage goMenuWomen() {
		mouseOver(menuWomen);

		// Wait until the element is clickable
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(elementToBeClickable(menuWomenFootball));

		driver.findElement(menuWomenFootball).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new ItemsPage(driver);
	}
	
	public void mouseOver(By element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(element)).build().perform();
	}

}
