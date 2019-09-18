package studentcal.commonLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import studentcal.pageobjectrepo.LoginPage;



 public class CommonMethods{
	 
	 public WebDriver linktostudentCal(WebDriver driver, String studentcalLink) throws InterruptedException{
		 driver.get(studentcalLink);
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='login']")));
		 /*Thread.sleep(8000);*/
		 return driver; 
	 }
	public WebDriver logintostudentCal(WebDriver driver, String userName, String password) throws InterruptedException{
		LoginPage.txtbx_username(driver).sendKeys(userName);
		LoginPage.txtbx_password(driver).sendKeys(password);
		LoginPage.btn_login(driver).click();
		Thread.sleep(9000);
		
		return driver;		

 }
	
}
	

	

