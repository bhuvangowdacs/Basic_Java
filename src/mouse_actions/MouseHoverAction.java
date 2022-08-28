package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		WebElement desktopMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement macMenuItem = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//MOUSE HOVER ACTION
		Actions act = new Actions(driver);
		act.moveToElement(desktopMenu).moveToElement(macMenuItem).click().perform();


	}

}
