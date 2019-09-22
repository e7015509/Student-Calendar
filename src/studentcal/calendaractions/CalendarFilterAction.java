package studentcal.calendaractions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import studentcal.commonLib.CommonMethods;
import studentcal.commonLib.GlobalVariable;
import studentcal.pageobjectrepo.CalFiltersObj;

public class CalendarFilterAction extends GlobalVariable {
	
		CommonMethods commMethods=new CommonMethods();
		
		public void selectacademiccal() throws InterruptedException {
			commMethods.linktostudentCal(driver, loginPageURL);
			commMethods.logintostudentCal(driver, userName, password);
			commMethods.switchToFilterFrame(driver);
			CalFiltersObj.link_evttype_selDeselNone(driver).click(); //De-select the event type filters by clicking on None
			CalFiltersObj.chkbx_eventtyp_academic(driver).click(); //select only academic event type
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			commMethods.switchToCalendarFrame(driver);
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ictl05_ctl01_searchinfo_ctl00_searchDiv")));
			String actualsearchacademic=CalFiltersObj.msgbox_searchcriteria_academic(driver).getText();
			Assert.assertEquals(actualsearchacademic, "Academic");
			driver.switchTo().defaultContent();
		}
}
