package Orangehrmdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Homedemo extends Driverdemo{
@Test

public void admin()
{
	driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
	driver.findElement(By.id("searchSystemUser_userType")).click();
	driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]/option[2]")).click();
	driver.findElement(By.id("searchSystemUser_status")).click();
	driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]/option[2]")).click();
	driver.findElement(By.id("searchBtn")).click();
}
}

