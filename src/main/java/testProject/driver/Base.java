package testProject.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public WebDriver driver = null;
	public ChromeDriver chromedriver;
	
	
	/*public WebDriver getDriver(){
		driver = new FirefoxDriver();
		return driver;
	}*/
	
	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumDr\\chromedriver_win32\\chromedriver.exe");
		chromedriver = new ChromeDriver();
		return chromedriver;
	}
	
	

}
