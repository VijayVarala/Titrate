package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.DeleteUser;
import com.titrate.pageObjects.LoginPage;

public class TC_007_VerifyDeleteUser extends BaseClass
{
	@Test
	public void deleteUser() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		DeleteUser d=new DeleteUser(driver);
		d.clickUsers();
		Thread.sleep(1000);
		
		d.clickDelete();
	}

}
