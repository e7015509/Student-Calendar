package studentcal.calendartests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import studentcal.commonLib.*;
import studentcal.pageobjectrepo.*;


public class CalendarLandingPage extends GlobalVariable {

	CommonMethods commMethods=new CommonMethods();
		
	 @Test(priority=1, description="Access link to Student Calendar")
	  public void loginpage() throws InterruptedException {
		commMethods.linktostudentCal(driver, loginPageURL);
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle); // printing the actual page title
	    Assert.assertEquals(actualTitle, expLoginPageTitle);
	 }
	 
	 @Test(priority=2, description="Login to Student Calendar")
	  public void login() throws InterruptedException {
		commMethods.logintostudentCal(driver, userName, password);
	 } 
	
	@Test(priority=3, description="Validate default elements in landing page - current month calendar")
	 public void currentmthcalendar(){
		 commMethods.switchToCurrMthCalFrame(driver);
		 String actualCurrMthCalTitle = CalLandingPageObj.cal_currentmonthcalendarlbl(driver).getText();
		 System.out.println(actualCurrMthCalTitle); //printing the current month calendar title
		 Assert.assertEquals(actualCurrMthCalTitle, expCurrMthCalTitle);
		 CalLandingPageObj.cal_currentmonthcalendar(driver).isDisplayed(); //verify current month calendar element is displayed
		 CalLandingPageObj.btn_currmthcalendarpager_prev(driver).isDisplayed(); //previous btn
		 CalLandingPageObj.btn_currmthcalendarpager_next(driver).isDisplayed(); //next btn
		 driver.switchTo().defaultContent();
	 }
	
	@Test(priority=4, description="Validate default elements in landing page - tab views")
	public void calendarviews(){
		commMethods.switchToTabFrame(driver);
		String actualTabMthLbl = CalLandingPageObj.tab_month(driver).getText();
		Assert.assertEquals(actualTabMthLbl, expTabMthLbl);
		System.out.println(actualTabMthLbl); //print the month tab label
		String actualTabDayLbl = CalLandingPageObj.tab_day(driver).getText();
		Assert.assertEquals(actualTabDayLbl, expTabDayLbl);
		System.out.println(actualTabDayLbl); //print the day tab label
		String actualTabWeekLbl = CalLandingPageObj.tab_week(driver).getText();
		Assert.assertEquals(actualTabWeekLbl, expTabWeekLbl);
		System.out.println(actualTabWeekLbl); //print the day tab label
		 driver.switchTo().defaultContent();
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

