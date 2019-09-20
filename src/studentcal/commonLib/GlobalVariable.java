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
	public String expCurrMthCalTitle;
	public String expTabMthLbl;
	public String expTabDayLbl;
	public String expTabWeekLbl;
	
	public void global()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e7015509\\Documents\\Automation_Repo\\Student-Calendar\\browserDriver\\chromedriver.exe");
		/*Driver.getDriverPath(browser);*/
		DataBroker TestData = new DataBroker();
		String [] csvCell;
		csvCell = TestData.ReadData();
		
		loginPageURL = csvCell[0];
		expLoginPageTitle = csvCell[1];
		userName = csvCell[2];
		password = csvCell[3];
		expCurrMthCalTitle = csvCell[4];
		expTabMthLbl = csvCell[5];
		expTabDayLbl = csvCell[6];
		expTabWeekLbl = csvCell[7];
		   
		
		/*Driver.getDriver(browser);*/
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	  }
}
	


