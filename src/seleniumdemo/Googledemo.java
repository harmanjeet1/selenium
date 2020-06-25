package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {
	WebDriver driver;
	String path;
	public void gg()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
