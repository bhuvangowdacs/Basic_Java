package webDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //CUT-OFF TIME
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
	    
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.RETURN); //TO PERFORM ENTER ACTION ON KEYBOARD
	    
	    WebElement ele = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
	    
	    ele.click();

	}

}
