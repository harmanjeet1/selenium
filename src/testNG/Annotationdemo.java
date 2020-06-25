package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo {
	@BeforeClass
	public void acc()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void decc()
	{
		System.out.println("after class");
	}
	@BeforeMethod
	public void ecc()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void dum()
	{
		System.out.println("after method");
	}
  
WebDriver driver;
String path,exptitle="OrangeHRM",actualtitle;
@BeforeSuite
public void launch()
{
	/* path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//automatically pick the path
		System.out.println(path);
		//setting key and path of chrome driver
		System.setProperty("webdriver.chrome.driver", path);
		//launching chrome browser
		driver= new ChromeDriver();
		//opening facebook app to test
		//driver.get("https://www.facebook.com/");//to launch application
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().back();*/
		System.out.println("before suite");
}
@BeforeTest
public void bfest()
{
	System.out.println("before test");
}
@AfterTest
public void atest()
{
	System.out.println("after test");
}
@Test
public void checktitle()
{
	/*actualtitle=driver.getTitle();
	if(exptitle.equals(actualtitle))
	{
		System.out.println("you are on correct page");
	}
	else
	{
		System.out.println("you are not on correct page");
	}*/
	System.out.println("test method 1");
}
@Test
public void login()
{
	//driver.findElement(By.id("txtUsername")).sendKeys("admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin");
	System.out.println("test method 2");
}
@AfterSuite
public void close_browser()
{
	//driver.close();
	System.out.println("after suite");
}
}
