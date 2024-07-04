package com.titrate.testCases;

import org.testng.annotations.Test;
import com.titrate.pageObjects.LoginPage;
import com.titrate.pageObjects.UnAssignCamera;

public class TC_012_VerifyUnAssignCamera extends BaseClass
{
	@Test
	public void assignCamera() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		UnAssignCamera u = new UnAssignCamera(driver);
		u.clickImprest();
		Thread.sleep(1000);
		
		u.clickAssignCam();
		Thread.sleep(1000);
		
		u.clickCheckBox();
		Thread.sleep(1000);
		
		u.clickAssign();

}

}
