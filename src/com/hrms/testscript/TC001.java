package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.vinay.hrms.lib.General;

public class TC001 
{
	@Test
	public void tc001()
	{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterframe();
		obj.exictFrame();
		obj.logout();
		obj.closeApplication();
		
	}

}
