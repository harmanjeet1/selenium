package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
WebDriver driver;
String path,title,exptitle="Facebook",url,pagesource;

public void launch()
{
	
	//System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	//Setting path through get property method and placing it in path variable 
 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//automatically pick the path
	System.out.println(path);
	//setting key and path of chrome driver
	System.setProperty("webdriver.chrome.driver", path);
	//launching chrome browser
	driver= new ChromeDriver();
	//opening facebook app to test
	//driver.get("https://www.facebook.com/");//to launch application
	driver.navigate().to("https://www.facebook.com/");
	//driver.navigate().refresh();
	//driver.navigate().back();
	driver.navigate().forward();
	title=driver.getTitle();
	System.out.println("title of the page "+title);
	if(title.equals(exptitle))
	{
		System.out.println("you are landing on correct page");
	}
	else
	{
		System.out.println("incorrect page");
		System.out.println("correct title is "+title);
	}
	//driver.findElement(By.xpath("//input[@ id='u_0_m']")).sendKeys("anu");
	//driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
	
	url=driver.getCurrentUrl();
	System.out.println("current url is "+url);
	//pagesource= driver.getPageSource();
	//System.out.println(pagesource);
	//driver.close();//closing current page
	//driver.quit();//closing all pages 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Launch l = new Launch();
l.launch();
	}

}
