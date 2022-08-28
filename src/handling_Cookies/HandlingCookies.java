package handling_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		//HOW TO PRINT COOKIES FROM A BROWSER
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies: "+cookies.size());
		
		
		//HOW TO PRINT COOKIES FROM BROWSER
		for(Cookie c : cookies)
		{
			System.out.println(c.getName()+" : "+c.getValue());
		}
		
		
		//HOW TO ADD A COOKIE TO THE BROWSER
		Cookie cookieObj = new Cookie("Mycookie","123456");
		
		driver.manage().addCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies after adding new cookie: "+cookies.size());
		
		for(Cookie c : cookies)
		{
			System.out.println(c.getName()+" : "+c.getValue());
		}
		
		
		//HOW TO DELETE SPECIFIC COOKIE FROM THE BROWSER
		driver.manage().deleteCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies after deletion: "+cookies.size());
		
		
		//HOW TO DELETE ALL COOKIES FROM BROWSER
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies after deleting all: "+cookies.size());

	}

}
