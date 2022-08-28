package practice_Scripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("bbhuvangowda@gmail.com");

		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("9008570558@bs");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='u_0_4_Ld' or @class='_9lsb _9ls8']")).click();

		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

//		Alert myAlert = driver.switchTo().alert();
//		
//		System.out.println(myAlert.getText());
//		
//		myAlert.dismiss();

		Actions act = new Actions(driver);

		Thread.sleep(10000);

		act.sendKeys(Keys.ESCAPE);

		act.perform();

		WebElement search = driver.findElement(By.xpath(
				"//div[@class='rq0escxv byvelhso q10oee1b poy2od1o j9ispegn kr520xx4 ooia0uwo kavbgo14 mhnrfdw6']//div//input[@placeholder='Search Facebook']"));

		search.click();

		search.sendKeys("Shreyas Jain");

		act.sendKeys(Keys.ENTER);

		act.perform();

		driver.findElement(By.xpath("//span[contains(text(),'Message')]")).click();

		driver.findElement(By.xpath("//p[@class='kvgmc6g5 oygrvhab']")).sendKeys("POOS RANDE JAINA");

		driver.findElement(By.xpath("//div[@aria-label='Press enter to send']")).click();

	}

}
