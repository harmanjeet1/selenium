package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukridemo {
	WebDriver driver;
	String path;
	public void ndemo() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(By.id("qsbClick")).click();
		driver.findElement(By.name("qp")).sendKeys("java");
		driver.findElement(By.name("ql")).sendKeys("chandigarh");
		driver.findElement(By.xpath("//*[@id=\"exp_dd\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"a1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"salary_dd\"]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"salary_dd\"]/div[2]")).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Naukridemo nd = new Naukridemo();
		nd.ndemo();
	}

}
