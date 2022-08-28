package demo_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		System.out.println(sliders.size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

}
