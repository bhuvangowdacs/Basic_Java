package handling_upload_file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadFile {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/");
		
		
		//USING SENDKEYS()
//		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\bbhuv\\OneDrive\\Desktop\\Resume\\Bhuvan C S.pdf");
		
		
		//USING ROBOT CLASS
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@id='file-upload']")));
		
		//COPY
		//CTRL+V
		//PRESS ENTER KEY
		
		//PUT PATH OF THE FILE IN A CLIP BOARD
		StringSelection ss = new StringSelection("C:\\Users\\bbhuv\\OneDrive\\Desktop\\Resume\\Bhuvan C S.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//ROBOT CLASS
		Robot rb = new Robot();
		
		rb.delay(3000);
		
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
