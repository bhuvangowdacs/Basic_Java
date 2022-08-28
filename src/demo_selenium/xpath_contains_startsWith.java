package demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_startsWith {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@id,'query_top')]")).sendKeys("t shirt");
		driver.findElement(By.xpath("//*[starts-with(@name,'submit_')]")).click();
		driver.findElement(By.xpath("//a[text()='Women']")).click();
	}

}
