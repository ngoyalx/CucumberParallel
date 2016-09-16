package Utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	public static WebDriver driver;
	public static WebDriverWait waitvar=null;
	
	public void createdriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main"  + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--disable-extensions");
		//options.addArguments("no-sandbox");

		options.addArguments("ignore-certificate-errors");
		options.addArguments("--allow-running-insecure-content");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.binary", System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main"  + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com");
	    waitvar=new WebDriverWait(driver, 50);
	}
	
	public void teardown()
	{
		driver.quit();
	}
	
	public void printmessage(String message){
		System.out.println(message);
	}
	
	
}
