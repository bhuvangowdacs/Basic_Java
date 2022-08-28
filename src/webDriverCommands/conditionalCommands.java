package webDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed() & isEnabled()
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Dispaly Status: "+searchStore.isDisplayed());
		
		System.out.println("Enable Status: "+searchStore.isEnabled());
		
		//isSelected()
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Selected Status: "+male.isSelected());
		
		System.out.println("Selected Status: "+female.isSelected());
		
		male.click();
		
		System.out.println("Selected Status: "+male.isSelected());
		
		System.out.println("Selected Status: "+female.isSelected());
		
		//female.click();
		
		//System.out.println("Selected Status: "+male.isSelected());
		
		//System.out.println("Selected Status: "+female.isSelected());
		

	}

}
