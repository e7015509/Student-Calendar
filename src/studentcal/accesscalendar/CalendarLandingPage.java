package studentcal.accesscalendar;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import studentcal.commonLib.*;
import studentcal.pageobjectrepo.*;


public class CalendarLandingPage extends GlobalVariable {

	CommonMethods commMethods=new CommonMethods();
		
	 @Test(priority=1, description="link to Student Calendar")
	  public void loginpage() throws InterruptedException {
		commMethods.linktostudentCal(driver, loginPageURL);
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle); // printing the actual page title
	    AssertJUnit.assertEquals(actualTitle, expLoginPageTitle);
	    Thread.sleep(5000);
	}
	 
	 @Test(priority=2, description="Login to Student Calendar")
	  public void login() throws InterruptedException {
		commMethods.logintostudentCal(driver, userName, password);
	 } 
	 
	@Test(priority=3, description="Select Academic Calendar Event type")
	public void filters() throws InterruptedException{
		CalendarPage.switchToFilterFrame(driver);
		CalendarPage.link_evttype_selDeselNone(driver).click();
		CalendarPage.chkbx_eventtyp_academic(driver).click();
	}
		
	 @BeforeTest
	  public void beforeTest() {
		  global();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
}
	  
}

