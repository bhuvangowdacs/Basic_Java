package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSeleWeb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/downloads/");
		//driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a")).click();
		//driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.partialLinkText("Proj")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
