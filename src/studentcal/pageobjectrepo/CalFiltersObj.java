package studentcal.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalFiltersObj {
	
private static WebElement element = null;

	/*public static void selectEventType(WebDriver driver, String eventTypeOption){
	driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= "+eventTypeOption+"]")).click();*/
	/*-----Event type Filters-------*/
	public static WebElement chkbx_eventtyp_academic(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Academic']"));
		return element;
	 }
	
	public static WebElement chkbx_eventtyp_assessment(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Assessment']"));
		return element;
	 }
	
	public static WebElement chkbx_eventtyp_holiday(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Holiday']"));
		return element;
	 }
	
	public static WebElement chkbx_eventtyp_lectureandsem(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Lectures & Seminars']"));
		return element;
	 }
	
	public static WebElement link_evttype_selDeselAll(WebDriver driver) throws InterruptedException{
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterSelect']//a[@aria-label='Select all Event Type']"));
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl05_ctl01_divFilter")));
		return element;
	}
	
	public static WebElement link_evttype_selDeselNone(WebDriver driver) throws InterruptedException{
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterSelect']//a[@aria-label='Select no Event Type']"));
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl05_ctl01_divFilter")));
		return element;
	}
	
	/*-----------Campus filters------------*/
	public static WebElement chkbx_campus_cityflinders(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'City Flinders']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_cityking(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'City King']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_cityqueen(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'City Queen']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_footscraynich(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Footscray Nicholson']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_footscraypark(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Footscray Park']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_online(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Online']"));
		return element;
	 }
	public static WebElement chkbx_campus_stalbans(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'St Albans']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_sunshine(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Sunshine']"));
		return element;
	 }
	
	public static WebElement chkbx_campus_werribee(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='ctl05_ctl01_ctl01']//div[@class='twFilterDiv']//input[@aria-label= 'Werribee']"));
		return element;
	 }
	
	/*--------------------------------------Event type Search Criteria Text------------------------------------*/
	
	public static WebElement msgbox_searchcriteria_academic(WebDriver driver){
		element=driver.findElement(By.xpath("//span[@class='twSearchInfoText']"));
		return element;
	 }
	
	
}


