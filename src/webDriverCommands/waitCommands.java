package webDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //WAIT TIME
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.RETURN); //TO PERFORM ENTER ACTION ON KEYBOARD
	}

}
