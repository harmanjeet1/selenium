package Orangehrmdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logindemo extends Driverdemo{
	
	
	
	
	
	@Test
	
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		
	}
}
