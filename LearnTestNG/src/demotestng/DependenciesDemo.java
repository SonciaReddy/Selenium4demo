package demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesDemo {
	WebDriver driver;
	@Test(description="Testcase to open application")
	public void startapp()
	{
		System.out.println("Start application ");
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware24112021\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,"Demowebshop");
		
	}
	
	@Test(dependsOnMethods = "startapp")
	public void loginapp()
	{
		System.out.println("Successfully logged in");
		driver.findElement(By.id("Email")).sendKeys("sonicasr21@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sonica21");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test(dependsOnMethods = "loginapp")
	public void signoff()
	{
		System.out.println("Signoff successfully");
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test(dependsOnMethods="signoff",alwaysRun = true)
	public void closebrowser()
	{
		driver.close();
	}

}
