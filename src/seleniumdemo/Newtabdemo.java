package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtabdemo {
	WebDriver driver;
	String path;
	public void tab()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));//switches to new tab
		driver.get("https://www.bbc.com/");
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(2));//switches to new tab
		driver.get("https://www.btes.co.in/");
		
	}
public static void main(String args[])
{
	Newtabdemo nt = new Newtabdemo();
	nt.tab();
}
}
