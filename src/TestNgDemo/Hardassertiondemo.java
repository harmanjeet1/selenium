package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassertiondemo {
	WebDriver driver;
	String path,exptitle ="facebook";
/*@Test
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
		driver.navigate().to("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(),exptitle);//hard assertion(not allowing further code to run if assertion fails)
		System.out.println("hi");
}*/
	
	@Test
	public void launch()
	{
		SoftAssert ast = new SoftAssert();
		 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//automatically pick the path
			System.out.println(path);
			//setting key and path of chrome driver
			System.setProperty("webdriver.chrome.driver", path);
			//launching chrome browser
			driver= new ChromeDriver();
			//opening facebook app to test
			//driver.get("https://www.facebook.com/");//to launch application
			driver.navigate().to("https://www.facebook.com/");
			ast.assertEquals(driver.getTitle(),exptitle);//soft assertion (if code fails it skips the code  and runs further without printing failure message)
			System.out.println("hi");
	}
}
