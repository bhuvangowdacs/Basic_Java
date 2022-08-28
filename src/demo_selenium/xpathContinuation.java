package demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContinuation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='inputtext' or @name='email']")).sendKeys("bbhuvangowda@gmail.com");
		//driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']")).sendKeys("bbhuvangowda@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).sendKeys("9008570558@bs");
		//driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("9008570558@bs");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8' or @id='u_0_4_Wy']")).click();
		
		driver.findElement(By.xpath("//button[@name='login' or @type='submit']")).click();
		//driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
		
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M14 2.042c')]")).click();
	}

}
