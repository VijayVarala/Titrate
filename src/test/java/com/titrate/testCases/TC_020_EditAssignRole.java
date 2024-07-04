package com.titrate.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.titrate.pageObjects.EditAssignRole;
import com.titrate.pageObjects.LoginPage;

public class TC_020_EditAssignRole extends BaseClass
{
	@Test
	public void assignRole() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		
		EditAssignRole e=new EditAssignRole(driver);
		
		e.clickAssinRoleIcon();
		
		e.clickEdit();
		
		e.clickUsersDropDown();
		
		e.clickUsers();
		
		e.clickRoleDropDown();
		
		e.clickRole();
		
		e.clickImprestDropDown();
		
		e.clickImprest();
		
		e.clickAdd();

	}

}
