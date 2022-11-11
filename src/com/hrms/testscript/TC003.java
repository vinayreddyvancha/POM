package com.hrms.testscript;

import com.vinay.edditemp.Employee;

public class TC003 
{
	public static void main(String[] args)  throws Exception
	{
		Employee obj = new Employee();
		obj.openApplication();
		obj.login();
		obj.enterFrame();	
		obj.exictFrame();
		obj.logout();
	}
}
