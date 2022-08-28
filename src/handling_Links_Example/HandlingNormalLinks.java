package handling_Links_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNormalLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		//CLICK ON THE LINK
		driver.findElement(By.linkText("Today's Deals")).click();
		
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//FIND THE NUMBER LINKS
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links: "+links.size());
		
		//TO PRINT ALL THE LINKS NAMES
		for(WebElement ele : links)
		{
			System.out.println(ele.getText());
		}

	}

}
