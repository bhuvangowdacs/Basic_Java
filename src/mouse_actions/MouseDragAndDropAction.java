package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		act.dragAndDrop(rome, italy).perform();
		
		WebElement washington = driver.findElement(By.id("box3"));
		
		WebElement usa = driver.findElement(By.id("box103"));
		
		act.dragAndDrop(washington, usa).perform();
		
		WebElement content = driver.findElement(By.xpath("//div[@id='dropContent']"));
		
		act.dragAndDrop(rome, content).perform();
		
		act.dragAndDrop(washington, content).perform();
	}

}
