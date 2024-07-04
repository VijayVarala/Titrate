package com.titrate.testCases;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddImprest;
import com.titrate.pageObjects.LoginPage;

public class TC_008_VerifyAddImprest extends BaseClass
{
	@Test
	public void addImprest() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		Thread.sleep(1000);
		
		lp.setPassword(password);
		Thread.sleep(1000);
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddImprest a= new AddImprest(driver);
		a.clickImprest();
		Thread.sleep(1000);
		
		a.clickAddImprest();
		Thread.sleep(4000);
		
		a.setName("Imprest-mj");
		Thread.sleep(2000);
		
		a.setDesc("Imprest emergency mj medicine");
		Thread.sleep(2000);
		
		a.setPhno1("9867543212");
		Thread.sleep(2000);
		
		a.setExtension1("98766");
		Thread.sleep(2000);
		
		a.setPhno2("8976543210");
		Thread.sleep(2000);
		
		a.setExtension2("87654");
		Thread.sleep(2000);
		
		a.setSlno("Q2HV-96VV-VN8Q");
		Thread.sleep(2000);
		
		a.clickAdd();
		
	}

}
