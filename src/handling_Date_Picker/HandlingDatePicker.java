package handling_Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//APPROACH 1: DIRECTLY USING SENDKEYS()
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/28/1997");
		
		
		//APPROACH 2: USING DATE PICKER
//		String year = "1997";
//		String month = "April";
//		String date = "28";
		
		String year = "2025";
		String month = "August";
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(yr.equals(year) && mon.equals(month))
			{
				break;
			}
			else
			{
//				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //PREVIOUS
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //NEXT
			}
		}
		
		//DATE SELECTION
		List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele : allDate)
		{
			String dt = ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}

	}

}
