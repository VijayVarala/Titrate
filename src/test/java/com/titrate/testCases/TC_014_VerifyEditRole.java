package com.titrate.testCases;

import org.testng.annotations.Test;
import com.titrate.pageObjects.EditRole;
import com.titrate.pageObjects.LoginPage;

public class TC_014_VerifyEditRole extends BaseClass 
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
		
		EditRole r = new EditRole(driver);
		r.clickRoles();
		Thread.sleep(1000);
		
		r.clickEdit();
		Thread.sleep(1000);
		
		r.setRole("user2");
		Thread.sleep(1000);
		
		r.clickSave();

}
}
