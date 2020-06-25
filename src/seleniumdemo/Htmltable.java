package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltable {
	WebDriver driver;
	String path;
	public void ge()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kaler/Desktop/table.html");
		ArrayList<WebElement> a1 = (ArrayList<WebElement>) driver.findElement(By.tagName("tr"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText());
		}
		driver.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Htmltable h = new Htmltable();
		h.ge();
	}

}
