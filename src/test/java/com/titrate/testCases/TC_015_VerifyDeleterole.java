package com.titrate.testCases;
import org.testng.annotations.Test;
import com.titrate.pageObjects.DeleteRole;
import com.titrate.pageObjects.LoginPage;

public class TC_015_VerifyDeleterole extends BaseClass
{
	@Test
	public void editRole() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		DeleteRole d = new DeleteRole(driver);
		d.clickRoles();
		Thread.sleep(1000);
		
		d.clickDelete();
	}

}
