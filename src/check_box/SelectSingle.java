package check_box;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSingle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		

	}

}
