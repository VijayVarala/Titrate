package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddImprest 
{
	public AddImprest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/imprest.svg']")
	WebElement imprests;

	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement addimprest;

	@FindBy(name="Name")
	WebElement name;

	@FindBy(name="description")
	WebElement desc;

	@FindBy(name="phone_number_1")
	WebElement phno1;

	@FindBy(name="extension_1")
	WebElement ext1;

	@FindBy(name="Mobile Number 2")
	WebElement phno2;

	@FindBy(name="extension_2")
	WebElement ext2;

	@FindBy(name="Serial No")
	WebElement Slno;

	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnadd;

	public void clickImprest() 
	{
		imprests.click();
	}
	
	public void clickAddImprest() 
	{
		addimprest.click();
	}
	
	public void setName(String Names) 
	{
		name.sendKeys(Names);
	}
	
	public void setDesc(String des)
	{
		desc.sendKeys(des);
	}
	
	public void setPhno1(String ph1) 
	{
		phno1.sendKeys(ph1);
	}
	
	public void setExtension1(String exte1)
	{
		ext1.sendKeys(exte1);
	}
	
	public void setPhno2(String ph2)
	{
		phno2.sendKeys(ph2);
	}
	
	public void setExtension2(String exte2) 
	{
		ext2.sendKeys(exte2);
	}
	
	public void setSlno(String slno) 
	{
		Slno.sendKeys(slno);
	}
	
	public void clickAdd()
	{
		btnadd.click();
	}

}
