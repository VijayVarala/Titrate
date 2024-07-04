package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AssignCamera;
import com.titrate.pageObjects.LoginPage;

public class TC_011_VerifyAssignCamera extends BaseClass
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
		
		AssignCamera a = new AssignCamera(driver);
		a.clickImprest();
		Thread.sleep(1000);
		
		a.clickAssignCam();
		Thread.sleep(1000);
		
		a.clickCheckBox();
		Thread.sleep(1000);
		
		a.clickAssign();

}
}
