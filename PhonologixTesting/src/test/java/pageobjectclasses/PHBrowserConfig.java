package pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
//import java.net.malformedurlexception

public class PHBrowserConfig {
	
		
	  public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>(); 
	  static{
	  
	  DesiredCapabilities OBJCapabalities = new DesiredCapabilities();
	  OBJCapabalities.setBrowserName("chrome");
	  
	  @SuppressWarnings("deprecation")
	WebDriver driver = null;
	try {
		driver = new RemoteWebDriver(new URL ( "http://13.235.83.238:4444/"),OBJCapabalities);
	} catch (MalformedURLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	  driverThread.set(driver); 
	  driver.manage().window().maximize();
	  
	  }
}


/*public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>();
//public WebDriver driver=new ChromeDriver();
//public static void SetDriver() {
static{
	WebDriver driver=new ChromeDriver();
	driverThread.set(driver);
	driver.manage().window().maximize();*/

	 
