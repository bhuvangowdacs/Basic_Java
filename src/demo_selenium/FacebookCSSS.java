package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		//tag and id:-
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("pentagonspace@gmail.com");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("pentagonspace");
		//OR
		//driver.findElement(By.cssSelector("#email")).sendKeys("pentagonspace@gmail.com");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("pentagonspace");
		
		
		//tag and class:-
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("pentagonspace@gmail.com");
		//OR
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("pentagonspace@gmail.com");
		
		
		//tag and attribute:-
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("pentagonspace@gmail.com");
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("pentagonspace");
		//OR
		//driver.findElement(By.cssSelector("[name='email']")).sendKeys("pentagonspace@gmail.com");
		//driver.findElement(By.cssSelector("[name='pass']")).sendKeys("pentagonspace");
		
		
		//tag, class and attribute:-
		
		//driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("pentagonspace@gmail.com");
		//driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_pass']")).sendKeys("pentagonspace");
		//OR
		driver.findElement(By.cssSelector(".inputtext[data-testid='royal_email']")).sendKeys("pentagonspace@gmail.com");
		driver.findElement(By.cssSelector(".inputtext[data-testid='royal_pass']")).sendKeys("pentagonspace");
		//driver.findElement(By.name("login")).click();

	}

}
