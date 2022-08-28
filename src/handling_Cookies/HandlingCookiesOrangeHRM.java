package handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookiesOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies: "+cookies.size());
		
		for(Cookie c : cookies)
		{
			System.out.println(c.getName()+" : "+c.getValue());
		}
		
	}

}
