package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditImprestProduct 
{
	EditImprestProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-testid=\\'MenuIcon\\']")
	WebElement menuicon;
	
	@FindBy(xpath="(//p[@class=\'MuiTypography-root MuiTypography-body1 css-197tr25-MuiTypography-root\'])[8]")
	WebElement clickimprestproducticon;
	
	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement edit;
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]")
	WebElement productdropdown;
	
	@FindBy(xpath="//li[@role='option'])[2]")
	WebElement productname;
	
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]")
	WebElement imprestdropdown;
	
	@FindBy(xpath="//li[@role='option'])[2]")
	WebElement imprestname;
	
	@FindBy(name="min_stock")
	WebElement minimumstock;
	
	@FindBy(name="max_stock")
	WebElement maximumstock;
	
	@FindBy(name="available_stock")
	WebElement availablestock;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlineIcon']")
	WebElement save;
	public void clickMenuIcon()
	{
		menuicon.click();
	}
	
	public void clickImprestIcon() 
	{
		clickimprestproducticon.click();
	}
	
	public void clickEdit() 
	{
		edit.click();
	}
	public void clickProductDropDown() {
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
		while(!minimumstock.getAttribute("Value").isEmpty()) 
		{
			minimumstock.sendKeys(Keys.BACK_SPACE);
		}

		minimumstock.sendKeys(minstock);
	}
	public void setMaxStock(String maxstock) 
	{
		while(!maximumstock.getAttribute("Value").isEmpty()) {
			maximumstock.sendKeys(Keys.BACK_SPACE);
		}

		maximumstock.sendKeys(maxstock);
	}
	
	public void setAvailableStock(String avlstock)
	{
		while(!availablestock.getAttribute("Value").isEmpty()) 
		{
			availablestock.sendKeys(Keys.BACK_SPACE);
		}

		availablestock.sendKeys(avlstock);
	}
	public void clickAdd() 
	{
		save.click();
	}




}
