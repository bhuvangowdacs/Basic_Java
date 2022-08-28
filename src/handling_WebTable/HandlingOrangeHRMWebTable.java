package handling_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOrangeHRMWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.linkText("Admin")).click();
		
		driver.findElement(By.linkText("User Management")).click();
		
		driver.findElement(By.linkText("Users")).click();
		
		
		int rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		int count = 0;
		
		for(int r=1; r<=rows; r++)
		{
			String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++;
			}
		}
		
//		System.out.println("Number of enabled users: "+count);
//		System.out.println("Number of disabled users: "+(rows-count));
		
		driver.findElement(By.linkText("Next")).click();
		
		Thread.sleep(3000);
		
		int rows2 = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		for(int r=1; r<=rows2; r++)
		{
			String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++;
			}
		}
		
		System.out.println("Total number of users: "+(rows+rows2));
		System.out.println("Number of enabled users: "+count);
		System.out.println("Number of disabled users: "+((rows+rows2)-count));
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name, 'chkSelect')]"));
		
		for(int i=checkboxes.size()-5; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
	}

}
