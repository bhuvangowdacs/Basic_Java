package demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoNOPComm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();

		//driver.findElement(By.cssSelector(".navigation-top-menu-item")).click();
		//driver.findElement(By.className("navigation-top-menu-label")).click();
		//driver.findElement(By.xpath("//span[@class='user-actions-ico']")).click();
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.cssSelector("a[href='/en/login?returnUrl=%2Fen%2Fpartners']")).click();
		//driver.findElement(By.xpath("//span[@class='navigation-top-menu-label'][36]")).click();
		//driver.findElement(By.cssSelector("span path")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[7]/header/nav/div[2]/a/img")).click();
		
		driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Bhuvan");
		driver.findElement(By.id("LastName")).sendKeys("C S");
		driver.findElement(By.id("Email")).sendKeys("bbhuvangowda@gmail.com");
		driver.findElement(By.id("ConfirmEmail")).sendKeys("bbhuvangowda@gmail.com");
		driver.findElement(By.name("Username")).sendKeys("bhuvancs");
		driver.findElement(By.xpath("//input[@id='check-availability-button']")).click();
		driver.findElement(By.xpath("//select[@id='CountryId']")).click();

	}

}
