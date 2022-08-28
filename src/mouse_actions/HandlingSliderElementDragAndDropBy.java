package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSliderElementDragAndDropBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_Slider = driver.findElement(By.xpath("//span[1]"));
		
		WebElement max_Slider = driver.findElement(By.xpath("//span[2]"));//div[@id='slider-range']
		
		System.out.println(min_Slider.getLocation());
		
		System.out.println(max_Slider.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_Slider, 100, 0).perform();
		
		act.dragAndDropBy(max_Slider, -40, 0).perform();
		
		System.out.println(min_Slider.getLocation());
		
		System.out.println(max_Slider.getLocation());
	}

}
