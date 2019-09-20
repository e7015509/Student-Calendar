package studentcal.commonLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import studentcal.pageobjectrepo.LoginPageObj;



 public class CommonMethods{
	 
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
		
}
	

	

