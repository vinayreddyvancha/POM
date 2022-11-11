package com.vinay.edditemp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Employee extends Eddit
{
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\My Folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void login()
	{
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	}
	public void enterFrame()
	{
		driver.switchTo().frame("rightMenu");
		
        driver.findElement(By.linkText("chandra ln")).click();
		
		driver.findElement(By.name("EditMain")).click();
		
		driver.findElement(By.name("txtEmpFirstName")).click();
		driver.findElement(By.name("txtEmpFirstName")).clear();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Vivek");
		
		driver.findElement(By.name("txtEmpLastName")).click();
		driver.findElement(By.name("txtEmpLastName")).clear();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Harsha");
		
		driver.findElement(By.name("EditMain")).click();
		System.out.println("Clicked on Save Button");
	}
	
	public void exictFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exicted from Frame");
	}
	
	public void logout()
	{
		driver.findElement(By.name("Logout")).click();
		System.out.println("Logout Compleated");
	}
}
