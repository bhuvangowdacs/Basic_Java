package check_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers_list/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://itera-qa.azurewebsites.net/home/automation");
	    
	    driver.manage().window().maximize();
	    
	    //(1)SELECT SINGLE CHECK BOX
//	    driver.findElement(By.xpath("//*[@id='sunday']")).click();
	    
	    
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
	    System.out.println(checkboxes.size());
	    
	    
	    //(2)SELECT ALL THE CHECK BOXES
	    //FOR LOOP
//	    for(int i=0; i<checkboxes.size(); i++)
//	    {
//	    	checkboxes.get(i).click();
//	    }
	    
	    //FOR EACH LOOP
//	    for(WebElement ele : checkboxes)
//	    {
//	    	ele.click();
//	    }
	    
	    
	    //(3)SELECT MULTIPLE CHECK BOXES BASED ON REQUIREMENT
//	    for(WebElement ele : checkboxes)
//	    {
//	    	String value = ele.getAttribute("id");
//	    	if(value.equals("monday") || value.equals("thursday") || value.equals("sunday"))
//	    	{
//	    		ele.click();
//	    	}
//	    }
	    
	    //(4)SELECT LAST TWO CHECK BOXES
//	    for(int i=checkboxes.size()-2; i<checkboxes.size(); i++)
//	    {
//	    	checkboxes.get(i).click();
//	    }
	    
	    
	    //(5)SELECT FIRST TWO CHECK BOXES
//	    for(int i=0; i<checkboxes.size()-(checkboxes.size()-2); i++)
//	    {
//	    	//if(i<2)
//	    	//{
//	    		checkboxes.get(i).click();
//	    	//}
//	    }
	    
	    //(6)CLEARING THE CHECK BOXES
	    for(WebElement ele : checkboxes)
	    {
	    	ele.click();
	    }
	    
	    for(WebElement ele : checkboxes)
	    {
	    	if(ele.isSelected())
	    	{
	    		ele.click();
	    	}
	    }
	}

}
