package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.id("search_query_top")).sendKeys("t shirt");
	driver.findElement(By.name("submit_search")).click();
	driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	//driver.findElement(By.partialLinkText("Chiffon Dress")).click();
	driver.close();
	}

}
