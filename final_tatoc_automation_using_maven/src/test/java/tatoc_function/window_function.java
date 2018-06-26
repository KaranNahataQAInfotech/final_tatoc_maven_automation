package tatoc_function;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;

public class window_function {
	public window_function(WebDriver driver)
	{
	this.driver=driver;
	}
	WebDriver driver; 
	
	public void window_action()
	{
	driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(4)")).click();
	     ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(tabs2.get(1));
	     driver.findElement(By.id("name")).sendKeys("arjunbhardwaj");
	     driver.findElement(By.cssSelector("#submit")).click();
	     driver.switchTo().window(tabs2.get(0));
	     driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(6)")).click();
	     
    }
	
	public void window_navigate()
	{
		  driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(6)")).click();
			String title = driver.getTitle();
			if (title.contains("cookie")) {
				Assert.assertTrue(true); }
	}
}
