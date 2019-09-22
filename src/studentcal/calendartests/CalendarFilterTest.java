package studentcal.calendartests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import studentcal.commonLib.CommonMethods;
import studentcal.commonLib.GlobalVariable;
import studentcal.calendaractions.*;


public class CalendarFilterTest extends GlobalVariable {
	CommonMethods commMethods=new CommonMethods();
	CalendarFilterAction calfilteract = new CalendarFilterAction();
	
	@Test(priority=1, description="Select Academic Calendar Event type")
	public void academiccalendar() throws InterruptedException, IOException {
		
		try{
		calfilteract.selectacademiccal();
		}catch (Exception acadExcep){
			commMethods.methodname="selectacademiccal_";
			commMethods.printStackTrace(acadExcep);
			commMethods.screenshot(driver);
		}
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
	  



