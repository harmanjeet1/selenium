package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchdemo {
	WebDriver driver;
	String path,message;
	public void swi()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	//	driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
		//to switch the frame in a page
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("Deprecated")).click();
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("Actions")).click();
		driver.manage().window().maximize();
		//switching between pop-up windows
		driver.navigate().to("http://output.jsbin.com/usidix/1");
		
		driver.findElement(By.xpath("/html/body/input")).click();
		message=driver.switchTo().alert().getText();
		//waiting for sometime
		//Implicit wait - used to set the default waiting time throughout the program
		//Explicit wait - used to set the waiting time for a particular instance only
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//to close pop up window 
		driver.switchTo().alert().accept();
		System.out.println(message);
		//driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchdemo s = new Switchdemo();
        s.swi();
	
	}
}
