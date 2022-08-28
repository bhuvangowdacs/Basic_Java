package launching_MSEdgeBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingMSEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers_list/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

	}

}
