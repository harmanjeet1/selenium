package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static WebDriver driver;
	public static String path;
	@BeforeSuite(groups= {"Smoke"})
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
	@AfterSuite(groups= {"Sanity"})
	public void close_browser()
	{
		driver.close();
	}
}
