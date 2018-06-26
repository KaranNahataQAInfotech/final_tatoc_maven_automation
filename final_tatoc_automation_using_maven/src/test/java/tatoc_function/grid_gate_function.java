package tatoc_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class grid_gate_function {

	public grid_gate_function(WebDriver driver)
	{
	this.driver=driver;		
	}
	WebDriver driver; 
	
	public WebElement visiblegreenbox()
	{
		 Assert.assertEquals(driver.findElement(By.className("greenbox")).isDisplayed(), true); 
		 return driver.findElement(By.className("greenbox"));
	}
	public void visibleredbox() {
		
		 Assert.assertEquals(driver.findElement(By.className("redbox")).isDisplayed(), true); 
		
	}
	
	public void validategreenboxclick()
	{
		System.out.println(driver.findElement(By.className("greenbox")).isSelected());
		
		
	}
	
}
