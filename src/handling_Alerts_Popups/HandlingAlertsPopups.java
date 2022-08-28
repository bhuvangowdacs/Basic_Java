package handling_Alerts_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert myAlert = driver.switchTo().alert();
		
		System.out.println(myAlert.getText());
		
		myAlert.sendKeys("Welcome");
		
		myAlert.accept();
		
//		myAlert.dismiss();

	}

}
