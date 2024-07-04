package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUser 
{
	public EditUser(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@src='/src/assets/sidebar-icons/usersgroup.svg']")
	WebElement users;

	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement btnedit;

	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="phone_number")
	WebElement phoneno;

	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnAdd;

	public void clickUsers()
	{
		users.click();
	}
	
	public void clickEdit() 
	{
		btnedit.click();
	}
	
	public void editFirstName(String fname) {
	while(!firstname.getAttribute("Value").isEmpty()) {
		firstname.sendKeys(Keys.BACK_SPACE);
	}
	
		firstname.sendKeys(fname);
	}
	
	public void editphno(String phno) {
		while(!phoneno.getAttribute("Value").isEmpty())
		{
			phoneno.sendKeys(Keys.BACK_SPACE);
		}
		
		phoneno.sendKeys(phno);
		} 
	
	public void clickAdd()
	{
		btnAdd.click();
	}


}
