package handling_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//SCREENSHOT OF FULL PAGE ------ HOMEPAGE.PNG
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File trg = new File(System.getProperty("user.dir")+"\\screenshots\\homepage.png");
//		
//		FileUtils.copyFile(src, trg);
		
		
		//SCREENSHOT OF SECTION OF THE PAGE ------ FEATUREDPRODUCT.PNG
//		WebElement pageSection = driver.findElement(By.xpath("//div[@id='nivo-slider']"));
//		
//		File src = pageSection.getScreenshotAs(OutputType.FILE);
//		
//		File trg = new File(System.getProperty("user.dir")+"\\screenshots\\featuredProduct.png");
//		
//		FileUtils.copyFile(src, trg);
		
		
		//SCREENSHOT OF ELEMENT OF THE PAGE ------ LOGO.PNG
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		
		File trg = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		
		FileUtils.copyFile(src, trg);
		
	}

}
