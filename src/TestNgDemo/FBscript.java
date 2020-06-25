package TestNgDemo;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FBscript {
	public static WebDriver driver;
	public static String path;
	@BeforeSuite
	public void launch()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//automatically pick the path
			System.out.println(path);
			//setting key and path of chrome driver
			System.setProperty("webdriver.chrome.driver", path);
			//launching chrome browser
			driver= new ChromeDriver();
			//opening facebook app to test
			//driver.get("https://www.facebook.com/");//to launch application
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://www.facebook.com/");
	
	}
	@Test
	public void fb() throws InterruptedException
	{
	/*	ArrayList<WebElement> a = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+a.size());
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).getText());
		}*/
		ArrayList<WebElement> aa = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li/a"));
		System.out.println("no of links present in footer are "+aa.size());
		for(int i=0;i<aa.size();i++)
		{
			System.out.println(aa.get(i).getText());
			String href= aa.get(i).getAttribute("href");
			System.out.println(href);
			Thread.sleep(2000);
			driver.navigate().to(href);
			driver.navigate().back();
		}
	
		
	}
	/*@AfterSuite
	public void rr()
	{
		driver.close();
	}*/
}
