package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	public static WebDriver driver;
	public static String path;
	@BeforeClass
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
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
@DataProvider(name="Checklogin")
public Object[][] Authenticate()
{
	Object[][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="ad";
	
	arr[1][0]="pass";
	arr[1][1]="pass123";
	
	arr[2][0]="123demo";
	arr[2][1]="demo";
	
	return arr;
}
@Test(dataProvider = "Checklogin")
public void login(String uname,String pass)
{
	//System.out.println("username is "+uname+" password is "+pass);
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).submit();
	driver.navigate().back();
	driver.findElement(By.id("txtUsername")).clear();
}

}
