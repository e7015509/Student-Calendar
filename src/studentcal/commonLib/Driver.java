package studentcal.commonLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	public static WebDriver driver;
	
	
	/**
	 * 
	 * @param browser
	 *  pass string parameter like firefox , ie or chrome
	 * @return
	 * based on your argumnet , mtd will return browser object
	 */
	public static WebDriver getDriverPath(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\geckodriver.exe");
		}else if (browser.equalsIgnoreCase("IE")){
			System.setProperty("webDriver.ie.driver", "C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\IEDriver.exe");
		}else if (browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webDriver.chrome.driver", "C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\chromedriver.exe");
		}
		return driver;
	
		
	}
	
	public static WebDriver getDriver(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
			/*System.setProperty("webdriver.gecko.driver","C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\geckodriver.exe");*/
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("IE")){
			/*System.setProperty("webDriver.ie.driver", "C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\IEDriver.exe");*/
			driver = new InternetExplorerDriver();
		}else if (browser.equalsIgnoreCase("Chrome")){
			/*System.setProperty("webDriver.chrome.driver", "C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\chromedriver.exe");*/
			driver = new ChromeDriver();
		}
		return driver;
	}
}
