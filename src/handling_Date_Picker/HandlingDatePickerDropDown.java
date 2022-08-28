package handling_Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePickerDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
//		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select datepicker_month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		
		datepicker_month.selectByVisibleText("Apr");
		
//		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select datepicker_year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		
		datepicker_year.selectByVisibleText("1997");
		
		
		//DATE SELECTION
//		String date = "28";
//		
//		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//		
//		for(WebElement ele : allDates) {
//			
//			String dt = ele.getText();
//			
//			if(dt.equals(date))
//			{
//				ele.click();
//				break;
//			}
//			
//		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele : allDates) {
			
			
			if(ele.getText().equals("28"))
			{
				ele.click();
				break;
			}
			
		}

	}

}
