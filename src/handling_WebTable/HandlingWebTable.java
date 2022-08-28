package handling_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		
		
		//TO FIND NUMBER OF ROWS
		int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		
		System.out.println("Number of rows: "+rows);
		
		
		
		//TO FIND NUMBER OF COLUMNS
		int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		
		System.out.println("Number of columns: "+columns);
		
		
		
		//TO RETRIEVE THE SPECIFIC ROW/COULMMN DATA
		String value = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
		
		System.out.println("The value is: "+value);
		
		
		
		//TO RETRIEVE ALL THE DATA FROM WEB TABLE
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
				value = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"                  ");
			}
			System.out.println();
		}
	}

}
