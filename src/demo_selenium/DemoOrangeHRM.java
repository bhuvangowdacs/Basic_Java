package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		//launch/open chrome browser
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//open/launch url-https://opensource-demo.Orangehrmlive.com/
		driver.get("https://opensource-demo.Orangehrmlive.com/");
		
		//enter username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.name("Submit")).click();
		
		//capture title of the home page
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify title of the home page
		if(title.equals("OrangeHRM")) {
			System.out.println("Login test passed");
		}
		else {
			System.out.println("Login test failed");
		}
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
	}

}
