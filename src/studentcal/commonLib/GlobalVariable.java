package studentcal.commonLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import studentcal.commonLib.DataBroker;


public class GlobalVariable {
	public WebDriver driver;
	
	public String loginPageURL;
	public String expLoginPageTitle;
	public String userName;
	public String password;
	
	public void global()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e7015509\\workspace\\StudentCalendar\\browserDriver\\chromedriver.exe");
		/*Driver.getDriverPath(browser);*/
		DataBroker TestData = new DataBroker();
		String [] csvCell;
		csvCell = TestData.ReadData();
		
		loginPageURL = csvCell[0];
		expLoginPageTitle = csvCell[1];
		userName = csvCell[2];
		password = csvCell[3];
		   
		
		/*Driver.getDriver(browser);*/
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	  }
}
	


