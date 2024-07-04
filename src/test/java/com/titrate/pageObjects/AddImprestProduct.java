package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddImprestProduct {
	
	public AddImprestProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-testid='MenuIcon']")
	WebElement menuicon;
	
	@FindBy(xpath="(//p[@class=\'MuiTypography-root MuiTypography-body1 css-197tr25-MuiTypography-root\'])[8]")
	WebElement clickimprestproducticon;
	
	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement addimprestproduct;
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement productdropdown;
	
	@FindBy(xpath="//li[@role='option'])[1]")
	WebElement productname;
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]")
	WebElement imprestdropdown;
	
	@FindBy(xpath="//ul[@role='listbox']")
	WebElement imprestname;
	
	@FindBy(name="min_stock")
	WebElement minimumstock;
	
	@FindBy(name="max_stock")
	WebElement maximumstock;
	
	@FindBy(name="available_stock")
	WebElement availablestock;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlineIcon']")
	WebElement add;
	
	public void clickMenuIcon()
	{
		menuicon.click();
	}
	
	public void clickImprestIcon() 
	{
		clickimprestproducticon.click();
	}
	
	public void clickAddImprestProduct() 
	{
		addimprestproduct.click();
	}
	public void clickProductDropDown() 
	{
		productdropdown.click();
	}
	public void clickProductName() 
	{
		productname.click();
	}
	public void clickImprestDropDown() 
	{
		imprestdropdown.click();
	}
	public void clickImprestName()
	{
		imprestname.click();
	}
	public void setMinStock(String minstock)
	{
		minimumstock.sendKeys(minstock);
	}
	public void setMaxStock(String maxstock) 
	{
		maximumstock.sendKeys(maxstock);
	}
	public void setAvailableStock(String avlstock) 
	{
		availablestock.sendKeys(avlstock);
	}
	public void clickAdd() 
	{
		add.click();
	}

}
