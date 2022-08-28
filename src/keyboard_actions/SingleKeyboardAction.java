package keyboard_actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).perform();

	}

}
