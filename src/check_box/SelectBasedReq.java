package check_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectBasedReq {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println(checkboxes.size());
		
		for(WebElement ele : checkboxes)
		{
			String value = ele.getAttribute("id");
			if(value.equals("tuesday") || value.equals("thursday") || value.equals("saturday"))
			{
				ele.click();
			}
		}
		
//		for(int i=0; i<checkboxes.size(); i++)
//		{
//			String value = checkboxes.get(i).getAttribute("id");
//			if(value.equals("tuesday") || value.equals("thursday") || value.equals("saturday"))
//			{
//				checkboxes.get(i).click();
//			}
//		}

	}

}
