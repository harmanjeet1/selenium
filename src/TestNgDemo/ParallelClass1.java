package TestNgDemo;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelClass1 {
	WebDriver driver;
	String path;
	@Test
	public void par()
	{
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//automatically pick the path
		System.out.println(path);
		//setting key and path of chrome driver
		System.setProperty("webdriver.chrome.driver", path);
		//launching chrome browser
		driver= new ChromeDriver();
		//opening facebook app to test
		//driver.get("https://www.facebook.com/");//to launch application
		driver.navigate().to("https://www.facebook.com/");
}
}
