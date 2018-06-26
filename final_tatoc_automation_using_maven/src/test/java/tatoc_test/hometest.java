package tatoc_test;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tatoc_function.cookie_function;
import tatoc_function.drag_drop_function;
import tatoc_function.frame_dungeon_function;
import tatoc_function.grid_gate_function;
import tatoc_function.homefunction;
import tatoc_function.window_function;

public class hometest
{
	
WebDriver driver=new ChromeDriver();
homefunction objtest;
grid_gate_function objtest1;
frame_dungeon_function objtest2;
drag_drop_function objtest3;
window_function objtest4;
cookie_function objtest5;

@BeforeClass
public void define()
{
	 driver.get("http://10.0.1.86/tatoc");
	}

@Test
public void Launch_Test01()
{
objtest=new homefunction(driver);
objtest.validate_launch();
}

@Test(dependsOnMethods = {"Launch_Test01"})
public void Launch_Test02()
{
objtest.validate_navigation();
}

@Test(dependsOnMethods = {"Launch_Test02"})
public void visiblegreenbox()
{
	objtest1=new grid_gate_function(driver);
    objtest1.visibleredbox();
}

@Test(dependsOnMethods = {"visiblegreenbox"})
public void visibleredbox()
{
	objtest1.visiblegreenbox();
}

@Test(dependsOnMethods = {"visibleredbox"})
public void validategreenbox()
{
	objtest1.validategreenboxclick();
}

@Test(dependsOnMethods = {"validategreenbox"})
public void framelaunch()
{
	objtest2=new frame_dungeon_function(driver);
    objtest2.framelaunch();
}

@Test(dependsOnMethods = {"framelaunch"})
public void dragdropsucess()
 {objtest3=new drag_drop_function(driver);
    objtest3.dragdropsucess();
}

@Test(dependsOnMethods = {"dragdropsucess"})
public void drag_drop_navigate()
{
    objtest3.drag_drop_navigate();
}

@Test(dependsOnMethods = {"drag_drop_navigate"})
public void window_action()
{
    objtest4=new window_function(driver);
	objtest4.window_action();
}

@Test(dependsOnMethods = {"window_action"})
public void window_navigate()
{
    objtest4.window_navigate();
}

@Test(dependsOnMethods = {"window_action"})
public void cookie_launch()
{
	objtest5=new cookie_function(driver);
    objtest5.cookie_launch();
}

@Test(dependsOnMethods = {"window_action"})
public void cookie_navigate()
{
	objtest5.cookie_navigate();
}

}

