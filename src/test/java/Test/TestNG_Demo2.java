package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
	}
	
	@Test
	public void googleSearch2() {
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		System.out.println("Test completed successfully2");
	}
	
	@Test
	public void googleSearch3() {
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		System.out.println("Test completed successfully3");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}

}
	
