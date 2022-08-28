package headless_Testing;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserHeadlessMode {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();


	}

}
