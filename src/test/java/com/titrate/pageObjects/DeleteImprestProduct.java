package com.titrate.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteImprestProduct {
	DeleteImprestProduct(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='/src/assets/sidebar-icons/imprestproduct.svg']")
	WebElement imprestproducticon;
	
	@FindBy(xpath="(//*[@data-testid='DeleteForeverIcon'])[1]")
	WebElement delete;
	
	public void clickImprestProductIcon() {
		imprestproducticon.click();
	}
	public void clickDelete() {
		delete.click();
	}

}
