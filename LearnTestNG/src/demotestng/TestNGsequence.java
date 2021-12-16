package demotestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGsequence {
	
	
	@BeforeSuite
	public void setproperty()

	{
		System.out.println("set the system property");
	}

	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("Open browser");
	}
	
	@BeforeClass
	public void enterurl(){
		System.out.println("open url");
	}
	
	@BeforeMethod
	public void geturl(){
		System.out.println("display url");
	}
	
	@Test
	public void checktitle(){
		System.out.println("check title of page");
	}
	
	@AfterMethod
    public void logout(){
        System.out.println("logout");
    }
    
	@AfterClass
	public void closebrowser(){
	System.out.println("close browser");
	}
	
	@AfterTest
	public void checkresults(){
	System.out.println("result displayed");
	}

	
}
