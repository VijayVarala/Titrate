package com.titrate.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.titrate.pageObjects.DeleteProduct;
import com.titrate.pageObjects.LoginPage;

public class TC_018_VerifyDeleteProduct extends BaseClass
{
	@Test
	public void deleteProduct() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		DeleteProduct d=new DeleteProduct(driver);
		d.clickProductIcon();
		
		d.clickDelete();

}
}