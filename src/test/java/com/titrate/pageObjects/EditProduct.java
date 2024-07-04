package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProduct {
	public EditProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/role.svg']")
	WebElement producticon;

	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement edit;

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
	WebElement save;
	public void clickProductIcon()
	{
		producticon.click();
	}

	public void clickEdit() 
	{
		edit.click();
	}

	public void setProductname(String productname)
	{
		while(!txtproductname.getAttribute("Value").isEmpty()) {
			txtproductname.sendKeys(Keys.BACK_SPACE);
		}

		txtproductname.sendKeys(productname);
	}

	public void setStrength(String strength) 
	{
		while(!txtstrength.getAttribute("Value").isEmpty()) {
			txtstrength.sendKeys(Keys.BACK_SPACE);
		}

		txtstrength.sendKeys(strength);
	}

	public void setLabelCode(String labelcode) {
		while(!txtlabelcode.getAttribute("Value").isEmpty()) {
			txtlabelcode.sendKeys(Keys.BACK_SPACE);
		}

		txtlabelcode.sendKeys(labelcode);
	}
	public void clickPackDropDown() 
	{
		packdropdown.click();
	}
	public void clickPack()
	{
		pack.click();
	}
	public void clickMeasureDropDown()
	{
		measuredropdown.click();
	}
	public void clickMeasure() {
		measure.click();
	}
	public void clickProductFormDropDown() 
	{
		productformdropdrown.click();
	}
	public void clickProductForm() 
	{
		productform.click();
	}
	public void clickBrandDropDown()
	{
		branddropdown.click();
	}
	public void clickBrand() {
		brand.click();
	}
	public void clickGenericDropDown()
	{
		genericdropdown.click();
	}
	public void clickGeneric()
	{
		generic.click();
	}
	public void setPackSize(String packsize) 
	{
		while(!txtpacksize.getAttribute("Value").isEmpty()) {
			txtpacksize.sendKeys(Keys.BACK_SPACE);
		}

		txtpacksize.sendKeys(packsize);
	}
	public void clickAdd()
	{
		save.click();
	}
}
