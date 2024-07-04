package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddUser;
import com.titrate.pageObjects.LoginPage;

public class TC_005_VerifyAddUser extends BaseClass
{
	@Test
	public void addUser() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(4000);
		
		AddUser a= new AddUser(driver);
		a.clickUsers();
		Thread.sleep(2000);
		
		a.clickAddUser();
		Thread.sleep(2000);
		
		a.setFirstName("Will");
		Thread.sleep(1000);
		
		a.setLastame("Jacks");
		Thread.sleep(1000);
		
		a.setUserName("jacks");
		Thread.sleep(1000);
		
		a.setPhoneNo("9876543210");
		Thread.sleep(1000);
		
		a.setEmail("varalavijay3446@gmail.com");
		Thread.sleep(1000);
		
		a.clickAdd();
		Thread.sleep(4000);
	}
	
}
