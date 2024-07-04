package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.DeleteCamera;
import com.titrate.pageObjects.LoginPage;

public class TC_004_VerifyDeleteCamera extends BaseClass
{
	@Test
	public void deleteCamera() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		DeleteCamera d= new DeleteCamera(driver);
		d.clickCamIcon();
		Thread.sleep(1000);
		
		d.clickDelete();
		Thread.sleep(3000);
		
	}

}
