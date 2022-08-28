package demo_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		/*driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.naukri.com/");
		driver.get("https://www.linkedin.com/");
		driver.get("https://www.monster.com/");*/
		driver.get("https://www.cricbuzz.com/");
	}

}
