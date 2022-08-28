package headless_Testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadlessMode {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();

	}

}
