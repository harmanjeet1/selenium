package TestNGapp;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class logintest extends Driver {
	String actualtitle,exptitle="orange";
	@Test(groups= {"Smoke"})
	public void checktitle()
	{
		actualtitle=driver.getTitle();
		if(exptitle.equals(actualtitle))
		{
			System.out.println("you are on correct page");
		}
		else
		{
			System.out.println("you are not on correct page");
		}
	}
@Test(groups= {"Smoke"})
public void login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).submit();
	
}
@Test(groups= {"sanity"})
public void logout()
{
	System.out.println("logout");
}
@Test(groups= {"sanity"})
public void check()
{
	System.out.println("check ascending condition");
}
}
