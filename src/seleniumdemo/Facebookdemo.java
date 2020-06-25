package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebookdemo {
	WebDriver driver;
	String path,title,exptitle="Facebook",url;
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
		//driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("firstname")).sendKeys("harman");
		driver.findElement(By.name("lastname")).sendKeys("Kaur");
		driver.findElement(By.id("u_0_r")).sendKeys("5623687545");
		driver.findElement(By.id("u_0_w")).sendKeys("harman");
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByValue("26");
		Select s2=new Select(driver.findElement(By.id("month")));
		//s2.selectByIndex(2);
		s2.selectByVisibleText("Feb");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByValue("1998");
		driver.findElement(By.id("u_0_z")).click();
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.id("u_0_13")).click();
		driver.navigate().back();
		
		//url=driver.getCurrentUrl();
		//System.out.println("current url is "+url);
		//driver.close();//closing current page
		//driver.quit();//closing all pages 
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Facebookdemo oo= new Facebookdemo();
     oo.launch();
		}

	}

