package practice_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailValidation {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./drivers_list/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.id("identifierId")).sendKeys("dj20011997@gmail.com");
		
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
		driver.findElement(By.name("password")).sendKeys("9008570558@Bs");


	}

}
