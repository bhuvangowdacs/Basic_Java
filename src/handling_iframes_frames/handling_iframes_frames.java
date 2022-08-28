package handling_iframes_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_iframes_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();

	}

}
