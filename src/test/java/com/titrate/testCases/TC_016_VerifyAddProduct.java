package com.titrate.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.titrate.pageObjects.AddProduct;
import com.titrate.pageObjects.LoginPage;

public class TC_016_VerifyAddProduct extends BaseClass{
	@Test
	public void addProduct() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		AddProduct a=new AddProduct(driver);
		a.clickProductIcon();
		
		a.clickAddProduct();
		
		a.setProductname("Grilinctus-Dy");
		
		a.setStrength("100ml");
		
		a.setLabelCode("01CYC20933");
		
		a.clickPackDropDown();
		
		a.clickPack();
		
		a.clickMeasureDropDown();
		
		a.clickMeasure();
		
		a.clickProductFormDropDown();
		
		a.clickProductForm();
		
		a.clickBrandDropDown();
		
		a.clickBrand();
		
		a.clickGenericDropDown();
		
		a.clickGeneric();
		
		a.setPackSize("2");
		
		a.clickAdd();

	}

}
