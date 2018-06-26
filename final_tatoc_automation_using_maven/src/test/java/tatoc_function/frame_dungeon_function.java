package tatoc_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import junit.framework.Assert;

public class frame_dungeon_function {
	public frame_dungeon_function(WebDriver driver)
	{
		this.driver=driver;
	}
	
	WebDriver driver; 
	
	public void framelaunch()
	{
		driver.switchTo().frame("main");
		WebElement box1 = driver.findElement(By.id("answer"));
		String box1Color = box1.getAttribute("class");
	
		driver.switchTo().frame("child");
		WebElement box2 = driver.findElement(By.id("answer"));
		String box2Color = box2.getAttribute("class");
		
		System.out.println(box2Color);
		while(!box1Color.equals(box2Color)) {
			 driver.switchTo().parentFrame();
			 driver.findElement(By.linkText("Repaint Box 2")).click();
			 driver.switchTo().frame("child");
			  box2 = driver.findElement(By.id("answer"));
			 box2Color = box2.getAttribute("class");
			// System.out.println(box2Color);
		}
		driver.switchTo().parentFrame();
		 driver.findElement(By.linkText("Proceed")).click();
		 
		 
      }
   
//	public void frame_navigate()
//   {
//	   driver.findElement(By.cssSelector("body > center > a:nth-child(9)")).click();
//		String title = driver.getTitle();
//		if (title.contains("drag")) {
//			Assert.assertTrue(true); }
//   }

}
