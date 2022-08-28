package handling_Tabs_And_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsAndWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//OPENING LINK IN ANOTHER TAB ------> ALL VERSIONS OF SELENIUM WEBDRIVER
//		driver.get("https://demo.nopcommerce.com/");
//		
//		String regLink = Keys.chord(Keys.CONTROL, Keys.RETURN);
//		
//		driver.findElement(By.linkText("Register")).sendKeys(regLink);
		
		
		//OPENING WEBPAGES IN NEW TAB ------> SELENIUM WEBDRIVER VERSION 4 AND ABOVE
//		driver.get("https://www.opencart.com/");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("https://www.orangehrm.com/");
		
		
		//OPENING WEBPAGES IN NEW WINDOW ------> SELENIUM WEBDRIVER VERSION 4 AND ABOVE
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.orangehrm.com/");

	}

}
