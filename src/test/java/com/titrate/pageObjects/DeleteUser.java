package com.titrate.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUser 
{
	public DeleteUser(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@src='/src/assets/sidebar-icons/usersgroup.svg']")
	WebElement users;
	
	@FindBy(xpath="(//*[@data-testid='DeleteForeverIcon'])[1]")
			WebElement btndelete;
	
	public void clickUsers()
	{
		users.click();
	}
	
	public void clickDelete()
	{
		btndelete.click();
	}

}
