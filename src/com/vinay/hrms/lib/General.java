package com.vinay.hrms.lib;

import com.hrms.utility.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.openqa.selenium.By;

public class General extends Globel
{
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Opended Application");
		Reporter.log("Opended Application");
		Log.info("Application Closed");
	}
	
	public void closeApplication()
	{
		driver.quit();
		System.out.println("Close Application");
		//Reporter.log("Close Application");
		Log.info("Close Application");
	}
    public void login()
    {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Compleated");
	Reporter.log("Login Complited");
    }
    
    public void enterframe()
    {
   	driver.switchTo().frame("rightMenu");
   	System.out.println("Entered into Frame");
     //Reporter.log("Enterred into Frame");
   	Log.info("Entered into Frame");
    
    	driver.findElement(By.xpath("//input[@value='Add']")).click();
    	System.out.println("Clicked on Add Button");
    	driver.findElement(By.name(EmployeFirstName)).sendKeys("Vinay");
    	driver.findElement(By.name(EmployeLastName)).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@title='Save']")).click();
    }
     public void exictFrame()
    {
    	driver.switchTo().defaultContent();
    	System.out.println("Exict from the Frame");
    	//Reporter.log("Exict from the Frame");
    	Log.info("Excit from the Frame");
    }
    public void logout()
    {
    	driver.findElement(By.linkText(link_logout)).click();
    	System.out.println("Logout Compleated");
    	//Reporter.log("Logout Compleated");
    	Log.info("Log Compleated");
    } 
}
