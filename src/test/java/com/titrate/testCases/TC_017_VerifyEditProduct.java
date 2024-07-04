package com.titrate.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.titrate.pageObjects.EditProduct;
import com.titrate.pageObjects.LoginPage;

public class TC_017_VerifyEditProduct extends BaseClass
{
	@Test
	public void addProduct() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(password);
		lp.clickSubmit();
		EditProduct e=new EditProduct(driver);
		e.clickProductIcon();
		
		e.clickEdit();
		
		e.setProductname("Grilinctus-Dyyy");
		
		e.setStrength("200ml");
		
		e.setLabelCode("01CYC20935");
		
		e.clickPackDropDown();
		
		e.clickPack();
		
//		e.clickMeasureDropDown();
//		
//		e.clickMeasure();
//		
//		e.clickProductFormDropDown();
//		
//		e.clickProductForm();
//		
//		e.clickBrandDropDown();
//		
//		e.clickBrand();
		
		e.clickGenericDropDown();
		
		e.clickGeneric();
		
		e.setPackSize("3");
		
		e.clickAdd();
	}
}
