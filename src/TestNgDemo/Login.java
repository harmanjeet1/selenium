package TestNgDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Driver {
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
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
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
