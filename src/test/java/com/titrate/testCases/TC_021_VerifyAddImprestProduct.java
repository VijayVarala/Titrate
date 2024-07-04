package com.titrate.testCases;

import java.time.Duration;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddImprestProduct;
import com.titrate.pageObjects.LoginPage;

public class TC_021_VerifyAddImprestProduct extends BaseClass
{
	@Test
	public void addImprestProduct() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddImprestProduct a = new AddImprestProduct(driver);
		Thread.sleep(5000);
		a.clickMenuIcon();
		Thread.sleep(2000);
		a.clickImprestIcon(); 
		Thread.sleep(12000);
		a.clickAddImprestProduct();
		Thread.sleep(6000);
		a.clickProductDropDown();
		Thread.sleep(6000);
		a.clickProductName();
		Thread.sleep(2000); 
		a.clickImprestDropDown();
		Thread.sleep(2000);
		a.clickImprestName();
		Thread.sleep(2000);
		a.setMinStock("5");
		Thread.sleep(2000);
		a.setMaxStock("10");
		Thread.sleep(2000);
		a.setAvailableStock("2");
		Thread.sleep(2000);
		a.clickAdd();
		Thread.sleep(2000);
}
}