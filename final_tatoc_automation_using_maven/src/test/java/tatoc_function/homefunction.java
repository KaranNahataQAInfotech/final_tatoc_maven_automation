
package tatoc_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import junit.framework.Assert;

public class homefunction 
{
	public homefunction(WebDriver driver)
	{
		this.driver=driver;
	}
	
	WebDriver driver;
	
	public void validate_launch()
    {
	    
     Assert.assertEquals(driver.findElement(By.className("title")).isDisplayed(), true); 
    }

    public void validate_navigation()
    {
     driver.findElement(By.cssSelector("a")).click();
     Assert.assertEquals(driver.findElement(By.cssSelector("body > div > div.page > h1")).isDisplayed(), true); 
    }
    
}


