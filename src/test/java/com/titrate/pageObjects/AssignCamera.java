package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignCamera 
{
	public AssignCamera(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/imprest.svg']")
	WebElement imprests;

	@FindBy(xpath="(//*[@data-testid='AddAPhotoIcon'])[1]")
	WebElement assigncam;
	
	@FindBy(xpath="(//*[@type='checkbox'])[2]")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnassign;
	
	public void clickImprest() 
	{
		imprests.click();
	}
	
	public void clickAssignCam() 
	{
		assigncam.click();
	}
	
	public void clickCheckBox()
	{
		checkbox.click();
	}
	
	public void clickAssign() 
	{
		btnassign.click();
	}
}
