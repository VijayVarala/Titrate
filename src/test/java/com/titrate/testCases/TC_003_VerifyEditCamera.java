package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.EditCamera;
import com.titrate.pageObjects.LoginPage;

public class TC_003_VerifyEditCamera extends BaseClass
{
	@Test
	public void editCamera() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		EditCamera e=new EditCamera(driver);
		
		e.clickCamIcon();
		Thread.sleep(4000);
		
		e.clickEditButton();
		Thread.sleep(1000);
		
		e.clearCamName();
		Thread.sleep(1000);
		

		
		e.editCamName("west");
		Thread.sleep(1000);
		
		e.clickSave();
	}

}
