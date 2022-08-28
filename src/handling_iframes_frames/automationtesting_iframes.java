package handling_iframes_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtesting_iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
		
		driver.switchTo().frame(innerFrame);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		

	}

}
