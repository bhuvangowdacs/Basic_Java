package check_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearingCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println(checkboxes.size());
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		for(int i=0; i<checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
		for(WebElement ele : checkboxes)
		{
			ele.click();
		}
		
		for(WebElement ele : checkboxes)
		{
			if(ele.isSelected()) {
				ele.click();
			}
		}

	}

}
