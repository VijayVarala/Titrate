package com.titrate.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCamera 
{
	public WebDriver driver;
	public EditCamera(WebDriver rdriver) 
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@src='/src/assets/addCam1.svg']")
	WebElement camIcon;

	@FindBy(xpath=("(//*[@data-testid=\"EditNoteIcon\"])[1]"))
	WebElement btnEdit;

	@FindBy(name="camera_name")
	WebElement txtCamName;

	@FindBy(xpath="//*[@data-testid='AddCircleOutlinedIcon']")
	WebElement saveBtn;



	public void clickCamIcon() 
	{
		camIcon.click();
	}

	public void clickEditButton()
	{
		btnEdit.click();
	}

	public void clearCamName() 
	{

		while(!txtCamName.getAttribute("Value").isEmpty()) {
			txtCamName.sendKeys(Keys.BACK_SPACE);
		}

	}

	public void editCamName(String camname) 
	{
		txtCamName.sendKeys(camname);
		System.out.println();
	}

	public void clickSave() 							
	{
		saveBtn.click();
	}

}

