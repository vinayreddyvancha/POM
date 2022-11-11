package com.vinay.deleteemployee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropDown extends Tittle
{
	public void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Opened Application");
	}
	
	public void verifyTittle()
	{
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Tittle Matched");
		}
		else
		{
			System.out.println("Tittle Not Mateched");
		}	
	}
	
	public void login()
	{
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login into the Application");
	}
	public void enterFrame()
	{
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into the frame");
		
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByValue("0");
		
		driver.findElement(By.name("loc_name")).sendKeys("0015");
		
		driver.findElement(By.xpath("//input [@value = 'Search']")).click();
		
		driver.findElement(By.name("chkLocID[]")).click();
		
		driver.findElement(By.xpath("//input [@value = 'Delete']")).click();
		System.out.println("Employee ID Deleted");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exict from Frame");
	}
	
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Application has Logout");
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
}
