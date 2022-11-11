package com.vinay.hrms.lib;

import org.openqa.selenium.WebDriver;



public class Globel 
{
	
	public WebDriver driver;
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	
	
	/// Object and Element 
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login    = "Submit";
	public String link_logout  = "Logout";
	public String enter_frame = "rightMenu";
	public String EmployeFirstName   = "txtEmpFirstName";
	public String  EmployeLastName = "txtEmpLastName";
	
}
