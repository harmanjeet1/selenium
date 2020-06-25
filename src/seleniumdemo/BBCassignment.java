package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCassignment {
	WebDriver driver;
	String path;
	public void bbc()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		ArrayList<WebElement> a1 = (ArrayList<WebElement>)driver.findElements(By.className("block-link__overlay-link"));
	System.out.println(a1.size());
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i).getText());
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBCassignment bb = new BBCassignment();
		bb.bbc();
	}

}
