package com.titrate.testCases;
import org.testng.annotations.Test;
import com.titrate.pageObjects.DeleteImprest;
import com.titrate.pageObjects.LoginPage;

public class TC_010_VerifyDeleteImprest extends BaseClass
{
	@Test
	public void deleteImprest() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		DeleteImprest d= new DeleteImprest(driver);
		d.clickImprest();
		Thread.sleep(1000);
		
		d.clickDelete();
	}


}
