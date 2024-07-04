package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditRole
{
	public EditRole(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/role.svg']")
	WebElement roles;
	
	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement btnedit;
	
	@FindBy(name="name")
	WebElement role;
	
	@FindBy(name="description")
	WebElement desc;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnsave;
	
	public void clickRoles()
	{
		roles.click();
	}
	
	public void clickEdit()
	{
		btnedit.click();
	}
	
	public void setRole(String Role) 
	{
		while(!role.getAttribute("Value").isEmpty()) {
			role.sendKeys(Keys.BACK_SPACE);
		}

		role.sendKeys(Role);
	}
	public void setDesc(String des) 
	{
		while(!desc.getAttribute("Value").isEmpty()) {
			desc.sendKeys(Keys.BACK_SPACE);
		}
		role.sendKeys(des);
	}
	
	public void clickSave()
	{
		btnsave.click();
	}
}
