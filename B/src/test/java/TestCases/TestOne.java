package TestCases;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BrowserFactory;

public class TestOne {

	WebDriver driver;
	
	@Test 
	public void getTitle ()
	{
		driver=BrowserFactory.launchWebDriver(driver, "chrome", "https://www.priceline.com/hotels/");
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver=new ChromeDriver();
		String t=driver.getTitle();
		System.out.println(t);
	}
}


