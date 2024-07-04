package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRole 
{
	public AddRole(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/role.svg']")
	WebElement roles;
	
	@FindBy(xpath="//img[@src='/src/assets/add.svg']")
	WebElement addrole;
	
	@FindBy(name="name")
	WebElement role;
	
	@FindBy(name="description")
	WebElement desc;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnadd;
	
	public void clickRoles()
	{
		roles.click();
	}
	
	public void clickAddRole() 
	{
		addrole.click();
	}
	
	public void setRole(String Role)
	{
		role.sendKeys(Role);
	}
	
	public void setDesc(String des) 
	{
		desc.sendKeys(des);
	}
	
	public void clickAdd()
	{
		btnadd.click();
	}
}
