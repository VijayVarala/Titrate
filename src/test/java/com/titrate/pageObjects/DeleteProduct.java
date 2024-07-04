package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
	public DeleteProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/role.svg']")
	WebElement producticon;

	@FindBy(xpath="(//*[@data-testid='DeleteForeverIcon'])[1]")
	WebElement delete;
	
	public void clickProductIcon()
	{
		producticon.click();
	}
	
	public void clickDelete() {
		delete.click();
	}

}
