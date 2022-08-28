package headless_Testing;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MSEdgeBrowserHeadlessMode {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		
		EdgeDriver driver = new EdgeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();

	}

}
