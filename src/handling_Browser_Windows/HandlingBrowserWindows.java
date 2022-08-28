package handling_Browser_Windows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		String windowID = driver.getWindowHandle();
		
//		System.out.println(windowID);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Thread.sleep(5000);
		
		//driver.close();  ------  ORIGINAL TAB WILL BE CLOSED
		
		//driver.quit();   ------  ALL THE TABS WILL BE CLOSED
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		
		//APPROACH 1 ---- USING ARRAYLIST
		List<String> windowIDsList = new ArrayList(windowIDs);
		
		String parentWindowID = windowIDsList.get(0);
		
		String childeWindowID = windowIDsList.get(1);
		
		System.out.println("Parent window ID: "+parentWindowID);
		
		System.out.println("Child window ID: "+childeWindowID);
		
		driver.switchTo().window(childeWindowID);
		
		System.out.println("Title of the child page: "+driver.getTitle());
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("Title of the parent page: "+driver.getTitle());
		
		
		//APPROACH 2 ---- USING LOOPING STATEMENT
//		for(String winid : windowIDs)
//		{
//			System.out.println(winid);
//			
//			System.out.println(driver.switchTo().window(winid).getTitle());
//		}

	}

}
