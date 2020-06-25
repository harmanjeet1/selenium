package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
String path;
path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
//ArrayList<WebElement> al = (ArrayList<WebElement>) driver.findElements(By.tagName("img"));
ArrayList<WebElement> al = (ArrayList<WebElement>) driver.findElements(By.cssSelector("#hplogo"));
System.out.println("no of images are"+al.size());
ArrayList<WebElement> a1 = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
System.out.println("no of links are"+a1.size());
for(int i=0;i<a1.size();i++)
{
	System.out.println(a1.get(i).getText());
	//System.out.println(a1.get(i).getAttribute("href"));
}
	}

}
