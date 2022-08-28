package handling_Scrolling_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//1.SCROLL DOWN PAGE BY PIXEL
//		js.executeScript("window.scrollBy(0,3000)","");
//		
//		long value = (Long)js.executeScript("return window.pageYOffset;");
//		
//		System.out.println("Number of pixels moved: "+value);
		
		
		//2.SCROLL DOWN PAGE TILL THE ELEMENT IS VISIBLE
//		WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", flag);
//		
//		long value = (Long)js.executeScript("return window.pageYOffset;");
//		
//		System.out.println("Number of pixels moved: "+value);
		
		
		//3.SCROLL DOWN PAGE TILL END
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		long value = (Long)js.executeScript("return window.pageYOffset;");
		
		System.err.println("Number of pixels moved: "+value);

	}

}
