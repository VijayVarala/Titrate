package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.EditUser;
import com.titrate.pageObjects.LoginPage;

public class TC_006VerifyEditUser extends BaseClass 
{
	@Test
	public void editUser() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(4000);
		
		EditUser e= new EditUser(driver);
		e.clickUsers();
		Thread.sleep(1000);
		
		e.clickEdit();
		Thread.sleep(1000);
		
		e.editFirstName("Mike");
		Thread.sleep(1000);
		
		e.editphno("9876543210");
		
		e.clickAdd();
		Thread.sleep(4000);
		
		
	}

}
