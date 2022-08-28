
package webDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    //navigate().to()
		//driver.get("https://www.snapdeal.com/");
		//driver.navigate().to("https://www.snapdeal.com/");
	    
	    //navigate().back() & navigate().forward()
	    //driver.navigate().to("https://www.snapdeal.com/");
	    //driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    //driver.navigate().to("https://www.amazon.com/");
	    //Thread.sleep(3000);
	    //driver.navigate().back();
	    //driver.navigate().forward();
	    
	    //navigate().refresh()
	    //driver.navigate().to("https://www.snapdeal.com/");
	    //driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("mobile cover");
	    //driver.navigate().to("https://www.facebook.com/");
	    //driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("bbhuvangowda@gmail.com");
	    //driver.navigate().refresh();
	    
	    
	    //All in ONE
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    //driver.navigate().to("https://www.snapdeal.com/");
	    driver.navigate().to("https://www.amazon.com/");
	    //driver.navigate().back();
	    driver.navigate().back();
	    //driver.navigate().forward();
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
	    driver.navigate().refresh();
	    
	    
	    
	    
	    
		//driver.manage().window().maximize();

	}

}
