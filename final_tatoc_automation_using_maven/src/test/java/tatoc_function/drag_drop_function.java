package tatoc_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class drag_drop_function {
	public drag_drop_function(WebDriver driver)
	{
	this.driver=driver;		
	}
	WebDriver driver; 

	private WebElement getDropBox() {
		return driver.findElement(By.id("dropbox"));
	}

	private WebElement getDragBox() {
		return driver.findElement(By.id("dragbox"));
	}

	public void dragdropsucess() {
		Actions act = new Actions(driver);
		act.dragAndDrop(getDragBox(), getDropBox()).build().perform();	
	 }
	

		public void drag_drop_navigate()
		   {
			dragdropsucess();
			driver.findElement(By.linkText("Proceed")).click();
				String title = driver.getTitle();
				if (title.contains("windows")) {
					Assert.assertTrue(true); }
		   }
	
}
