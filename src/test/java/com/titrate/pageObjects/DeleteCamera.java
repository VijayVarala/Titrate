package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCamera 
{
	public DeleteCamera(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@src='/src/assets/addCam1.svg']")
	WebElement camIcon;
	
	@FindBy(xpath="(//*[@data-testid='DeleteForeverIcon'])[1]")
	WebElement deleteBtn;
	
	public void clickCamIcon()
	{
		camIcon.click();
	}
	
	public void clickDelete() 
	{
		deleteBtn.click();
	}
	

}
