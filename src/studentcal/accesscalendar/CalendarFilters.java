package studentcal.accesscalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import studentcal.commonLib.CommonMethods;
import studentcal.commonLib.GlobalVariable;
import studentcal.pageobjectrepo.CalFiltersObj;


public class CalendarFilters extends GlobalVariable {
	CommonMethods commMethods=new CommonMethods();
	
	@Test(priority=1, description="Select Academic Calendar Event type")
	
	public void filters() throws InterruptedException{
		commMethods.linktostudentCal(driver, loginPageURL);
		commMethods.logintostudentCal(driver, userName, password);
		commMethods.switchToFilterFrame(driver);
		CalFiltersObj.link_evttype_selDeselNone(driver).click(); //De-select the event type filters by clicking on None
		CalFiltersObj.chkbx_eventtyp_academic(driver).click();
		driver.switchTo().defaultContent();
		Thread.sleep(8000);//select only academic event type
		commMethods.switchToCalendarFrame(driver);
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl05_ctl01_searchinfo_ctl00_searchDiv")));
		String actualsearchacademic=CalFiltersObj.msgbox_searchcriteria_academic(driver).getText();
		Assert.assertEquals(actualsearchacademic, "Academic");
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
	  



