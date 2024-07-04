package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteImprest 
{
	public DeleteImprest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/imprest.svg']")
	WebElement imprests;

	@FindBy(xpath="(//*[@data-testid='DeleteForeverIcon'])[1]")
	WebElement btndelete;
	
	public void clickImprest() 
	{
		imprests.click();
	}
	
	public void clickDelete()
	{
		btndelete.click();
	}
}
