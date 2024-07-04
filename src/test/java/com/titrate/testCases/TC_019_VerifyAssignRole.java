package com.titrate.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AssignRole;
import com.titrate.pageObjects.LoginPage;

public class TC_019_VerifyAssignRole extends BaseClass 
{
	@Test
	public void assignRole() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(uname);
	lp.setPassword(password);
	lp.clickSubmit();
	
	AssignRole a=new AssignRole(driver);
	
	a.clickAssinRoleIcon();
	
	a.clickAssinRole();
	
	a.clickUsersDropDown();
	
	a.clickUsers();
	
	a.clickRoleDropDown();
	
	a.clickRole();
	
	a.clickImprestDropDown();
	
	a.clickImprest();
	
	a.clickAdd();

}
}