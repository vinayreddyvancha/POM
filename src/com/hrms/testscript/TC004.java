package com.hrms.testscript;

import com.vinay.deleteemployee.DropDown;

public class TC004 
{
	public static void main(String[] args) 
	{
		DropDown dd = new DropDown();
		dd.OpenApplication();
		dd.verifyTittle();
		dd.login();
		dd.enterFrame();
		dd.exitFrame();
		dd.logout();
		dd.closeApplication();		
	}
}
