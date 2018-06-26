package tatoc_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.Cookie;

import junit.framework.Assert;

public class cookie_function {
	public cookie_function(WebDriver driver)
	{
	this.driver=driver;		
	}
	WebDriver driver; 
    

    
	public void cookie_launch()
	{
		driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(8)")).click();
	     String token = driver.findElement(By.cssSelector("#token")).getText();
		 String[] splited = token.split("\\s+");
	     Cookie name = new Cookie("Token", splited[1]);
		 driver.manage().addCookie(name);
		 driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(10)")).click();
		
	}
	
	public void cookie_navigate()
	{
		  driver.findElement(By.cssSelector("body > div > div.page > a:nth-child(10)")).click();
			String title = driver.getTitle();
			if (title.contains("end")) {
				Assert.assertTrue(true); }
	}

}

