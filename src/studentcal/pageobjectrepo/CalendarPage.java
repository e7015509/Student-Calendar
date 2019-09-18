package studentcal.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage {
	
private static WebElement element = null;
	
	public static WebElement txtbx_username(WebDriver driver){
	element = driver.findElement(By.name("username"));
	return element;
	}

}
