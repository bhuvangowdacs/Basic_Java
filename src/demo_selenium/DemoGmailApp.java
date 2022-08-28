package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGmailApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("bhuvancs29@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}
	

}
