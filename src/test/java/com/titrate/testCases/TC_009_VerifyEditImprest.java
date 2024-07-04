package com.titrate.testCases;
import org.testng.annotations.Test;
import com.titrate.pageObjects.EditImprest;
import com.titrate.pageObjects.LoginPage;

public class TC_009_VerifyEditImprest extends BaseClass
{
	@Test
	public void editImprest() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		EditImprest e= new EditImprest(driver);
		e.clickImprest();
		Thread.sleep(1000);
		
		e.clickEdit();
		Thread.sleep(1000);
		
		e.setName("Imprest -MI");
		Thread.sleep(1000);
		
		e.clickAdd();
	}
}
