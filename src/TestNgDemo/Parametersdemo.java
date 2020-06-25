package TestNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersdemo {
	@Parameters({"username"})
	@Test
	public void get(String uname)
	{
		System.out.println("username is "+uname);
	}
	

}
