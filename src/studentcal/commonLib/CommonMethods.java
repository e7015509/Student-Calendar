package studentcal.commonLib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import studentcal.pageobjectrepo.LoginPageObj;



 public class CommonMethods{
	 public String methodname;
	 
	 /*URL to Student Calendar */
	 public WebDriver linktostudentCal(WebDriver driver, String studentcalLink) throws InterruptedException{
		 driver.get(studentcalLink);
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='login']")));
		return driver; 
	 }
	 
	 /*Login to Student Calendar*/
	public WebDriver logintostudentCal(WebDriver driver, String userName, String password) throws InterruptedException{
		LoginPageObj.txtbx_username(driver).sendKeys(userName);
		LoginPageObj.txtbx_password(driver).sendKeys(password);
		LoginPageObj.btn_login(driver).click();
		Thread.sleep(9000);
		
		return driver;		

	}
	
	/*Switch to iframe of the current month calendar*/
	public void switchToCurrMthCalFrame(WebDriver driver){
		driver.switchTo().frame("dateFinderSpud.iframe");		
		}
	
	/*Switch to iframe of the filters -event type and campus*/
	public void switchToFilterFrame(WebDriver driver){
		driver.switchTo().frame("calendarFilterSpud.iframe");		
		}
	
	/*Switch to iframe of the filters -event type and campus*/
	public void switchToTabFrame(WebDriver driver){
		driver.switchTo().frame("calendarTabchooserSpud.iframe");		
		}
	
	/*Switch to iframe of the filters -event type and campus*/
	public void switchToCalendarFrame(WebDriver driver){
		driver.switchTo().frame("studentCalendarSpud.iframe");		
		}
	
	//Print stack trace to file
	public Exception printStackTrace(Exception e) throws FileNotFoundException{
        String fileformat = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
		String excepfilename = methodname+fileformat;
		File file = new File("C:\\Users\\e7015509\\Documents\\Automation_Repo\\Student-Calendar\\ErrorLog\\"+excepfilename+"");
		PrintStream ps = new PrintStream(file);
		e.printStackTrace(ps);
		return e;
	}

	
	public void screenshot(WebDriver driver) throws IOException{
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\e7015509\\Documents\\Automation_Repo\\Student-Calendar\\Screenshot\\test.jpg"));
	}
}
	

	

