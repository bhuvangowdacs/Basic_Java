package handling_Drop_Down_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement drop_country = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select dropButton = new Select(drop_country);
		
		//SELECT OPTION FROM DROPDOWN
		dropButton.selectByVisibleText("Iceland");
		Thread.sleep(5000);
		
		dropButton.selectByValue("96");
		Thread.sleep(5000);
		
		dropButton.selectByIndex(81);
		
		//FINDING THE NUMBER OF OPTIONS
		List<WebElement> all_options = dropButton.getOptions();
		System.out.println(all_options.size());
		
		//CAPTURE ALL THE OPTIONS AND PRINT THE OPTIONS
		for(WebElement options : all_options)
		{
			System.out.println(options.getText());
		}
		
//		for(int i=0; i<all_options.size(); i++)
//		{
//			System.out.println(all_options.get(i).getText());
//		}
		
		//SELECTING OPTION WITHOUT BUILT IN METHODS
		for(WebElement options : all_options)
		{
			if(options.getText().equals("Austria"))
			{
				options.click();
				break;
			}
		}

	}

}
