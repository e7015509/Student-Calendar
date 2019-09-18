package studentcal.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_username(WebDriver driver){
	element = driver.findElement(By.name("username"));
	return element;
	}
	
	public static WebElement txtbx_password(WebDriver driver){
	element = driver.findElement(By.id("password"));
	return element;
	}
	
	public static WebElement btn_login(WebDriver driver){
	element = driver.findElement(By.name("submit"));
	return element;
	}
	
	
}
