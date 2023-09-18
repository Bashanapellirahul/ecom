package Ecommerce;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.utility.ScreenShot;

public class EcommerceWebsitePractice {
	
	WebDriver driver;
	@BeforeTest
	public void startWebApplication() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulbashanapelli/Desktop/seleniumJAR/chromedriver-mac-arm64/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		ScreenShot.scrnshot(driver, "Launching url");
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
	}
	
	
	@Test
	
	public void addToCartButton() throws InterruptedException, IOException {
		
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@data-test='username']"));
		
		Thread.sleep(2000);
		userName.sendKeys("standard_user");
		ScreenShot.scrnshot(driver, "Entering_user_name");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-test='password']"));
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		ScreenShot.scrnshot(driver, "Entering_password");
		Thread.sleep(2000);
		
		WebElement clickOnButton = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOnButton.click();
		
		WebElement addToBag = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		Thread.sleep(2000);
		addToBag.click();
		ScreenShot.scrnshot(driver, "clicking_on_product");
		
		WebElement clickOnCartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Thread.sleep(2000);
		clickOnCartButton.click();
		ScreenShot.scrnshot(driver, "Clicking_on_shopping_cart_link");
		
		WebElement checkOutElement = driver.findElement(By.xpath("//button[@id='checkout']"));
		Thread.sleep(2000);
		checkOutElement.click();
		ScreenShot.scrnshot(driver, "checkingOut");
		
		WebElement firstnameField = driver.findElement(By.id("first-name"));
		Thread.sleep(2000);
		firstnameField.sendKeys("Rahul");
		ScreenShot.scrnshot(driver, "Entering_First_name");
		
		WebElement lastnameField = driver.findElement(By.id("last-name"));
		Thread.sleep(2000);
		lastnameField.sendKeys("Bashanapelli");
		ScreenShot.scrnshot(driver, "Entering_last_name");
		
		WebElement ZipCodeField = driver.findElement(By.id("postal-code"));
		Thread.sleep(2000);
		ZipCodeField.sendKeys("07305");
		ScreenShot.scrnshot(driver, "entering_zip_code");
		
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		Thread.sleep(2000);
		ContinueButton.click();
		ScreenShot.scrnshot(driver, "clicking_On_continue_button");
		
		WebElement FinishButton = driver.findElement(By.id("finish"));
		Thread.sleep(2000);
		FinishButton.click();
		ScreenShot.scrnshot(driver, "Clicking_on_finish_button");
		
		WebElement BackToProductButton = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		Thread.sleep(2000);
		BackToProductButton.click();
		ScreenShot.scrnshot(driver, "clicking_On_back-to-products_button");
		Thread.sleep(2000);
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	

}
