package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditImprest 
{
	public EditImprest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/imprest.svg']")
	WebElement imprests;
	
	@FindBy(xpath="(//*[@data-testid='EditNoteIcon'])[1]")
	WebElement btnedit;
	
	@FindBy(name="Name")
	WebElement name;
	
	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement btnsave;
	
	public void clickImprest()
	{
		imprests.click();
	}
	
	public void clickEdit()
	{
		btnedit.click();
	}
	
	public void setName(String Name)
	{
		while(!name.getAttribute("Value").isEmpty()) {
		name.sendKeys(Keys.BACK_SPACE);
	}

		name.sendKeys(Name);
	}
	
	public void clickAdd() 
	{
		btnsave.click();
	}


}
