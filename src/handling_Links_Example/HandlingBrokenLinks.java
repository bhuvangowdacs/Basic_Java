package handling_Links_Example;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int brokenLinks = 0;
		
		for(WebElement element : allLinks)
		{
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
			}
			
			URL link = new URL(url);
			
			try {
				HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
				
				if(httpConn.getResponseCode()>=400)
				{
					System.out.println(httpConn.getResponseCode()+" "+url+" "+" is broken link");
				
				brokenLinks++;
				}
				
				else
				{
					System.out.println(httpConn.getResponseCode()+" "+url+" "+" is not broken link");
				}
			}
			
			catch(Exception e) {
				
			}
		}
		
		System.out.println("Number of broken links: "+brokenLinks);
		
		driver.quit();

	}

}
