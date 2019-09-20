package studentcal.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalLandingPageObj {
	
	private static WebElement element = null;
	
	public static WebElement cal_currentmonthcalendarlbl(WebDriver driver){
		element=driver.findElement(By.xpath("//td[@class='twMiniCalMonthLabel']"));
		return element;
	 }
	
	public static WebElement cal_currentmonthcalendar(WebDriver driver){
		element=driver.findElement(By.xpath("//table[@class='twMiniCalTable']"));
		return element;
	 }
	
	public static WebElement btn_currmthcalendarpager_prev(WebDriver driver){
		element=driver.findElement(By.id("ctl05_ctl01_ctl00_pager_ctl00_lnk2PrevPg"));  
		return element;
	 }
	
	public static WebElement btn_currmthcalendarpager_next(WebDriver driver){
		element=driver.findElement(By.id("ctl05_ctl01_ctl00_pager_ctl00_lnk2NextPg"));  
		return element;
	 }
	
	public static WebElement tab_month(WebDriver driver){
		element=driver.findElement(By.id("tab1"));  
		return element;
	 }
	
	public static WebElement tab_day(WebDriver driver){
		element=driver.findElement(By.id("tab2"));  
		return element;
	 }
	
	public static WebElement tab_week(WebDriver driver){
		element=driver.findElement(By.id("tab3"));  
		return element;
	 }

}
