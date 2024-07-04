package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddCamera;
import com.titrate.pageObjects.LoginPage;

public class TC_002_VerifyAddCamera extends BaseClass
{
	@Test
	public void addCamera() throws InterruptedException 
	{

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(2000);
		AddCamera ac = new AddCamera(driver);
		ac.clickCamIcon();
		Thread.sleep(2000);
		ac.clickAddCam();
		Thread.sleep(2000);
		ac.setCamName("East");
		Thread.sleep(2000);
		ac.setSlno("Q2HV-96VV-VN8N9");
		Thread.sleep(5000);
		ac.clickModel();
		Thread.sleep(2000);
		ac.setModel();
		Thread.sleep(2000);
		ac.setUrl("www.meraki.com");
		Thread.sleep(2000);
		ac.clickSave();
		Thread.sleep(2000);
	}

}
