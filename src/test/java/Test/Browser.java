package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("http://google.com");
//		String originalWindow = driver.getWindowHandle();
//		driver.navigate().to(("http://automationstepbystep.com"));
//		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().window(originalWindow);
//		System.out.println(driver.getTitle());
		
//		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		driver.switchTo().frame("packageFrame");
//		driver.findElement(By.linkText("Action")).click();
//		driver.switchTo().defaultContent();
		
//		driver.manage().window().getSize().getHeight();
//		driver.manage().window().getSize().getWidth();
//		
//		Dimension size = driver.manage().window().getSize();
//		int height = size.getHeight();
//		int width = size.getWidth();
//		System.out.println(height);
//		System.out.println(width);
//		
//		driver.manage().window().setSize(new Dimension(800, 600));
//		
//		
//		driver.manage().window().getPosition().getX();
//		driver.manage().window().getPosition().getY();
//		
//		Point point = driver.manage().window().getPosition();
//		int posX = point.getX();
//		int posY = point.getY();
//		System.out.println(posX);
//		System.out.println(posY);
//		
//		driver.manage().window().setPosition(new Point(0, 0));
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
//		
//		driver.manage().window().fullscreen();
		
//		File srcFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("./image1.png"));
//		
//		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
//		File srcFile1 = element.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile1, new File("./image2.png"));	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button = driver.findElement(By.name(("btnI")));
		js.executeScript("arguments[0].click();", button);
		js.executeScript("console.log('Hello World');");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
