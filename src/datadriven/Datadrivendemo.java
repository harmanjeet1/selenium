package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivendemo {
	String data,data1,path;
	WebDriver driver;
	public void getdata() throws IOException
	{
		FileInputStream fs = new FileInputStream("E:\\logindetails.xlsx");
		//Access workbook
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		//Access sheet from workbook
		XSSFSheet sheet = wb.getSheet("login");
		//Access row from sheet
		int count = sheet.getLastRowNum();
		System.out.println("total no of rows are "+count);
	//	XSSFRow row =sheet.getRow(0);
		//fetch data from zero row
	//	XSSFCell cell = row.getCell(0);
		//data=cell.getStringCellValue();
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		for(int i=0;i<count;i++)
		{
		data=sheet.getRow(i).getCell(0).getStringCellValue();	
		System.out.println("username is "+data);
		
		data1=sheet.getRow(i).getCell(1).getStringCellValue();	
		System.out.println("password is "+data1);
		
		//data1=sheet.getRow(i).getCell(1).getStringCellValue();
		//System.out.println("password is "+data1);
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys(data);
		driver.findElement(By.name("txtPassword")).sendKeys(data1);
		driver.findElement(By.id("btnLogin")).submit();
	}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datadrivendemo dd = new Datadrivendemo();
		dd.getdata();

	}

}
