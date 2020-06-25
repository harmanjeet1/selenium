package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btesassignment {
	WebDriver driver;
	String path;
	public void btes()
	{
		
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.navigate().to("https://www.btes.co.in/");
		driver.manage().window().maximize();
		System.out.println("Title of the page is:- " +driver.getTitle());
		driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[2]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/header[2]/div/nav/ul/li[5]/a[1]")).click();
		driver.findElement(By.cssSelector("body > header.site-header > div > nav > ul > li:nth-child(5) > ul > li:nth-child(2) > a")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Btesassignment b = new Btesassignment();
		b.btes();
	}

}
