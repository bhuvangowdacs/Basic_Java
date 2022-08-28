package keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		WebElement inputTextfield1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
//		WebElement inputTextfield2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
		
		inputTextfield1.sendKeys("Hi Bhuvan Hope You're Doing Well");
		
		Actions act = new Actions(driver);
		
		//CTRL+A -------> TO SELECT ALL THE TEXT
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL+C -------> TO COPY THE TEXT
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB ------> TO SWITCH TO NEXT TEXTFIELD
		act.sendKeys(Keys.TAB);
		act.perform();
		
//		inputTextfield2.click();
		
		
		//CTRL+V -------> TO PASTE THE COPIED TEXT
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		

	}

}
