package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
	public AddProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/product.svg']")
	WebElement producticon;
	
	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement addproduct;
	
	@FindBy(name="description")
	WebElement txtproductname;
	
	@FindBy(name="strength")
	WebElement txtstrength;
	
	@FindBy(name="short_code")
	WebElement txtlabelcode;
	
	@FindBy(xpath="(//div[@role='combobox'])[2]")
	WebElement packdropdown;
	
	@FindBy(xpath="//li[@role='option']")
	WebElement pack;
	
	@FindBy(xpath="(//div[@role='combobox'])[3]")
	WebElement measuredropdown;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement measure;
	
	@FindBy(xpath="(//div[@role='combobox'])[3]")
	WebElement productformdropdrown;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement productform;
	
	@FindBy(xpath="(//div[@role='combobox'])[4]")
	WebElement branddropdown;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement brand;
	
	@FindBy(xpath="(//div[@role='combobox'])[5]")
	WebElement genericdropdown;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement generic;
	
	@FindBy(name="pack_size")
	WebElement txtpacksize;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement add;
	
	public void clickProductIcon()
	{
		producticon.click();
	}
	
	public void clickAddProduct() {
		addproduct.click();
	}
	
	public void setProductname(String productname) {
		txtproductname.sendKeys(productname);
	}
	
	public void setStrength(String strength) {
		txtstrength.sendKeys(strength);
	}
	
	public void setLabelCode(String labelcode) {
		txtlabelcode.sendKeys(labelcode);
	}
	public void clickPackDropDown() {
		packdropdown.click();
	}
	public void clickPack() {
		pack.click();
	}
	public void clickMeasureDropDown() {
		measuredropdown.click();
	}
	public void clickMeasure() {
		measure.click();
	}
	public void clickProductFormDropDown() {
		productformdropdrown.click();
	}
	public void clickProductForm() {
		productform.click();
	}
	public void clickBrandDropDown() {
		branddropdown.click();
	}
	public void clickBrand() {
		brand.click();
	}
	public void clickGenericDropDown() {
		genericdropdown.click();
	}
	public void clickGeneric() {
		generic.click();
	}
	public void setPackSize(String packsize) {
		txtpacksize.sendKeys(packsize);
	}
	public void clickAdd() {
		add.click();
	}
	

}
