package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRole 
{
	public DeleteRole(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/role.svg']")
	WebElement roles;
	
	@FindBy(xpath="(//*[@data-testid=\"DeleteForeverIcon\"])[1]")
	WebElement btndelete;
	
	public void clickRoles() 
	{
		roles.click();
	}
	
	public void clickDelete() 
	{
		btndelete.click();
	}
}
