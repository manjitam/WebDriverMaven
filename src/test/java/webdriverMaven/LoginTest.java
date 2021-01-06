package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Prerequisites\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		driver.get("https://app.simplicity.kiwi/login");
		driver.findElement(By.id("email")).sendKeys("manjitam@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abcd");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
