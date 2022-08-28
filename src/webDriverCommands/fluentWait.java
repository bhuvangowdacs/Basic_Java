package webDriverCommands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	 // Waiting 30 seconds for an element to be present on the page, checking
	    // for its presence once every 5 seconds.
	    //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(Duration.ofSeconds(30L))
	        .pollingEvery(Duration.ofSeconds(5L))
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	      public WebElement apply(WebDriver driver) {
	        return driver.findElement(By.id("foo"));
	      }
	    });
	    foo.click();

	}

}
