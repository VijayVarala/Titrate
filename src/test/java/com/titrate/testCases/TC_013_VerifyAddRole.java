package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddRole;
import com.titrate.pageObjects.LoginPage;

public class TC_013_VerifyAddRole extends BaseClass
{
	@Test
	public void addRole() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddRole r = new AddRole(driver);
		r.clickRoles();
		Thread.sleep(1000);
		
		r.clickAddRole();
		Thread.sleep(1000);
		
		r.setRole("user1");
		Thread.sleep(1000);
		
		r.setDesc("user of the system");
		Thread.sleep(1000);
		
		r.clickAdd();
		Thread.sleep(3000);
		
		
		
		

}
}
