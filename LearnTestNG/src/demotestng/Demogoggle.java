package demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demogoggle {
	WebDriver driver;
	
	@BeforeMethod
	public void setbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware24112021\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,"google");
	}

	@Test(priority=1)
	public void checklogo()
	{
		boolean veiw=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(veiw);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}